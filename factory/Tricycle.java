package factory;

public class Tricycle extends Bike
{
    public Tricycle()
    {
        this.name = "Tricycle";
        this.price = 49.99;
        this.numWheels = 3;
        this.hasPedals = true;
        this.hasTrainingWheels = false;  // I guess the back wheel don't count.
    }
}
