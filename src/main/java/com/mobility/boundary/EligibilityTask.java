package com.mobility.boundary;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.*;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.waseel.Uhud;

public class EligibilityTask implements Runnable {

	private final Credentials creds;
	private final ProvidersResult.ProviderViewShort provider;
	private final CountDownLatch latch;
	private static final Logger LOGGER = Logger.getLogger(EligibilityTask.class.getName() );

	public EligibilityTask(
			ProvidersResult.ProviderViewShort providerViewSection,
			Credentials creds, CountDownLatch latch) {
		this.provider = providerViewSection;
		this.creds = creds;
		this.latch = latch;
	}

	@Override
	public void run() {

		try {
			
			//System.out.println("thread started . . . "
			//		+ provider.getId() + provider.getName());
			Uhud service = new Uhud();
			EligibilityResult result = (EligibilityResult) new Eligibility.Dispatcher(
					creds, provider.getId()).port(
					service.getUhudInterfacePort()).dispatch();
			provider.setCoverageResult(result.getStatus());
			/*long delay = ThreadLocalRandom.current().nextInt(5, 30 + 1);
			System.out.println("delay: " + delay);
			if (delay > 10){
				throw new InterruptedException();
			}
			TimeUnit.SECONDS.sleep(delay);*/
			//System.out.println("thread result . . . "
			//		+ provider.getId() + provider.getName() + "/"
			//		+ provider.getCoverageResult());
		} catch (Exception e) {
			//System.out.println("thread result . . . "
			//		+ provider.getId() + provider.getName() + "/"
			//		+ "FAILURE");
			LOGGER.log(Level.SEVERE, e.getLocalizedMessage());
			provider.setCoverageResult("FAILURE");
		}
		latch.countDown();
	}

}
