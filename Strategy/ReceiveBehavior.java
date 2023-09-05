package strategy;
import java.util.Random;

public class ReceiveBehavior implements OffenseBehavior
{
    Random r = new Random();
    public String play()
    {
        String endSentence = "uninit";
        int choice = r.nextInt(0, 4);
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
