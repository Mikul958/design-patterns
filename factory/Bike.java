package factory;

public abstract class Bike
{
    protected String name;
    protected double price;
    protected int numWheels;
    protected boolean hasPedals;
    protected boolean hasTrainingWheels;

    public String assembleBike()
    {
        String output = "";

        output += createFrame();
        output += addWheels();
        if (hasPedals)
            output += addPedals();
        
        return output;
    }
    private String createFrame()
    {
        return "- Assembling " + name + " frame\n";
    }
    private String addWheels()
    {
        String output = "- Adding " + numWheels + " wheel(s)\n";
        if (hasTrainingWheels)
            output += "- Adding training wheels\n";
        return output;
    }
    private String addPedals()
    {
        return "- Adding pedals\n";
    }
    public double getPrice()
    {
        return price;
    }
}
