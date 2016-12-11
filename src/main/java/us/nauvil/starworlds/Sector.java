package us.nauvil.starworlds;

import java.util.ArrayList;
import java.util.List;

public class Sector {
    private static int MIN_SOLAR_SYSTEMS = 5;
    private static int MAX_SOLAR_SYSTEMS = 20;

    private String name;
    private List<SolarSystem> solarSystems;
    
    
    public Sector() {
        this.solarSystems = new ArrayList<SolarSystem>();
    }


    public static Sector createRandom(String name) {
        Sector u = new Sector();
        u.name = name;

        int x = (int) (Math.random() * MAX_SOLAR_SYSTEMS);
        x = Math.max(x, MIN_SOLAR_SYSTEMS);

        for (int i = 0; i < x; i++) {
            u.solarSystems.add(SolarSystem.createRandom("Sector-" + i));
        }

        return u;
    }

    @Override
    public String toString() {
        return "Sector{" +
                "name='" + name + '\'' +
                ", solarSystems=" + solarSystems +
                '}';
    }
}
