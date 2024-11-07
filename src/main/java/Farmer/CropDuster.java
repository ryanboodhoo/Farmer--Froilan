
public class CropDuster extends FarmVehicle implements Aircraft {
    public CropDuster() {}
    @Override
    public boolean canFly() {
        return true;
    }
    @Override
    public void makeNoise() {
    }
    public boolean fertilizesCropRow(){
        return true;
    }
}
