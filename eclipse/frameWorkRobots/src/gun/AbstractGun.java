package gun;

import properties.PropertyManager;
import robocode.*;

public abstract class AbstractGun extends AdvancedRobot {
	public void onScannedRobot(ScannedRobotEvent e) {
		
	}

	public static AbstractGun getGun(AdvancedRobot robot) {
		/*
		if(PropertyManager.getProperty("GuessFactorTargeting")) {
			System.out.println("GuessFactorTargeting");
			return new GuessFactorTargetingGun(robot);
		}
		 */

		if(PropertyManager.getProperty("LinearTargeting")) {
			System.out.println("LinearTargeting");
			return new LinearTargetingGun(robot);
		}

		return null;
	}

}