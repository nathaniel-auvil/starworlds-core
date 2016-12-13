package us.nauvil.starworlds.text;


import us.nauvil.starworlds.Sector;
import us.nauvil.starworlds.SolarSystem;

public class SectorText {


    public String textUI(Sector sector) {
        String s = "";

        s += "   ";
        for (int x = 0; x < sector.getSolarSystems().length; x++) {
            s += "  " + x + "  ";
        }
        s += "\n";

        for (int x = 0; x < sector.getSolarSystems().length; x++) {

            s += "" + x + "  ";

            for (int y = 0; y < sector.getSolarSystems()[x].length; y++) {

                SolarSystem ss = sector.getSolarSystems()[x][y];
                if (ss != null) {
                    s += "[ " + ss.getNumberOfPlanets() + " ]";
                } else {
                    s += "[   ]";
                }
            }

            s += "\n";
        }

        return s;
    }
}
