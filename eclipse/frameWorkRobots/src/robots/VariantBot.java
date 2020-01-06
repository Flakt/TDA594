package robots;

import gun.GunState;
import gun.GunFactory;
import movement.MovementState;
import movement.MovementFactory;
import radar.RadarState;
import radar.RadarFactory;
import robocode.AdvancedRobot;
import robocode.ScannedRobotEvent;
import visual.VisualState;
import visual.VisualFactory;

import java.util.ArrayList;
import java.util.List;

public class VariantBot extends AdvancedRobot {

    private GunState gun;
    private MovementState movement;
    private List<RadarState> radars = new ArrayList<>();
    private List<VisualState> visuals = new ArrayList<>();


    public void run(){
        this.gun = GunFactory.getGun(this);
        this.movement = MovementFactory.getMovement(this);
        this.radars = RadarFactory.getRadar(this);
        this.visuals = VisualFactory.getRadar(this);

        for (VisualState v:visuals) {
            v.run();
        }
        if(movement != null){
            movement.run();
        }
        if(gun != null){
            gun.run();
        }
        for (RadarState r:radars) {
            r.run();
        }

    }

    public void onScannedRobot(ScannedRobotEvent e){
        for (VisualState v:visuals) {
            v.onScannedRobot(e);
        }
        for (RadarState r:radars) {
            r.onScannedRobot(e);
        }
        if(movement != null ){
            movement.onScannedRobot(e);
        }
        if(gun != null){
            gun.onScannedRobot(e);
        }
    	   
    }

    public MovementState getMovement(){
        return movement;
    }


    //For testing purposes
    public VariantBot(){
    }

    public void setGun(GunState gun) {
        this.gun = gun;
    }
    public void setMovement (MovementState movement){this.movement=movement;}
}
