package visual;

import robocode.AdvancedRobot;
import robocode.ScannedRobotEvent;
import robots.ConfigurationManager;

import java.util.ArrayList;
import java.util.List;

public class AbstractVisual {

    public static List<AbstractVisual> getRadar(AdvancedRobot robot) {

        List<AbstractVisual> visuals = new ArrayList<>();

        if(ConfigurationManager.getInstance().getProperty("PaintWaves")) {
            System.out.println("PaintWaves");

            visuals.add(new PaintWaves(robot));
        }

        if(ConfigurationManager.getInstance().getProperty("RobotColour")) {
            System.out.println("RobotColour");

            visuals.add(new RobotColour(robot));
        }

        return visuals;
    }

    public void run(){
        //Do Nothing if not implemented
    }

    public void onScannedRobot(ScannedRobotEvent e){
        //Do nothing if not implemented
    }

}
