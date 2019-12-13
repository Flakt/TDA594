package radar;

import robocode.AdvancedRobot;
import robots.ConfigurationManager;

import java.util.ArrayList;
import java.util.List;

public class RadarFactory {

    public static List<AbstractRadar> getRadar(AdvancedRobot robot) {

        List<AbstractRadar> radars = new ArrayList<>();

        if(ConfigurationManager.getInstance().getProperty("SpinningRadar")) {
            System.out.println("SpinningRadar");

            radars.add(new SpinningRadar(robot));
        }
        return radars;
    }

}
