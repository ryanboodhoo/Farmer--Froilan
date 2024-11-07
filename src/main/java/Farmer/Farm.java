package Farmer;

import java.util.ArrayList;
import java.util.List;

public class Farm {
    private List<Stable> stables;
    private List<ChickenCoop> chickenCoops;
    private FarmHouse farmHouse;
    private Field field;

    public Farm(FarmHouse farmHouse, Field field) {
        this.stables = new ArrayList<>();
        this.chickenCoops = new ArrayList<>();
        this.farmHouse = farmHouse;
        this.field = field;
    }

    public void addStable(Stable stable) {
        stables.add(stable);
    }

    public void addChickenCoop(ChickenCoop chickenCoop) {
        chickenCoops.add(chickenCoop);
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

    public Field getField() {
        return field;
    }
}
