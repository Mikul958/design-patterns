package strategy;
import java.util.Random;

public class PassBehavior implements OffenseBehavior
{
    Random r = new Random();
    public String play()
    {
        String endSentence = "uninit";
        int choice = r.nextInt(0, 5);
        switch(choice)
        {
            case 0:
                endSentence = "slant route";
                break;
            case 1:
                endSentence = "out route";
                break;
            case 2:
                endSentence = "seem route";
                break;
            case 3:
                endSentence = "screen pass";
                break;
            case 4:
                endSentence = "hail mary";
                break;
            default:
                endSentence = "null";
        }
        return "throws a " + endSentence;
    }
}
