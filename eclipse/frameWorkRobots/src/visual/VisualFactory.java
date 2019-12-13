package visual;

import robocode.AdvancedRobot;
import robots.ConfigurationManager;

import java.util.ArrayList;
import java.util.List;

public class VisualFactory {

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

}
