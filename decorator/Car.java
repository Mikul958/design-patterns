package decorator;

/**
 * An ASCII car.
 * @author Michael Pikula
 */
public class Car extends Vehicle
{
    /**
     * Creates an ASCII vehicle based on the car.txt file.
     */
    public Car()
    {
        super(FileReader.getLines("decorator/txt/car.txt"));
    }    
}
