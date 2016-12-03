package us.nauvil.starworlds;


import org.junit.Test;

public class PlanetTest {

    @Test
    public void testCreate() {
        Planet p = Planet.createRandom();
        System.out.println(p);
    }

}
