package com.mobility.boundary;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

import javax.enterprise.context.RequestScoped;

import com.mobility.boundary.ProvidersResult.ProviderViewShort;

@RequestScoped
public class EligibilityLatch {

	@SuppressWarnings("unchecked")
	public void find(boolean coverage, Credentials creds,
			 Result result) throws InterruptedException {
		if (!coverage) {
			return;
		}
		if (!(result instanceof ProvidersResult)) {
			return;
		}
		/*if (!(((ProvidersResult)result).getResults() instanceof List<?>) ) {
			return;
		}*/
		List<ProviderViewShort> list = new LinkedList<ProvidersResult.ProviderViewShort>();
		if (((ProvidersResult)result).getResults() instanceof Map) {
			Map blocks = (Map) ((ProvidersResult)result).getResults();
			Iterator<?> providers = blocks.values().iterator();
			while(providers.hasNext()) {
				List<ProvidersResult.ProviderViewShort> provider = (List<ProviderViewShort>) providers.next();
				list.addAll(provider);
			}
		}
		
		if (list.isEmpty()) {
			list = ((List<ProviderViewShort>)((ProvidersResult)result).getResults());
		}

		final CountDownLatch latch = new CountDownLatch(list.size());
		for (int i = 0; i < list.size(); i++) {
			new Thread(new EligibilityTask(list.get(i), creds, latch), "ELIGIBILITY")
					.start();
			TimeUnit.SECONDS.sleep(1);
		}

		latch.await(30, TimeUnit.SECONDS);
		/*ExecutorService ecs = Executors.newCachedThreadPool();
		List<Future<Double>> results = new LinkedList<Future<Double>>();
		for(int i=0; i<providers.size(); i++) {
			results.add(ecs.submit(new Callable<Double>() {

				@Override
				public Double call() throws Exception {
					
					return Math.random();
				}
			}));
		}
		Double sum = 0.0;
		for (Future<Double> future : results) {
		      try {
				sum += future.get();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}*/
	}
}
