package us.nauvil.starworlds;

import org.junit.Test;

public class SolarSystemTest {

	@Test
	public void testCreate() {
		SolarSystem s = SolarSystem.createRandom("System-1");
		System.out.println(s);
	}

}
