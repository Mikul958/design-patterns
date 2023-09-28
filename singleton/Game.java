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
        // Set the difficulty based on a random number between 0 and 3.
        int temp = rand.nextInt(3);
        switch(temp)
        {
            case 0:
                level = Difficulty.EASY;
                break;
            case 1:
                level = Difficulty.MEDIUM;
                break;
            case 2:
                level = Difficulty.HARD;
                break;
        }

        // Obtain ArrayList with anagrams of the new difficulty from HashMap.
        ArrayList<Anagram> possibleAnagrams = anagrams.get(level);

        // Make a random anagram from the ArrayList the new current anagram.
        temp = rand.nextInt(possibleAnagrams.size());
        currentAnagram = possibleAnagrams.get(temp);

        // Retrieve the question of the current anagram and return it.
        return currentAnagram.getQuestion();
    }
    public boolean isCorrect(String userAnswer)
    {
        if (currentAnagram.isCorrect(userAnswer))
        {
            score++;
            return true;
        }
        return false;
    }
    public int getScore()
    {
        return score;
    }
}
