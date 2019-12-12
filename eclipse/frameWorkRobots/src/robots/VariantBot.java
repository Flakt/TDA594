package robots;

import gun.AbstractGun;
import movement.AbstractMovement;
import radar.AbstractRadar;
import robocode.AdvancedRobot;
import robocode.ScannedRobotEvent;
import visual.AbstractVisual;

import java.util.List;

public class VariantBot extends AdvancedRobot {

    private AbstractGun gun;
    private AbstractMovement movement;
    private List<AbstractRadar> radars;
    private List<AbstractVisual> visuals;


    public void run(){
        this.gun = AbstractGun.getGun(this);
        this.movement = AbstractMovement.getMovement(this);
        this.radars = AbstractRadar.getRadar(this);
        this.visuals = AbstractVisual.getRadar(this);

        for (AbstractVisual v:visuals) {
            v.run();
        }

        for (AbstractRadar r:radars) {
            r.run();
        }
        movement.run();
        if(!gun.equals(null)){
            gun.run();
        }

    }

    public void onScannedRobot(ScannedRobotEvent e){
        for (AbstractVisual v:visuals) {
            v.onScannedRobot(e);
        }
        for (AbstractRadar r:radars) {
            r.onScannedRobot(e);
        }
        movement.onScannedRobot(e);
        if(!gun.equals(null)){
            gun.onScannedRobot(e);
        }
    	   
    }

    public AbstractMovement getMovement(){
        return movement;
    }

}
