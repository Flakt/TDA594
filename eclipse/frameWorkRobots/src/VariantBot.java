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
    }

    public void onScannedRobot(ScannedRobotEvent e){

    }

}
