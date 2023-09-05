package strategy;

/**
 * A football receiver
 * @author Michael Pikula
 */
public class Receiver extends Player
{
    /**
     * Creates a new receiver with a given first name, last name, and state of play.
     * @param firstName The first name of the player
     * @param lastName The last name of the player
     * @param offense Whether or not the player is currently on offense
     */
    public Receiver(String firstName, String lastName, boolean offense)
    {
        super(firstName, lastName, offense);
    }

    /**
     * Sets the behavior of the receiver during offense to ReceiveBehavior.
     */
    public void setOffenseBehavior()
    {
        this.offenseBehavior = new ReceiveBehavior();
    }

    /**
     * Sets the behavior of the receiver during defense to null (no behavior).
     */
    public void setDefenseBehavior()
    {
        this.defenseBehavior = null;
    }
}
