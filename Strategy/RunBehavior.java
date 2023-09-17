package strategy;

import java.util.Random;

/**
 * A player's behavior while their behavior is set to run.
 * @author Michael Pikula
 */
public class RunBehavior implements OffenseBehavior
{
    Random r = new Random();

    /**
     * Creates a string that contains equally-likely messages while a player's behavior is set to run.
     * @return A string describing the player's actions while running.
     */
    public String play()
    {
        String endSentence = "uninit";
        int choice = r.nextInt(4);
        switch(choice)
        {
            case 0:
                endSentence = "drive (up the gut)";
                break;
            case 1:
                endSentence = "draw";
                break;
            case 2:
                endSentence = "pitch";
                break;
            case 3:
                endSentence = "reverse";
                break;
            default:
                endSentence = "null";
        }
        return "runs a " + endSentence;
    }
}
