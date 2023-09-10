package observer;

/**
 * An object that allows for observers.
 * @author Michael Pikula
 */
public interface Subject {
    /**
     * Adds the specified observer to the subject's ArrayList of observers.
     * @param observer The observer to be added.
     */
    public void registerObserver(Observer observer);

    /**
     * Removes a specified observer from the Subject's ArrayList of observers.
     * @param observer The observer to be removed.
     */
    public void removeObserver(Observer observer);

    /**
     * Notifies all observers in the subject's ArrayList with information from the current hole.
     * @param strokes The number of strokes the golfer took to finish the hole.
     * @param par The par for the hole that was just finished.
     */
    public void notifyObservers(int strokes, int par);
}
