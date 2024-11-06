package Farmer;

public class Cornstalk extends Crop implements Edible{


    public Cornstalk(boolean harvested, boolean fertilized) {
        super(harvested, fertilized);
    }

    @Override
    public Edible yield() {
        EarCorn earCorn = null;
        if (this.isHarvested() && this.isFertilized()){
            earCorn = new EarCorn();
        } else {
            System.out.println("cornstalk is not edible");
        }
        return earCorn;
    }
}