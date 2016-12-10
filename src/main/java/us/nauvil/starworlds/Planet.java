package us.nauvil.starworlds;


public class Planet {

    private Long id;
    private String name;
    private Integer metal;
    private Integer gas;


    public static Planet createRandom(Long id) {
        Planet p = new Planet();
        //p.id = (long) (Math.random() * 1000);
        p.id = id;
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
