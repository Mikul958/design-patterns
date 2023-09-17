package strategy;

/**
 * A player's behavior when their team is on defense.
 * @author Michael Pikula
 */
public interface DefenseBehavior
{
    /**
     * Creates a string describing a player's actions when their team is on defense.
     * @return A string describing the player's actions.
     */
    public String play();
}
