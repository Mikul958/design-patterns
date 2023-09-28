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
        // TODO i don't understand
        rand = new Random();

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
        // TODO What do you even do here
        return null;
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
