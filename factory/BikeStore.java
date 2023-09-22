package factory;

public class BikeStore
{
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
