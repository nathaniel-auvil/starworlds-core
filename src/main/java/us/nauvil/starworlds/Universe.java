package us.nauvil.starworlds;


public class Universe {
    private static int WIDTH = 3;
    private static int HEIGHT = 3;

    private Sector[][] sectors;
    private String name;

    public Universe() {
        sectors = new Sector[WIDTH][HEIGHT];
    }


    public static Universe createRandom(String name) {
        Universe u = new Universe();
        u.name = name;

        for (int x = 0; x < WIDTH; x++) {
            for (int y = 0; y < HEIGHT; y++) {
                u.sectors[x][y] = Sector.createRandom("Sector-" + x + "." + y);
            }
        }

        return u;
    }

    @Override
    public String toString() {
        String s = "";

        for (int x = 0; x < WIDTH; x++) {
            for (int y = 0; y < HEIGHT; y++) {
                s += this.sectors[x][y];
                s += "\n";
            }
        }

        return s;
    }

    public String textUI() {
        String s = "";
/*
        for (int x = 0; x < WIDTH; x++) {
            for (int y = 0; y < HEIGHT; y++) {
                s += this.sectors[x][y].textUI();
            }

            s += "\n";
        }
*/
        return s;
    }
}
