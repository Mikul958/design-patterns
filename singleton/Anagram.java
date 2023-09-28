package singleton;

import java.util.ArrayList;

public class Anagram
{
    private String question;
    private ArrayList<String> answers;
    
    public Anagram(String question, ArrayList<String> answers)
    {
        this.question = question;
        this.answers = answers;
    }

    public String getQuestion()
    {
        // TODO I don't get it
        return null;
    }
    public boolean isCorrect(String userAnswer)
    {
        for (int i=0; i<answers.size(); i++)
        {
            if (userAnswer.equalsIgnoreCase(answers.get(i)))
                return true;
        }
        return false;
    }
}
