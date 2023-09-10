package observer;

/**
 * An object intended to track the performance of a given subject.
 * @author Michael Pikula
 */
public interface Observer
{
    /**
     * Updates the current number of strokes and par with the entered values.
     * @param strokes The number of strokes taken on the current hole.
     * @param par The par of the current hole.
     */
    public void update(int strokes, int par);

    /**
     * Returns a string representation of the observer class.
     * @return A string containing par, amount of strokes, and how far over or under par the current golfer is.
     */
    public String toString();
}
