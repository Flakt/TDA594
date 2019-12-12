package gun;

import robots.ConfigurationManager;
import robocode.AdvancedRobot;
import robocode.ScannedRobotEvent;

public abstract class AbstractGun {


	public static AbstractGun getGun(AdvancedRobot robot) {

		if(ConfigurationManager.getInstance().getProperty("GuessFactorTargeting")) {
			System.out.println("GuessFactorTargeting");
			return new GuessFactorTargeting(robot);
		}

        if(ConfigurationManager.getInstance().getProperty("CircularTargeting")) {
            System.out.println("CircularTargeting");
            return new CircularTargeting(robot);
        }

		if(ConfigurationManager.getInstance().getProperty("LinearTargeting")) {
			System.out.println("LinearTargeting");
			return new LinearTargetingGun(robot);
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