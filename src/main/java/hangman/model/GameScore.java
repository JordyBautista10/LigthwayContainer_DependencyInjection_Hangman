package hangman.model;

public interface GameScore {

    int calculateScore(int correctCount, int incorrectCoutn)throws ExceptionGameScore;


}