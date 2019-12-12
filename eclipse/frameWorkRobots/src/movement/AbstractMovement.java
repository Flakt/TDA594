package movement;
import properties.PropertyManager;
import robocode.*;

public abstract class AbstractMovement extends AdvancedRobot{

    public abstract void onScannedRobot(ScannedRobotEvent e);

    public static AbstractMovement getMovement (AdvancedRobot robot) {
        if(PropertyManager.getProperty("WaveSurfing")) {
            System.out.println("WaveSurfing");
            return new WaveSurfing(robot);
        }

        /*
        if(PropertyManager.getProperty("WallSmoothing")) {
            System.out.println("WallSmoothing");
            return new WallSmoothing(robot);
        }
*/
        if(PropertyManager.getProperty("RandomOrbitalMovement")) {
            System.out.println("RandomOrbitalMovement");
            return new RandomOrbitalMovement(robot);
        }


        return null;
    }
}
