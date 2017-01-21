package us.nauvil.starworlds.core;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class TimeManager {

	private static ScheduledExecutorService SCHEDULER = Executors.newScheduledThreadPool(1);
	private List<TimedEvent> timedEvents;

	public TimeManager() {
		this.timedEvents = new ArrayList<TimedEvent>();
	}

	public static void main(String[] args) throws InterruptedException {

		TimedEvent t = new TimedEvent("Foundation", 3);
		TimedEvent t2 = new TimedEvent("Barracks", 6);

		TimeManager timeManager = new TimeManager();
		timeManager.schedule(t);
		timeManager.schedule(t2);

		Thread.sleep(20000L);
		SCHEDULER.shutdown();
	}

	public void schedule(TimedEvent timedEvent) {
		ScheduledFuture<?> beeperHandle = SCHEDULER.schedule(timedEvent, timedEvent.getSeconds(), TimeUnit.SECONDS);

		System.out.println(new Timestamp(System.currentTimeMillis()) + "\tSCHEDULED\t" + timedEvent);
	}
}