package observer;

/**
 * Object that manages and displays the stats for a golfer's current hole.
 * @author Michael Pikula
 */
public class HoleScoreDisplay implements Observer
{
    private Subject golfer;
    private int strokes;
    private int par;

    /**
     * Creates and registers an object that will observe a specified subject's performance on any given hole of golf.
     * @param golfer The subject that will be tracked by this observer.
     */
    public HoleScoreDisplay(Subject golfer)
    {
        this.golfer = golfer;
        strokes = par = 0;
        this.golfer.registerObserver(this);
    }

    /**
     * Updates the observer to contain information from the most recent hole.
     * @param strokes The amount of strokes a golfer took to finish a given hole.
     * @param par The par of a given hole.
     */
    public void update(int strokes, int par)
    {
        this.strokes = strokes;
        this.par = par;
    }
    /**
     * Creates a string representation of the hole the golfer just played.
     * @return A string containing the hole's par, the amount of strokes the golfer took, and how far over or under par they were.
     */
    public String toString()
    {
        String temp;
        if (strokes < par)
            temp = (par-strokes) + " under par";
        else if (strokes > par)
            temp = (strokes-par) + " over par";
        else
            temp = "Making par";

        return "\nCurrent Hole stats: Par (" + par + ") Strokes (" + strokes + "), " + temp;
    }
}
