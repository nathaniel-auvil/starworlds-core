package us.nauvil.starworlds.ships;

public abstract class Ship {

    private Integer speed;
    private Integer armor;
    private Integer cargo;

    
    public Ship( Integer speed, Integer armor, Integer cargo ) {
        this.speed= speed;
        this.armor= armor;
        this.cargo= cargo;
    }

    public Integer getSpeed() {
        return this.speed;
    }

    public Integer getArmor() {
        return this.armor;
    }

    public Integer getCargo() {
        return this.cargo;
    }
}
