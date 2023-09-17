package decorator;

import java.util.ArrayList;

/**
 * An ASCII vehicle.
 * @author Michael Pikula
 */
public abstract class Vehicle
{
    protected ArrayList<String> lines;

    /**
     * Creates an ASCII representation of a vehicle based on the passed in ArrayList.
     * @param lines An ArrayList of type String containing lines read from a text file.
     */
    public Vehicle(ArrayList<String> lines)
    {
        this.lines = lines;
    }

    /**
     * Converts the ArrayList representing a vehicle into a single string representation.
     * @return A string representation of the vehicle.
     */
    public String toString()
    {
        String out = lines.get(0) + "\n";
        for (int i=1; i<lines.size(); i++)
            out += lines.get(i) + "\n";
        return out;
    }
}
