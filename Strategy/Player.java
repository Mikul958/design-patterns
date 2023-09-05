package strategy;

public abstract class Player
{
    private String firstName;
    private String lastName;
    private boolean offense;
    protected DefenseBehavior defenseBehavior;
    protected OffenseBehavior offenseBehavior;

    public Player(String firstName, String lastName, boolean offense)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.offense = offense;
        setOffenseBehavior();
        setDefenseBehavior();
    }

    public abstract void setDefenseBehavior();
    public abstract void setOffenseBehavior();
    public String play()
    {
        if (offense && offenseBehavior != null)
            return offenseBehavior.play();
        else if (defenseBehavior != null)
            return defenseBehavior.play();
        return "not playing"; // player will not play if current behavior is null.
    }
    public void turnover()
    {
        offense = !offense;
    }
    public String toString()
    {
        return firstName + " " + lastName;
    }
}
