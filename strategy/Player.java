package strategy;

/**
 * A football player
 * @author Michael Pikula
 */
public abstract class Player
{
    private String firstName;
    private String lastName;
    private boolean offense;
    protected DefenseBehavior defenseBehavior;
    protected OffenseBehavior offenseBehavior;

    /**
     * Creates a new player with a given first name, last name, and state of play.
     * @param firstName The first name of the player
     * @param lastName The last name of the player
     * @param offense Whether or not the player is currently on offense
     */
    public Player(String firstName, String lastName, boolean offense)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.offense = offense;
    }

    /**
     * Sets the behavior of the player during offense.
     */
    public abstract void setDefenseBehavior();

    /**
     * Sets the behavior of the player during defense.
     */
    public abstract void setOffenseBehavior();

    /**
     * Describes the actions of a player based on their current set behavior for offense or defense.
     * @return A string describing the player's actions.
     */
    public String play()
    {
        if (offense)
        {
            this.setOffenseBehavior();
            if (offenseBehavior != null)
                return offenseBehavior.play();
        }
        else
        {
            this.setDefenseBehavior();
            if (defenseBehavior != null)
                return defenseBehavior.play();
        }
        return "not playing"; // player will not play if current behavior is null.
    }

    /**
     * Flips between offense and defense by toggling offense boolean.
     */
    public void turnover()
    {
        offense = !offense;
    }

    /**
     * Creates a string representation of a football player
     * @return A string containing the player's first and last name.
     */
    public String toString()
    {
        return firstName + " " + lastName;
    }
}
