package singleton;

import java.util.Random;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * An anagram game. Only one instance of this class can be created.
 * @author Michael Pikula
 */
public class Game
{
    private static Game game;
    private Random rand;
    private Difficulty level;
    private HashMap<Difficulty, ArrayList<Anagram>> anagrams;
    private Anagram currentAnagram;
    private int score;

    /**
     * Creates a new anagram game.
     */
    private Game()
    {
        rand = new Random();
        level = Difficulty.EASY;

        // Make HashMap of difficulty levels and corresponding anagrams, and add all pairs to the HashMap.
        anagrams = new HashMap<Difficulty, ArrayList<Anagram>>();
        for (Difficulty diff : Difficulty.values())
            anagrams.put(diff, FileReader.getAnagrams(diff));

        score = 0;
    }

    /**
     * Retrieves the current instance of an anagram game, or makes a new one if there isn't one. Ensures only one anagram game can be created.
     * @return The current anagram game.
     */
    public static Game getInstance()
    {
        if (game == null)
            game = new Game();
        return game;
    }
    /**
     * Randomly selects an anagram from the list of anagrams associated with the current level of difficulty.
     * @return The original string of letters for the generated anagram.
     */
    public String getQuestion()
    {
        // Obtain ArrayList with anagrams of the current difficulty from HashMap.
        ArrayList<Anagram> possibleAnagrams = anagrams.get(level);

        // Take a random anagram from the ArrayList the new current anagram.
        int temp = rand.nextInt(possibleAnagrams.size());
        currentAnagram = possibleAnagrams.get(temp);

        // Retrieve the question of the current anagram and return it.
        return currentAnagram.getQuestion();
    }
    /**
     * Checks if the answer that the user entered for the current problem is correct and adjusts the score/difficulty accordingly.
     * @param userAnswer The answer entered by the user.
     * @return Whether or not the entered answer is correct.
     */
    public boolean isCorrect(String userAnswer)
    {
        // Determine if score is correct. Increase score if it is, decrease if not.
        boolean correct = false;
        if (currentAnagram.isCorrect(userAnswer))
        {
            score++;
            correct = true;
        }
        else if (score > 0)
        {
            score--;
        }

        // Set new difficulty based on total score.
        if (score <= 6)
            level = Difficulty.EASY;
        else if (score > 6 && score <= 10)
            level = Difficulty.MEDIUM;
        else
            level = Difficulty.HARD;
        
        return correct;
    }
    /**
     * Retrieves the user's score for the current game.
     * @return The user's current score.
     */
    public int getScore()
    {
        return score;
    }
}
