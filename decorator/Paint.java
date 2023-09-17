package decorator;

/**
 * A class created to change the color of the specified vehicle.
 * @author Michael Pikula
 */
public class Paint extends VehicleDecorator
{
    /**
     * Changes the color of the specified vehicle by adding a color value to the beginning of its first line.
     * @param vehicle The vehicle to have its color changed.
     * @param color The color that the vehicle will be changed to: accepts red, green, yellow, blue, purple, cyan, or none.
     */
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
