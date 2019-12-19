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
    private TestPeer tp;


    @Before
    public void setup(){
        robot = new VariantBot();
        tp = new TestPeer();
        robot.setPeer(tp);
        gft = new GuessFactorTargeting(robot);
        robot.setGun(gft);
    }

    @Test
    public void testPathA(){
        e = new ScannedRobotEvent("Enemy", 100, 20,10,180,0,false);
        double energy = robot.getEnergy();
        robot.onScannedRobot(e);
        assertNotEquals(energy,robot.getEnergy());
    }

    @Test
    public void testPathB(){
        e = new ScannedRobotEvent("Enemy", 100, 20,10,180,1,false);
        double energy = robot.getEnergy();
        robot.onScannedRobot(e);
        assertNotEquals(energy,robot.getEnergy());
    }

    @Test
    public void testPathC(){
        e = new ScannedRobotEvent("Enemy", 1, 20,10,180,0,false);
        double energy = robot.getEnergy();
        robot.onScannedRobot(e);
        assertNotEquals(energy,robot.getEnergy());
    }

    @Test
    public void testPathD(){
        e = new ScannedRobotEvent("Enemy", 1, 20,10,180,1,false);
        double energy = robot.getEnergy();
        robot.onScannedRobot(e);
        assertNotEquals(energy,robot.getEnergy());
    }

}