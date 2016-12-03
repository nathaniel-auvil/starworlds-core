package us.nauvil.starworlds;


public class Planet {

    private Long id;
    private String name;
    private Integer metal;
    private Integer gas;


    public static Planet createRandom() {
        Planet p = new Planet();
        p.id = (long) (Math.random() * 100);
        p.name = "Planet-" + p.id;
        p.metal = (int) (Math.random() * 10);
        p.gas = (int) (Math.random() * 10);
        return p;
    }

    @Override
    public String toString() {
        return "Planet{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", metal=" + metal +
                ", gas=" + gas +
                '}';
    }
}
