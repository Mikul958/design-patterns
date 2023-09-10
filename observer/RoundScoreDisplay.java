package observer;

/**
 * Class that manages and displays the stats for a golfer over the current round.
 * @author Michael Pikula
 */
public class RoundScoreDisplay implements Observer
{
    private Subject golfer;
    private int strokesTotal;
    private int parTotal;

    /**
     * Creates and registers an object that will track a specified subject's performance as they play through a round of golf.
     * @param golfer The subject that will be tracked by this observer.
     */
    public RoundScoreDisplay(Subject golfer)
    {
        this.golfer = golfer;
        strokesTotal = parTotal = 0;
        this.golfer.registerObserver(this);
    }

    /**
     * Updates the observer to add information from the most recent hole to totals.
     * @param strokes The amount of strokes a golfer took to finish a given hole.
     * @param par The par of a given hole.
     */
    public void update(int strokes, int par)
    {
        this.strokesTotal += strokes;
        this.parTotal += par;
    }
    /**
     * Creates a string representation of the golfer's performance up to the most recent hole.
     * @return A string containing the hole's par, the amount of strokes the golfer took, and how far over or under par they were.
     */
    public String toString()
    {
        String temp;
        if (strokesTotal < parTotal)
            temp = (parTotal-strokesTotal) + " under par";
        else if (strokesTotal > parTotal)
            temp = (strokesTotal-parTotal) + " over par";
        else
            temp = "Making par";

        return "\nOverall stats: Par (" + parTotal + ") Strokes (" + strokesTotal + "), " + temp;
    }
}
