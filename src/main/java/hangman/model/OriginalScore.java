package hangman.model;


public class OriginalScore implements GameScore{

    int gameScore = 100;

    /* @pre  total points start at 100
     * @param correctCount and incorrectCount are the player's total hits and misses
     * @return the total points
     */

    @Override
    public int calculateScore(int correctCount, int incorrectCount){
        gameScore -= incorrectCount*10;
        gameScore = (gameScore < 0)? 0:gameScore;
    
        return gameScore;
    }
}
