package singleton;

import java.util.Random;
import java.util.ArrayList;
import java.util.HashMap;

public class Game
{
    private static Game game;
    private Random rand;
    private Difficulty level;
    private HashMap<Difficulty, ArrayList<Anagram>> anagrams;
    private Anagram currentAnagram;
    private int score;

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

    public static Game getInstance()
    {
        if (game == null)
            game = new Game();
        return game;
    }
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
    public int getScore()
    {
        return score;
    }
}
