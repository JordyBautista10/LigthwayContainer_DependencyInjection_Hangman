package hangman.model;

public class ExceptionGameScore extends Exception{

    public static String incorrectCountNegative = "Number negative of gameScore";

    public ExceptionGameScore(String e){
        super(e);
    }
}
