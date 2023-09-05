package strategy;
import java.util.Random;

public class Lineman extends Player
{
    Random r = new Random();
    public Lineman(String firstName, String lastName, boolean offense)
    {
        super(firstName, lastName, offense);
    }

    public void setOffenseBehavior()
    {
        this.offenseBehavior = new OBlockBehavior();
    }
    public void setDefenseBehavior()
    {
        int choice = r.nextInt(0, 3);
        if (choice == 0)
            this.defenseBehavior = new BlockBehavior();
        else if (choice == 1)
            this.defenseBehavior = new StripBehavior();
        else
            this.defenseBehavior = new SackBehavior();
    }
}
