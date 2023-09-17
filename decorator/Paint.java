package decorator;

public class Paint extends VehicleDecorator
{
    public Paint(Vehicle vehicle, String color)
    {
        super(vehicle.lines);
        String colorValue;
        if (color.equals("red"))
            colorValue = "\u001B[31m";
        else if (color.equals("green"))
            colorValue = "\u001B[32m";
        else if (color.equals("yellow"))
            colorValue = "\u001B[33m";
        else if (color.equals("blue"))
            colorValue = "\u001B[34m";
        else if (color.equals("purple"))
            colorValue = "\u001B[35m";
        else if (color.equals("cyan"))
            colorValue = "\u001B[36m";
        else
            colorValue = "\u001B[0m";  // Black

        // Place desired colors at beginning of first line in ArrayList; entire car will print in that color.
        vehicle.lines.set(0, colorValue + vehicle.lines.get(0));
        // Add new line in ArrayList switching color back to black so color change does not persist.
        vehicle.lines.add("\u001B[0m");
    }
}
