package gun;

import org.junit.Before;
import org.junit.Test;
import robocode.AdvancedRobot;
import robocode.ScannedRobotEvent;
import robots.VariantBot;

import static org.junit.Assert.*;

public class GuessFactorTargetingTest {

    private VariantBot robot;
    private ScannedRobotEvent e;
    private GuessFactorTargeting gft;

    @Before
    public void setup(){
        robot = new VariantBot();
        e = new ScannedRobotEvent("Enemy", 100, 20,10,180,0,false);
        gft = new GuessFactorTargeting(robot);
        robot.setGun(gft);
    }

    @Test
    public void test(){
        double energy = robot.getEnergy();
        robot.onScannedRobot(e);
        assertNotEquals(energy,robot.getEnergy());
    }

}