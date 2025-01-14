package hangman.model;
import java.util.*;


public class PowerBonusScore implements GameScore{

    int gameScore = 0;
    
    /* @pre  total points start at 0
    * @param correctCount and incorrectCount are the player's total hits and misses
    * @return the total points
    */
    
    @Override
    public int calculateScore(int correctCount, int incorrectCount){
        gameScore += correctCount * Math.pow(5, correctCount);
        gameScore -= incorrectCount*8;
        gameScore = (gameScore < 0)? 0:gameScore;
        return gameScore;
    }
}
