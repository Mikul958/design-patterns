package factory;

/**
 * A class representing a kids' bicycle.
 * @author Michael Pikula
 */
public class KidsBike extends Bike
{
    /**
     * Creates a bike with the type of "Kids Bike" and hard-coded attributes.
     */
    public KidsBike()
    {
        this.name = "Kids Bike";
        this.price = 169.99;
        this.numWheels = 2;  // Does not include training wheels.
        this.hasPedals = true;
        this.hasTrainingWheels = true;    
    }    
}
