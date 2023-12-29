package us.nauvil.starworlds;

public class Resource {

    private String name;
    private double percentage;
    private double odds;
    private double derivedCeiling;

    public Resource(String name, double percentage) {
        this.name = name;
        this.percentage = percentage;
        this.odds = percentage / 100;
    }

    public String getName() {
        return this.name;
    }

    public double getPercentage() {
        return this.percentage;
    }

    public double getOdds() {
        return this.odds;
    }

    public void setDerivedCeiling(double value) {
        this.derivedCeiling = value;
    }

    @Override
    public String toString() {
        return "Resource [name=" + name + ", percentage=" + percentage + ", odds=" + odds + ", derivedCeiling="
                + derivedCeiling + "]";
    }

}
