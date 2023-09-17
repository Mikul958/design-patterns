package decorator;

import java.util.ArrayList;

public abstract class VehicleDecorator extends Vehicle
{
    public VehicleDecorator(ArrayList<String> lines)
    {
        super(lines);
    }

    protected void integrateDecor(ArrayList<String> decor)
    {
        // Outer for-loop, progress through this.lines and break if i is out of bounds of decor.
        for (int i=0; i<this.lines.size(); i++)
        {
            if (i >= decor.size())
                break;
            
            String newLine = "";
            int lastChar = 0;

            // Inner for-loop, progress through string at decor.get(i) and break if j is out of bounds of corresponding String in this.lines.
            for (int j=0; j<decor.get(i).length(); j++)
            {
                if (j>=this.lines.get(i).length())
                    break;
                
                // Add current character in decor to the new line if it is not a space, otherwise add current character in this.lines.
                if (decor.get(i).charAt(j) != ' ')
                    newLine += decor.get(i).charAt(j);
                else
                    newLine += this.lines.get(i).charAt(j);
                lastChar = j;
            }

            // Add remaining characters from current line of this.lines to new line and replace current line with new line.
            for (int j=lastChar+1; j<this.lines.get(i).length(); j++)
                newLine += this.lines.get(i).charAt(j);
            this.lines.set(i, newLine);
        }
    }
}
