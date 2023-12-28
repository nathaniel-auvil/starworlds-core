package us.nauvil.starworlds;

import java.util.List;

import org.junit.Test;

import java.util.ArrayList;
import us.nauvil.starworlds.ships.*;


public class StarWorldsTest {


    @Test
    public void mining() {
        List<Ship> ships= new ArrayList<Ship>();
        ships.add( new MiningShip(10, 10, 1000, 2) );

         StarWorlds s= new StarWorlds();

         for( int x=0; x < 20; x++ ) {
            s.sendMiningFleet(ships);
         }
    }
}
