package strategy;

/**
 * A player's behavior while their behavior is set to sack.
 * @author Michael Pikula
 */
public class SackBehavior implements DefenseBehavior
{
    /**
     * Creates a string that describes a player's behavior while sacking.
     * @return A string describing the player's actions while sacking.
     */
    public String play()
    {
        return "Sack the quarterback";
    }
}
