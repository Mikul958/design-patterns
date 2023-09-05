package strategy;

/**
 * A player's behavior when their team is on offense.
 * @author Michael Pikula
 */
public interface OffenseBehavior
{
    /**
     * Creates a string describing a player's actions when their team is on offense.
     * @return A string describing the player's actions.
     */
    public String play();
}
