package movement;

import robocode.AdvancedRobot;
import robots.ConfigurationManager;

public class MovementFactory {

    public static AbstractMovement getMovement (AdvancedRobot robot) {
        if(ConfigurationManager.getInstance().getProperty("WaveSurfing")) {
            System.out.println("WaveSurfing");

            if(ConfigurationManager.getInstance().getProperty("WallSmoothing")) {
                System.out.println("WallSmoothing");
                return new WallSmoothing(robot);
            }
            else{
                return new WaveSurfing(robot);
            }
        }

        if(ConfigurationManager.getInstance().getProperty("RandomOrbitalMovement")) {
            System.out.println("RandomOrbitalMovement");
            return new RandomOrbitalMovement(robot);
        }


        return null;
    }
}
