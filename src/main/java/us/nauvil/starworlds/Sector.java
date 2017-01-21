package us.nauvil.starworlds;

public class Sector {
    private static int WIDTH = 5;
    private static int HEIGHT = 5;

    private static int MIN_SOLAR_SYSTEMS = 5;
    private static int MAX_SOLAR_SYSTEMS = 20;

    private String name;
    private SolarSystem[][] solarSystems;


    public Sector() {

        //int x = (int) (Math.random() * MAX_SOLAR_SYSTEMS);
       // x = Math.max(x, MIN_SOLAR_SYSTEMS);

        this.solarSystems = new SolarSystem[WIDTH][HEIGHT];
    }


    public static Sector createRandom(String name) {
        Sector u = new Sector();
        u.name = name;

        for (int x = 0; x < WIDTH; x++) {
            for (int y = 0; y < HEIGHT; y++) {
                SolarSystem s = SolarSystem.createRandom("System-" + x + "." + y);
                if (s.getNumberOfPlanets() > 0) u.solarSystems[x][y] = s;
            }
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

    public String getName() {
        return this.name;
    }

    public SolarSystem[][] getSolarSystems() {
        return solarSystems;
    }
}
