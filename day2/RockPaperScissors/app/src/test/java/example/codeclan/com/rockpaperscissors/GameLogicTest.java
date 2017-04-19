package example.codeclan.com.rockpaperscissors;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotSame;
import static junit.framework.Assert.assertTrue;

/**
 * Created by user on AD 2017/4/19.
 */

public class GameLogicTest {

    @Test
    public void getChoiceTest(){
        GameLogic game = new GameLogic(RPS.ROCK);
        assertEquals(RPS.ROCK, game.getChoice());
        game = new GameLogic(RPS.PAPER);
        assertEquals(RPS.PAPER, game.getChoice());
        game = new GameLogic(RPS.SCISSORS);
        assertEquals(RPS.SCISSORS, game.getChoice());
    }

    @Test
    public void getResultsTest(){
        GameLogic game = new GameLogic(RPS.ROCK);
        String result = game.getWinner(RPS.SCISSORS);
        assertEquals("Player Wins!", result); //ROCK wins
        result = game.getWinner(RPS.PAPER); //do not need to declare this as a String as it has already been a couple of lines up
        assertEquals("Computer Wins!", result); //PAPER wins
        result = game.getWinner(RPS.ROCK);
        assertEquals("Draw", result);
        result = game.getWinner(RPS.UNASSIGNED);
        assertEquals("Error", result);
    }

    @Test
    public void getComputerChoiceTest(){
        GameLogic game = new GameLogic(RPS.ROCK);
        RPS result = game.getComputerChoice();
        assertEquals(RPS.UNASSIGNED, result);

    }

    @Test
    public void setComputerChoiceTest(){
        GameLogic game = new GameLogic(RPS.ROCK);
        game.setComputerChoice(RPS.SCISSORS);
        assertEquals(RPS.SCISSORS, game.getComputerChoice());
    }

    @Test
    public void setRandomComputerChoiceTest() {
        GameLogic game = new GameLogic(RPS.ROCK);
        game.randomComputerChoice();
        assertNotSame(RPS.UNASSIGNED, game.getComputerChoice());

    }

}


