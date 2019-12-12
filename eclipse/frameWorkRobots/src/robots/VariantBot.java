package robots;

import gun.AbstractGun;
import movement.AbstractMovement;
import radar.AbstractRadar;
import robocode.AdvancedRobot;
import robocode.ScannedRobotEvent;

public class VariantBot extends AdvancedRobot {

    AbstractGun gun;
    AbstractMovement movement;
    AbstractRadar radar;


    public void run(){
        this.gun = AbstractGun.getGun(this);
        this.movement = AbstractMovement.getMovement(this);
        this.radar = AbstractRadar.getRadar(this);

        radar.run();
        movement.run();
        if(!gun.equals(null)){
            gun.run();
        }

    }

    public void onScannedRobot(ScannedRobotEvent e){
        radar.onScannedRobot(e);
        movement.onScannedRobot(e);
        if(!gun.equals(null)){
            gun.onScannedRobot(e);
        }
    	   
    }

}
