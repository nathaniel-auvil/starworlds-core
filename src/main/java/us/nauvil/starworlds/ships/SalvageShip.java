package us.nauvil.starworlds.ships;

public class SalvageShip extends Ship {

    private Integer salvageRate;

    public SalvageShip( Integer speed, Integer armor, Integer cargo, Integer salvageRate ) {
        super( speed, armor, cargo );
        this.salvageRate= salvageRate;
    }

    public Integer getSalvageRate() {
        return this.salvageRate;
    }
}
