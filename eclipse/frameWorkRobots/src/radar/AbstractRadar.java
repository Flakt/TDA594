package radar;

import robocode.AdvancedRobot;
import robocode.ScannedRobotEvent;
import robots.ConfigurationManager;

import java.util.ArrayList;
import java.util.List;

public class AbstractRadar {

    public static List<AbstractRadar> getRadar(AdvancedRobot robot) {

        List<AbstractRadar> radars = new ArrayList<>();

        if(ConfigurationManager.getInstance().getProperty("SpinningRadar")) {
            System.out.println("SpinningRadar");

            radars.add(new SpinningRadar(robot));
        }
        return radars;
    }

    public void run(){
        //Do Nothing if not implemented
    }

    public void onScannedRobot(ScannedRobotEvent e){
        //Do nothing if not implemented
    }
}
