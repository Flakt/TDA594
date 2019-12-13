package radar;

import robocode.AdvancedRobot;
import robocode.ScannedRobotEvent;
import robots.ConfigurationManager;

import java.util.ArrayList;
import java.util.List;

public abstract class RadarState {

    public void run(){
        //Do Nothing if not implemented
    }

    public void onScannedRobot(ScannedRobotEvent e){
        //Do nothing if not implemented
    }
}
