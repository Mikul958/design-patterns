package factory;

public class KidsBike extends Bike
{
    public KidsBike()
    {
        this.name = "Kids Bike";
        this.price = 169.99;
        this.numWheels = 2;  // Does not include training wheels.
        this.hasPedals = true;
        this.hasTrainingWheels = true;    
    }    
}
