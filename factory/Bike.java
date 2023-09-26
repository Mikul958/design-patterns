package factory;

/**
 * A class representing a bicycle.
 * @author Michael Pikula
 */
public abstract class Bike
{
    protected String name;
    protected double price;
    protected int numWheels;
    protected boolean hasPedals;
    protected boolean hasTrainingWheels;

    /**
     * Creates a string detailing the creation of the current bike.
     * @return A string containing the steps of the current bike's creation.
     */
    public String assembleBike()
    {
        String output = "";

        output += createFrame();
        output += addWheels();
        if (hasPedals)
            output += addPedals();
        
        return output;
    }
    /**
     * Creates a string representing that the bike's frame is being created.
     * @return A string stating the current bike's frame is being constructed.
     */
    private String createFrame()
    {
        return "- Assembling " + name + " frame\n";
    }
    /**
     * Creates a string representing that the bike's wheels are being added.
     * @return A string stating the current bike's number of wheels are being added.
     */
    private String addWheels()
    {
        String output = "- Adding " + numWheels + " wheel(s)\n";
        if (hasTrainingWheels)
            output += "- Adding training wheels\n";
        return output;
    }
    /**
     * Creates a string representing that the bike's pedals are being added.
     * @return A string stating that pedals are being added.
     */
    private String addPedals()
    {
        return "- Adding pedals\n";
    }
    /**
     * Gets the price of the current bike.
     * @return The price of the current bike.
     */
    public double getPrice()
    {
        return price;
    }
}
