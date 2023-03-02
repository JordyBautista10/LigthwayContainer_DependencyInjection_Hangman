package hangman.model;


public class OriginalScore implements GameScore{

    int gameScore;

    /* @pre  total points start at 100
     * @param correctCount and incorrectCount are the player's total hits and misses
     * @return the total points
     */

    @Override
    public int calculateScore(int correctCount, int incorrectCount ){
        gameScore -= incorrectCount*10;
        return gameScore;
    }
}
