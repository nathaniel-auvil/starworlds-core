package us.nauvil.starworlds;

import us.nauvil.starworlds.ships.*;
import java.util.List;

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

        if( logger.isDebugEnabled() ) {
            logger.debug("sending mining fleet: " + ships );
        }

        if(ships.size() == 0) {
            logger.info("no ships passed to sendMiningFleet()");
            return;
        }

    }



}
