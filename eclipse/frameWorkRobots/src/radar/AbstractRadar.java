package radar;

import robocode.AdvancedRobot;
import robocode.ScannedRobotEvent;
import robots.ConfigurationManager;

public class AbstractRadar {

    public static AbstractRadar getRadar(AdvancedRobot robot) {
        if(ConfigurationManager.getInstance().getProperty("SpinningRadar")) {
            System.out.println("SpinningRadar");

            return new SpinningRadar(robot);
        }
        return null;
    }

    public void run(){
        //Do Nothing if not implemented
    }

    public void onScannedRobot(ScannedRobotEvent e){
        //Do nothing if not implemented
    }
}
