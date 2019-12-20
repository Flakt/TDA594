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
    }

    @Test
    public void testPathA(){
        e = new ScannedRobotEvent("Enemy", 100, 20,10,180,0,false);
        tp = new TestPeer(100);
        robot.setPeer(tp);
        gft = new GuessFactorTargeting(robot);
        robot.setGun(gft);

        double energy = robot.getEnergy();
        robot.onScannedRobot(e);
        assertNotEquals(energy,robot.getEnergy());
    }

    @Test
    public void testPathB(){
        e = new ScannedRobotEvent("Enemy", 100, 20,10,180,1,false);
        tp = new TestPeer(100);
        robot.setPeer(tp);
        gft = new GuessFactorTargeting(robot);
        robot.setGun(gft);

        double energy = robot.getEnergy();
        robot.onScannedRobot(e);
        assertNotEquals(energy,robot.getEnergy());
    }

    @Test
    public void testPathC(){
        e = new ScannedRobotEvent("Enemy", 100, 20,10,180,0,false);
        tp = new TestPeer(1);
        robot.setPeer(tp);
        gft = new GuessFactorTargeting(robot);
        robot.setGun(gft);

        double energy = robot.getEnergy();
        robot.onScannedRobot(e);
        assertNotEquals(energy,robot.getEnergy());
    }

    @Test
    public void testPathD(){
        e = new ScannedRobotEvent("Enemy", 100, 20,10,180,1,false);
        tp = new TestPeer(1);
        robot.setPeer(tp);
        gft = new GuessFactorTargeting(robot);
        robot.setGun(gft);

        double energy = robot.getEnergy();
        robot.onScannedRobot(e);
        assertNotEquals(energy,robot.getEnergy());
    }

}