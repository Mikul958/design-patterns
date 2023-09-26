package factory;

/**
 * A class representing a tricycle.
 * @author Michael Pikula
 */
public class Tricycle extends Bike
{
    /**
     * Creates a bike with the type of "Tricycle" and hard-coded attributes.
     */
    public Tricycle()
    {
        this.name = "Tricycle";
        this.price = 49.99;
        this.numWheels = 3;
        this.hasPedals = true;
        this.hasTrainingWheels = false;  // I guess the back wheels don't count.
    }
}
