package us.nauvil.starworlds;


import org.junit.Test;

public class SectorTest {

    @Test
    public void testCreate() {
        Sector s = Sector.createRandom("test");
        System.out.println(s);


        //System.out.println(s.textUI());
    }

}
