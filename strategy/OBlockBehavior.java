package strategy;

/**
 * A player's behavior while their behavior is set to offensively block.
 * @author Michael Pikula
 */
public class OBlockBehavior implements OffenseBehavior
{
    /**
     * Creates a string that describes a player's behavior while offensively blocking.
     * @return A string describing the player's actions while offensively blocking.
     */
    public String play()
    {
        return "Block Defenders";
    }
}
