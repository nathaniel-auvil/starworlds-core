package us.nauvil.starworlds;


import java.util.ArrayList;
import java.util.List;

public class Universe {
    private static int MIN_SOLAR_SYSTEMS = 5;
    private static int MAX_SOLAR_SYSTEMS = 20;

    private List<SolarSystem> solarSystems;

    private String name;

    public Universe() {
        this.solarSystems = new ArrayList<SolarSystem>();
    }


    public static Universe createRandom(String name) {
        Universe u = new Universe();
        u.name = name;

        int x = (int) (Math.random() * MAX_SOLAR_SYSTEMS);
        x = Math.max(x, MIN_SOLAR_SYSTEMS);

        for (int i = 0; i < x; i++) {
            u.solarSystems.add(SolarSystem.createRandom("System-" + i));
        }

        return u;
    }

    @Override
    public String toString() {
        return "Universe{" +
                "solarSystems=" + solarSystems +
                ", name='" + name + '\'' +
                '}';
    }
}
