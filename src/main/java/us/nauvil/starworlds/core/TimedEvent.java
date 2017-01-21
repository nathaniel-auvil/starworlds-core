package us.nauvil.starworlds.core;

import java.sql.Timestamp;

public class TimedEvent implements Runnable {

	private String name;
	private long seconds;

	private TimeManager timeManager;

	public TimedEvent(String name, long seconds) {
		this.name = name;
		this.seconds = seconds;
	}

	@Override
	public String toString() {
		return "TimedEvent{" + "name='" + name + '\'' + ", seconds=" + seconds + '}';
	}

	public String getName() {
		return name;
	}

	public long getSeconds() {
		return seconds;
	}

	protected void setTimeManager(TimeManager timeManager) {
		this.timeManager = timeManager;
	}

	public void run() {
		System.out.println(new Timestamp(System.currentTimeMillis()) + "\tEXECUTED\t" + this);
	}
}
