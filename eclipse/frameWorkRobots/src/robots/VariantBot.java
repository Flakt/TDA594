package robots;

import gun.AbstractGun;
import movement.AbstractMovement;
import robocode.AdvancedRobot;
import robocode.ScannedRobotEvent;

public class VariantBot extends AdvancedRobot {

    AbstractGun gun;
    AbstractMovement movement;


    public void run(){
        this.gun = AbstractGun.getGun(this);
        this.movement = AbstractMovement.getMovement(this);
        
        do {
        	turnRadarRightRadians(Double.POSITIVE_INFINITY);
        } while (true);
    }

    public void onScannedRobot(ScannedRobotEvent e){
    	gun.onScannedRobot(e);
    	   
    }

}
