package movement;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import robocode.AdvancedRobot;
import org.junit.Assert;
import robocode.ScannedRobotEvent;
import gun.TestPeer;
import robots.VariantBot;

import static org.mockito.Mockito.*;

class RandomOrbitalMovementTest {
    ScannedRobotEvent event,event2;
    RandomOrbitalMovement randomOrbitalMovement;
    VariantBot variantBot;

    public void setUp(){
        variantBot= new VariantBot();
        TestPeer testPeer = new TestPeer();
        variantBot.setPeer(testPeer);
        randomOrbitalMovement= new RandomOrbitalMovement(variantBot);
        event2 = new ScannedRobotEvent("Event 2",100,30,800,90,0, false);
        event= new ScannedRobotEvent("Event",100,30,20,90,0,false);
        variantBot.setMovement(randomOrbitalMovement);
    }



    @Test
    void test1() {
        setUp();
        final double headingSave = variantBot.getHeading();
        randomOrbitalMovement.onScannedRobot(event);
        assert(variantBot.getHeading()==-headingSave);

    }
    @Test
    void test2() {
        setUp();
        final double headingSave = variantBot.getHeading();
        randomOrbitalMovement.onScannedRobot(event2);
        assert(variantBot.getHeading()==headingSave);


    }
}