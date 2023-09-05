package strategy;
import java.util.Random;

public class QuarterBack extends Player
{
    public QuarterBack(String firstName, String lastName, boolean offense)
    {
        super(firstName, lastName, offense);
    }

    public void setOffenseBehavior()
    {
        Random r = new Random();
        int choice = r.nextInt(0, 2);
        if (choice == 0)
            this.offenseBehavior = new RunBehavior();
        else
            this.offenseBehavior = new PassBehavior();
    }
    public void setDefenseBehavior()
    {
        this.defenseBehavior = null;
    }
}
