package movement;

import robocode.*;
import robots.ConfigurationManager;

public abstract class MovementState{

    public void run(){
        //Do Nothing if not implemented
    }

    public void onScannedRobot(ScannedRobotEvent e){
        //Do nothing if not implemented
    }
}
