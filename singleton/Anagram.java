package singleton;

import java.util.ArrayList;

/**
 * An anagram problem, including the original string of letters and its possible anagrams.
 * @author Michael Pikula
 */
public class Anagram
{
    private String question;
    private ArrayList<String> answers;
    
    /**
     * Creates a new anagram problem.
     * @param question The original string of letters.
     * @param answers The possible anagrams the user can type in.
     */
    public Anagram(String question, ArrayList<String> answers)
    {
        this.question = question;
        this.answers = answers;
    }

    /**
     * Retrieves the question of this anagram.
     * @return The original string of letters.
     */
    public String getQuestion()
    {
        return question;
    }
    /**
     * Checks if the entered answer is in the anagram's list of correct answers.
     * @param userAnswer The answer entered by the user.
     * @return Whether or not the entered answer is correct.
     */
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
