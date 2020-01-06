package gun;

import robocode.util.*;
import robocode.*;
import java.awt.geom.*;
/**
 * A noniterative linear targeting implementation inspired by example given in robocode wiki
 *
 */

public class LinearTargeting extends GunState {
	
	private AdvancedRobot robot;
	
	public LinearTargeting(AdvancedRobot robot) {
		this.robot = robot;
	}
	
	@Override
	public void onScannedRobot(ScannedRobotEvent e) {
		double bulletPower = Math.min(3.0, robot.getEnergy());
		double bulletSpeed = (20.0 - 3.0 * bulletPower);
		double absoluteBearing = robot.getHeadingRadians() + e.getBearingRadians();
		double latVelocity = e.getVelocity() * Math.sin(e.getHeadingRadians() - absoluteBearing);
		double angleOffset = Math.asin(latVelocity / bulletSpeed);
		
		robot.setTurnGunRightRadians(
				Utils.normalRelativeAngle(absoluteBearing - robot.getGunHeadingRadians() + angleOffset));
		robot.setFire(3.0);
	}
	
}
