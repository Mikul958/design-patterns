package strategy;

/**
 * A player's behavior while their behavior is set to strip the ball from an opponent.
 * @author Michael Pikula
 */
public class StripBehavior implements DefenseBehavior
{
    /**
     * Creates a string that describes a player's behavior is set to strip (the ball).
     * @return A string describing the player's actions while stripping (THE BALL).
     */
    public String play()
    {
        return "Strip a ball from runner's hands";
    }
}
