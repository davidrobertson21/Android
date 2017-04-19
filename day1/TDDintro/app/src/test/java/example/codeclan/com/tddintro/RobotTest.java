package example.codeclan.com.tddintro;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 17/04/2017.
 */

public class RobotTest {

    @Test
    public void testRobotSetup(){
        Robot robot = new Robot("C3P0", "Gold");
        assertEquals("C3P0", robot.getName());
        assertEquals("Gold", robot.getColour());
        assertEquals(100.0, robot.getBattery());

    }

    @Test
    public void testMakeDrink(){
        Robot robot = new Robot("C3P0", "Silver");
        assertEquals("Making juice", robot.makeDrink("juice"));
        assertEquals(90.0, robot.getBattery());

    }

    @Test
    public void testWashDishes(){
        Robot robot = new Robot ("R2D2", "Silver");
        assertEquals("Washing the dishes", robot.washDishes());
        assertEquals(70.0, robot.getBattery());

    }

    @Test
    public void testDoDusting() {
        Robot robot = new Robot("R2D2", "Silver");
        assertEquals("Doing the dusting", robot.doDusting());
        assertEquals(80.0, robot.getBattery());
    }

    @Test
    public void testRecharge(){
        Robot robot = new Robot("R2D2", "Silver");
        robot.washDishes();
        assertEquals(100.0, robot.Recharge());
    }

}


