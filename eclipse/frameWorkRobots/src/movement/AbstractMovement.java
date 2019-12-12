package movement;

import robocode.*;
import robots.ConfigurationManager;

public abstract class AbstractMovement extends AdvancedRobot{

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

    public void run(){
        //Do Nothing if not implemented
    }

    public void onScannedRobot(ScannedRobotEvent e){
        //Do nothing if not implemented
    }
}
