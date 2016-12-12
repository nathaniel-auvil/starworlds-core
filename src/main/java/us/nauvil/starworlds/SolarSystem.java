package us.nauvil.starworlds;


import java.util.ArrayList;
import java.util.List;

public class SolarSystem {

    private static int MAX_PLANETS = 6;

    private Long id;
    private String name;
    private List<Planet> planets;


    public SolarSystem() {
        this.planets = new ArrayList<Planet>();
    }


    public static SolarSystem createRandom(String name) {
        SolarSystem s = new SolarSystem();
        s.name = name;

        int x = (int) (Math.random() * MAX_PLANETS);
        for (long i = 0; i < x; i++) {
            s.planets.add(Planet.createRandom(i));
        }

        return s;
    }

    public int getNumberOfPlanets() {
        return this.planets.size();
    }

    @Override
    public String toString() {
        return "SolarSystem{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", planets=" + planets +
                '}';
    }
}
