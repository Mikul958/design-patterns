package factory;

/**
 * A class representing a Strider balance bicycle.
 * @author Michael Pikula
 */
public class Strider extends Bike
{
    /**
     * Creates a bike with the type of "Strider" and hard-coded attributes.
     */
    public Strider()
    {
        this.name = "Strider";
        this.price = 109.99;
        this.numWheels = 2;
        this.hasPedals = false;
        this.hasTrainingWheels = false;    
    }
}
