package us.nauvil.starworlds;


import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class PlanetTest {

    Logger logger = LoggerFactory.getLogger( PlanetTest.class );


    @Test
    public void testCreate() {
        Planet p = Planet.createRandom(1L);
       // System.out.println(p);

       
        logger.debug(p.toString());
    }

}
