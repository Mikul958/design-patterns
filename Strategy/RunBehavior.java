package strategy;
import java.util.Random;

public class RunBehavior implements OffenseBehavior
{
    Random r = new Random();
    public String play()
    {
        String endSentence = "uninit";
        int choice = r.nextInt(0, 4);
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
