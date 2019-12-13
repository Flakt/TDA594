package radar;

import robocode.AdvancedRobot;

public class SpinningRadar extends RadarState {

    private AdvancedRobot robot;

    public SpinningRadar(AdvancedRobot robot){
        this.robot = robot;
    }

    public void run(){
        do {
            robot.turnRadarRightRadians(Double.POSITIVE_INFINITY);
        } while (true);
    }

}
