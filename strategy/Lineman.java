package strategy;

import java.util.Random;

/**
 * A football lineman
 * @author Michael Pikula
 */
public class Lineman extends Player
{
    /**
     * Creates a new lineman with a given first name, last name, and state of play.
     * @param firstName The first name of the player
     * @param lastName The last name of the player
     * @param offense Whether or not the player is currently on offense
     */
    public Lineman(String firstName, String lastName, boolean offense)
    {
        super(firstName, lastName, offense);
    }

    /**
     * Sets the behavior of the lineman during offense to OBlockBehavior.
     */
    public void setOffenseBehavior()
    {
        this.offenseBehavior = new OBlockBehavior();
    }

    /**
     * Sets the behavior of the lineman during defense randomly to BlockBehavior, StripBehavior, or SackBehavior.
     */
    public void setDefenseBehavior()
    {
        Random r = new Random();
        int choice = r.nextInt(3);
        if (choice == 0)
            this.defenseBehavior = new BlockBehavior();
        else if (choice == 1)
            this.defenseBehavior = new StripBehavior();
        else if (choice == 2)
            this.defenseBehavior = new SackBehavior();
    }
}
