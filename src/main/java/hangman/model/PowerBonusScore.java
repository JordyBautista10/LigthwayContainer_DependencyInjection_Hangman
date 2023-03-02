package hangman.model;


public class PowerBonusScore implements GameScore{

    int gameScore = 0;
    
    /* @pre  total points start at 0
    * @param correctCount and incorrectCount are the player's total hits and misses
    * @return the total points
    */
    
    @Override
    public int calculateScore(int correctCount, int incorrectCount)throws ExceptionGameScore{
        if (gameScore < 0){
            throw new ExceptionGameScore(ExceptionGameScore.incorrectCountNegative);
        }
        gameScore += correctCount*5^(correctCount);
        gameScore -= incorrectCount*8;
        return gameScore;
    }
}
