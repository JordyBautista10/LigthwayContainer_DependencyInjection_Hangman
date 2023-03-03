package hangman.model;

public class BonusScore implements GameScore{
    
    /* @pre  total points start at 0
     * @param correctCount and incorrectCount are the player's total hits and misses
     * @return the total points
     */
    
    @Override
    public int calculateScore(int correctCount, int incorrectCount){
        int gameScore = 0;
        gameScore += correctCount*10;
        gameScore -= incorrectCount*5;
        gameScore = (gameScore < 0)? 0:gameScore;
        return gameScore;
    }
}
    