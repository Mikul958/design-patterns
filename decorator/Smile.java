package decorator;

/**
 * A class created to add a smile to the specified vehicle.
 * @author Michael Pikula
 */
public class Smile extends VehicleDecorator
{
    /**
     * Adds a smile to the passed in vehicle by integrating the information found in smile.txt.
     * @param vehicle The vehicle to have a smile added to it.
     */
    public Smile(Vehicle vehicle)
    {
        super(vehicle.lines);
        integrateDecor(FileReader.getLines("decorator/txt/smile.txt"));
    }    
}
