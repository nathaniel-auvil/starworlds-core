package us.nauvil.starworlds.ships;

public class MiningShip extends Ship {

    private Integer miningRate;


    public MiningShip( Integer speed, Integer armor, Integer cargo, Integer miningRate ) {
        super( speed, armor, cargo );
        this.miningRate= miningRate;
    }

    public Integer getMiningRate() {
        return this.miningRate;
    }
}
