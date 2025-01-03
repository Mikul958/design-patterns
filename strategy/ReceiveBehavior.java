package strategy;

import java.util.Random;

/**
 * A player's behavior while their behavior is set to receive.
 * @author Michael Pikula
 */
public class ReceiveBehavior implements OffenseBehavior
{
    Random r = new Random();

    /**
     * Creates a string that contains equally-likely messages while a player's behavior is set to receive.
     * @return A string describing the player's actions while receiving.
     */
    public String play()
    {
        String endSentence = "uninit";
        int choice = r.nextInt(4);
        switch(choice)
        {
            case 0:
                endSentence = "kick";
                break;
            case 1:
                endSentence = "punt";
                break;
            case 2:
                endSentence = "pass";
                break;
            case 3:
                endSentence = "catch";
                break;
            default:
                endSentence = "null";
        }
        return "runs a " + endSentence;
    }
}
