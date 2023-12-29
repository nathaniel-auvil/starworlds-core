package us.nauvil.starworlds;

public class Resource {

    private String name;
    private double odds;

    public Resource(String name, double odds) {
        this.name = name;
        this.odds = odds;
    }

    public String getName() {
        return this.name;
    }

    public double getOdds() {
        return this.odds;
    }

    @Override
    public String toString() {
        return "Resource [name=" + name + ", odds=" + odds + "]";
    }

}
