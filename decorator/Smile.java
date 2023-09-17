package decorator;

public class Smile extends VehicleDecorator
{
    public Smile(Vehicle vehicle)
    {
        super(vehicle.lines);
        integrateDecor(FileReader.getLines("decorator/txt/smile.txt"));
    }    
}
