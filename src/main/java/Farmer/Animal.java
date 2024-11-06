package Farmer;
//Animal (Inherits from NoiseMaker and Eater)
public abstract class Animal implements NoiseMaker, Eater {

    @Override
    public abstract void eat(Edible edible);

    @Override
    public abstract void makeNoise();
}
