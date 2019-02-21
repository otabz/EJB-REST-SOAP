package com.mobility.boundary;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.mobility.entity.Location.City;
import com.waseel.Uhud;


@Stateless
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Path("/")
public class SearchResource {
	
	@Inject
	Search search;
	
	@GET
	@Path("/city/all")
	public Result cities() {
		try {
			return new CityResult(search.fetchAllCities());
		} catch (Exception e) {
			e.printStackTrace();
			return new Result.NoResult();
		}
	}
	
	
	static class CityResult extends Result {
		
		public CityResult(List<City> cities) {
			super(Result.Outcome.SUCCESS, "");
			this.cities = cities;
			// TODO Auto-generated constructor stub
		}
		
		@Override
		public String getOutcome() {
			if (getCities().isEmpty()) {
				return Result.Outcome.FAILURE.value();
			}
			return outcome;
		}

		@Override
		public String getMessage() {
			if (getCities().isEmpty()) {
				return "Sorry! Found provider(s) 0.";
			}
			return message;
		}
		
		private List<City> cities;

		public List<City> getCities() {
			if (cities == null) {
				this.cities = new ArrayList<City>();
			}
			return cities;
		}

		public void setCities(List<City> cities) {
			this.cities = cities;
		}
		
	}
}
