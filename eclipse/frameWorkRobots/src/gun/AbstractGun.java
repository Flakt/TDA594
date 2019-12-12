package gun;

import robots.ConfigurationManager;
import robocode.AdvancedRobot;
import robocode.ScannedRobotEvent;

public abstract class AbstractGun {
	public void onScannedRobot(ScannedRobotEvent e) {
		
	}

	public static AbstractGun getGun(AdvancedRobot robot) {
		/*
		if(PropertyManager.getProperty("GuessFactorTargeting")) {
			System.out.println("GuessFactorTargeting");
			return new GuessFactorTargetingGun(robot);
		}
		 */

		if(ConfigurationManager.getInstance().getProperty("LinearTargeting")) {
			System.out.println("LinearTargeting");
			return new LinearTargetingGun(robot);
		}

		return null;
	}

}