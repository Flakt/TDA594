package gun;

import robocode.util.*;
import robocode.*;
import java.awt.geom.*;

public class LinearTargetingGun extends AbstractGun {
	
	private AdvancedRobot robot;
	
	public LinearTargetingGun(AdvancedRobot robot) {
		this.robot = robot;
	}
	
	private Double calcFiringAngle(double bulletSpeed, double latVelocity) {
		return Math.asin(latVelocity / bulletSpeed);
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
