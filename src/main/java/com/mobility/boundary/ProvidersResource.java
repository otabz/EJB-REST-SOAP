package com.mobility.boundary;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriInfo;

import com.mobility.DateTimeUtil;
import com.mobility.entity.Location;
import com.waseel.TransactionSubTypeST;
import com.waseel.Uhud;

@Stateless
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Path("/")
public class ProvidersResource {

	private static final Logger LOGGER = Logger
			.getLogger(ProvidersResource.class.getName());
	@Inject
	Providers providers;
	@Inject
	EligibilityLatch coverages;

	@POST
	public Result list(@QueryParam("nextPageToken") int nextPageToken,
			@QueryParam("city") String city,
			@QueryParam("coverage") boolean coverage, Credentials creds,
			@Context UriInfo uri) {
		try {
			Result result = providers.allAsResult(nextPageToken, city,
					coverage, uri);
			coverages.find(coverage, creds, result);
			return result;
		} catch (Exception e) {
			LOGGER.log(Level.SEVERE, e.getLocalizedMessage());
			return new Result.NoResult();
		}
	}

	@POST
	@Path("/nearbysearch")
	public Result searchNearBy(
			@QueryParam("location") Location.Geometry location,
			@QueryParam("time") TimeParam time,
			@QueryParam("network") String payer,
			@QueryParam("category") String category,
			@QueryParam("open") boolean openNow,
			@QueryParam("nextPageToken") int nextPageToken,
			@QueryParam("coverage") boolean coverage, Credentials creds,
			@Context UriInfo uri) {

		try {
			time = time == null ? new TimeParam(DateTimeUtil.todayDayOfWeek(),
					DateTimeUtil.nowTime24Hour()) : time;
			ProvidersResult result = providers.searchNearByAsResult(
					nextPageToken, location.getLat(), location.getLng(),
					"rankedByDistance", payer, category, openNow,
					String.valueOf(time.getDay()), time.getTime(), coverage,
					uri);
			coverages.find(coverage, creds, result);
			return result;
		} catch (Exception e) {
			LOGGER.log(Level.SEVERE, e.getLocalizedMessage());
			return new Result.NoResult();
		}
	}

	@GET
	@Path("/{id}")
	public Result details(@PathParam("id") String id, @Context UriInfo uri) {
		try {
			ProviderDetailsResult result = providers.providerAsResult(id, uri);
			return result;
		} catch (Exception e) {
			LOGGER.log(Level.SEVERE, e.getLocalizedMessage());
			return new Result.NoResult();
		}
	}

	@POST
	@Path("/{id}/check")
	public Result check(Credentials creds, @PathParam("id") String provider) {
		try {
			Uhud service = new Uhud();
			Result result = new Eligibility.Dispatcher(creds, provider).port(
					service.getUhudInterfacePort()).dispatch();
			return result;
		} catch (Exception e) {
			LOGGER.log(Level.SEVERE, e.getLocalizedMessage());
			return new Result.NoResult();
		}
	}

	@POST
	@Path("/{id}/inquire")
	public Result inquireSummary(Criteria criteria,
			@PathParam("id") String provider) {
		try {
			Uhud service = new Uhud();
			Result result = new Approval.Dispatcher(criteria, provider).port(
					service.getUhudInterfacePort()).dispatch();
			return result;
		} catch (Exception e) {
			LOGGER.log(Level.SEVERE, e.getLocalizedMessage());
			return new Result.NoResult();
		}
	}

	@POST
	@Path("/{id}/{reference}/inquire")
	public Result inquireDetail(Criteria criteria,
			@PathParam("id") String provider,
			@PathParam("reference") String reference) {
		try {
			// throw new Exception();
			Uhud service = new Uhud();
			Result result = new Approval.Dispatcher(criteria, provider,
					reference).port(service.getUhudInterfacePort()).dispatch();
			return result;
		} catch (Exception e) {
			LOGGER.log(Level.SEVERE, e.getLocalizedMessage());
			return new Result.NoResult();
		}
	}

	@POST
	@Path("/{id}/{start}/{end}/checkin")
	public EligibilityApprovalResult checkAndInquire(final Credentials creds,
			@PathParam("id") final String provider,
			@PathParam("start") final String start,
			@PathParam("end") final String end) {
		ExecutorService executor = null;
		try {
			executor = Executors.newSingleThreadExecutor();
			final Uhud service = new Uhud();
			Future<Result> check = executor.submit(new Callable<Result>() {

				@Override
				public Result call() throws Exception {
					Criteria criteria = new Criteria(creds.getCard(),
							new Criteria.Payload(start, end));
					Result result = new Approval.Dispatcher(criteria, provider)
							.port(service.getUhudInterfacePort()).dispatch();

					return result;
				}
			});

			Result eligibility = new Eligibility.Dispatcher(creds, provider).port(
					service.getUhudInterfacePort()).dispatch();
			Result approval = check.get();
			return new EligibilityApprovalResult(eligibility, approval);
		} catch (Exception e) {
			LOGGER.log(Level.SEVERE, e.getLocalizedMessage());
			return new EligibilityApprovalResult.NoResult();
		} finally {
			executor.shutdownNow();
		}
	}

	@GET
	@Path("/textsearch")
	public Result searchByKeyword(@QueryParam("city") String city,
			@QueryParam("q") String query,
			@QueryParam("nextPageToken") int nextPageToken, @Context UriInfo uri) {
		try {
			Result result = providers.searchByTextAsResult(nextPageToken,
					query, city, uri);
			return result;
		} catch (Exception e) {
			LOGGER.log(Level.SEVERE, e.getLocalizedMessage());
			return new Result.NoResult();
		}
	}
}
