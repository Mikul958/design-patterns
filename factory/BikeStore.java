package factory;

/**
 * A class managing the creation of different types of bikes.
 * @author Michael Pikula
 */
public class BikeStore
{
    /**
     * Creates a new Bike object based on the type of bike entered.
     * @param type A string containing the type of bike to be created.
     * @return The created bike.
     */
    public Bike createBike(String type)
    {
        Bike newBike;

        if (type.equals("tricycle"))
            newBike = new Tricycle();
        else if (type.equals("strider"))
            newBike = new Strider();
        else
            newBike = new KidsBike();
        
        return newBike;
    }
}
