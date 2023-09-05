package strategy;

public class Receiver extends Player
{
    public Receiver(String firstName, String lastName, boolean offense)
    {
        super(firstName, lastName, offense);
    }

    public void setOffenseBehavior()
    {
        this.offenseBehavior = new ReceiveBehavior();
    }
    public void setDefenseBehavior()
    {
        this.defenseBehavior = null;
    }
}
