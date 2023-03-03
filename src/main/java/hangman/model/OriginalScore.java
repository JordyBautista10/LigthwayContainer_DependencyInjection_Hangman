package hangman.model;


public class OriginalScore implements GameScore{

    /* @pre  total points start at 100
     * @param correctCount and incorrectCount are the player's total hits and misses
     * @return the total points
     */

    @Override
    public int calculateScore(int correctCount, int incorrectCount){
        int gameScore = 100;
        gameScore -= incorrectCount*10;
        gameScore = (gameScore < 0)? 0:gameScore;
    
        return gameScore;
    }
}
