package observer;

import java.util.ArrayList;

/**
 * An object representing a golfer playing a round of golf.
 * @author Michael Pikula
 */
public class Golfer implements Subject
{
    private ArrayList<Observer> observers;
    private String name;

    /**
     * Creates a golfer with the specified name and an ArrayList to contain any observers they may have.
     * @param name The golfer's name.
     */
    public Golfer(String name)
    {
        this.name = name;
        observers = new ArrayList<Observer>();
    }
    /**
     * Returns the name of the golfer.
     * @return A string containing the golfer's name.
     */
    public String getName()
    {
        return this.name;
    }
    
    /**
     * Adds the specified observer to this golfer's ArrayList of observers.
     * @param observer The observer to be added.
     */
    public void registerObserver(Observer observer)
    {
        observers.add(observer);
    }
    /**
     * Removes the specified observer from this golfer's ArrayList of observers.
     * @param observer The observer to be removed.
     */
    public void removeObserver(Observer observer)
    {
        observers.remove(observer);
    }
    /**
     * Notifies all observers with information from the most recent hole.
     * @param strokes The amount of strokes the golfer took to finish a given hole.
     * @param par The par of a given hole.
     */
    public void notifyObservers(int strokes, int par)
    {
        for (int i=0; i<observers.size(); i++)
            observers.get(i).update(strokes, par);
    }
    /**
     * Sends the score and par value of the most recent hole to any observers that may be tracking this golfer.
     * @param strokes The amount of strokes the golfer took to finish a given hole.
     * @param par The par of a given hole.
     */
    public void enterScore(int strokes, int par)
    {
        notifyObservers(strokes, par);
    }
}
