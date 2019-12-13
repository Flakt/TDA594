package gun;

import robots.ConfigurationManager;
import robocode.AdvancedRobot;
import robocode.ScannedRobotEvent;

public abstract class GunState {

    public void run(){
        //Do Nothing if not implemented
    }

    public void onScannedRobot(ScannedRobotEvent e){
	    //Do nothing if not implemented
    }

}