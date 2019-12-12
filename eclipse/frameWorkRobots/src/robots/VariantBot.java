package robots;

import gun.AbstractGun;
import movement.AbstractMovement;
import radar.AbstractRadar;
import robocode.AdvancedRobot;
import robocode.ScannedRobotEvent;

import java.util.List;

public class VariantBot extends AdvancedRobot {

    private AbstractGun gun;
    private AbstractMovement movement;
    private List<AbstractRadar> radars;


    public void run(){
        this.gun = AbstractGun.getGun(this);
        this.movement = AbstractMovement.getMovement(this);
        this.radars = AbstractRadar.getRadar(this);

        for (AbstractRadar r:radars) {
            r.run();
        }
        movement.run();
        if(!gun.equals(null)){
            gun.run();
        }

    }

    public void onScannedRobot(ScannedRobotEvent e){
        for (AbstractRadar r:radars) {
            r.onScannedRobot(e);
        }
        movement.onScannedRobot(e);
        if(!gun.equals(null)){
            gun.onScannedRobot(e);
        }
    	   
    }

}
