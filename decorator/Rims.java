package decorator;

/**
 * A class created to add rims to the specified vehicle.
 * @author Michael Pikula
 */
public class Rims extends VehicleDecorator
{
    /**
     * Adds rims to the passed in vehicle by integrating the information found in rims.txt.
     * @param vehicle The vehicle to have rims added to it.
     */
    public Rims(Vehicle vehicle)
    {
        super(vehicle.lines);
        integrateDecor(FileReader.getLines("decorator/txt/rims.txt"));
    }
}
