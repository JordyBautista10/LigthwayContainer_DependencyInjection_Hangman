package hangman.modelo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import hangman.model.BonusScore;
import hangman.model.GameScore;
import hangman.model.OriginalScore;
import hangman.model.PowerBonusScore;

public class GamesScoreTest {
  
    @Test
    public void OriginalScore_calculateScore_incorrectCount10_gameScore0(){
        //Arrange
        GameScore origen = new OriginalScore() ;
        //Act
        int result = origen.calculateScore(0,10);
        //Assert
        assertEquals(0, result);
    } 

    @Test
    public void PowerBonusScore_calculateScore_correct2_incorrect8_gameScore0(){
        //Arrange
        GameScore powerbonus = new PowerBonusScore() ;
        //Act
        int result = powerbonus.calculateScore(2,8);
        //Assert
        assertEquals(0, result);
    } 

    @Test
    public void PowerBonusScore_calculateScore_correct4_gameScore2500(){
        //Arrange
        GameScore powerbonus = new PowerBonusScore() ;
        //Act
        int result = powerbonus.calculateScore(4,0);
        //Assert
        assertEquals(2500, result);
    } 

    @Test
    public void BonusScore_calculateScore_correct3_gameScore30(){
        //Arrange
        GameScore bonus = new BonusScore();
        //Act
        int result = bonus.calculateScore(3,0);
        //Assert
        assertEquals(30, result);
    } 

    @Test
    public void BonusScore_calculateScore_correct10_incorrect10_gameScore50(){
        //Arrange
        GameScore bonus = new BonusScore();
        //Act
        int result = bonus.calculateScore(10,10);
        //Assert
        assertEquals(50, result);
    } 

}
