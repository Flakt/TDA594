package visual;

import robocode.AdvancedRobot;

import java.awt.*;

public class RobotColour extends VisualState {

    public RobotColour(AdvancedRobot robot) {
        robot.setColors(Color.BLUE, Color.BLACK, Color.YELLOW);
    }
}
