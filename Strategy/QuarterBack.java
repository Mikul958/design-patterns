package strategy;

import java.util.Random;

/**
 * A football quarterback
 * @author Michael Pikula
 */
public class QuarterBack extends Player
{
    /**
     * Creates a new quarterback with a given first name, last name, and state of play.
     * @param firstName The first name of the player
     * @param lastName The last name of the player
     * @param offense Whether or not the player is currently on offense
     */
    public QuarterBack(String firstName, String lastName, boolean offense)
    {
        super(firstName, lastName, offense);
    }

    /**
     * Sets the behavior of the quarterback during offense randomly to either RunBehavior or PassBehavior.
     */
    public void setOffenseBehavior()
    {
        Random r = new Random();
        int choice = r.nextInt(2);
        if (choice == 0)
            this.offenseBehavior = new RunBehavior();
        else
            this.offenseBehavior = new PassBehavior();
    }

    /**
     * Sets the behavior of the quarterback during defense to null (no behavior).
     */
    public void setDefenseBehavior()
    {
        this.defenseBehavior = null;
    }
}
