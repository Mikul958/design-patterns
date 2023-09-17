package decorator;

import java.util.ArrayList;

public abstract class Vehicle
{
    protected ArrayList<String> lines;

    public Vehicle(ArrayList<String> lines)
    {
        this.lines = lines;
    }

    public String toString()
    {
        String out = lines.get(0) + "\n";
        for (int i=1; i<lines.size(); i++)
            out += lines.get(i) + "\n";
        return out;
    }
}
