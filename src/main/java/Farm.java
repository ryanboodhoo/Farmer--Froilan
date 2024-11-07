import java.util.ArrayList;
import java.util.List;

public class Farm {
    private List<Stable> stables;
    private List<ChickenCoop> chickenCoops;
    private FarmHouse farmHouse;

    public Farm() {
        this.stables = new ArrayList<>();
        this.chickenCoops = new ArrayList<>();
        this.farmHouse = new FarmHouse();
    }

    public void addStable(Stable stable) {
        stables.add(stable);
    }

    public void addChickenCoop(ChickenCoop chickenCoop) {
        chickenCoops.add(chickenCoop);
    }

    public void setFarmHouse(FarmHouse farmHouse) {
        this.farmHouse = farmHouse;
    }

    public List<Stable> getStables() {
        return stables;
    }

    public List<ChickenCoop> getChickenCoops() {
        return chickenCoops;
    }

    public FarmHouse getFarmHouse() {
        return farmHouse;
    }
}

