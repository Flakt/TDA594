package visual;

import robocode.AdvancedRobot;
import robots.ConfigurationManager;

import java.util.ArrayList;
import java.util.List;

public class VisualFactory {

    public static List<VisualState> getRadar(AdvancedRobot robot) {

        List<VisualState> visuals = new ArrayList<>();

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

}
