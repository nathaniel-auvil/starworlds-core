package us.nauvil.starworlds;

import us.nauvil.starworlds.ships.*;
import java.util.List;
import java.util.Random;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class StarWorlds {
    
    private static Logger logger = LoggerFactory.getLogger( StarWorlds.class );

    public static void main(String[] args) {

        //StarWorlds starWorlds= new StarWorlds();

    }



    /*******************************************************************************
     * 
     * @param ships
     *******************************************************************************/
    public void sendMiningFleet( List<Ship> ships ) {

        /* 
        if( logger.isDebugEnabled() ) {
            logger.debug("sending mining fleet: " + ships );
        }

        */
        try {
            Thread.sleep(50);
        }
        catch(Throwable t ) {
            logger.error(null, t);
        }

        if(ships.size() == 0) {
            logger.info("no ships passed to sendMiningFleet()");
            return;
        }

        Random r = new Random();
        int low = 0;
        int high = 100;
        int result = r.nextInt(high-low) + low;

        

        /***
        if( logger.isDebugEnabled() ) {
            logger.debug("result: " + result );
        }
        **/

        if( result < 5 ) {
            logger.debug( "found nothing " + result );
        }
        else if( result < 40 ) {
            logger.debug( "crystal " + result );
        }
        else if( result < 95 ) {
            logger.debug( "metal " + result );
        }
        else {
            logger.debug( "exotics " + result );
        }
    }



}
