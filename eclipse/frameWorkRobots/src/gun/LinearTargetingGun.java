package gun;

import robocode.util.*;
import robocode.*;
import java.awt.geom.*;

public class LinearTargetingGun extends AbstractGun {
	
	private AdvancedRobot robot;
	
	public LinearTargetingGun(double bulletSpeed, double latVelocity) {
		this.bulletSpeed = bulletSpeed;
		this.latVelocity = latVelocity;
	}
	
	/**
	 * Uses trigonometry as detailed in robocode.net/wiki/Linear_Targeting to get the firing angle
	 * 
	 * @return the firing angle
	 */
	@Override
	public Double getFiringAngle() {
		return Math.asin(latVelocity / bulletSpeed);
		
	}
	
}
