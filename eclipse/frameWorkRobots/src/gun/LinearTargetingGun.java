package gun;

import robocode.util.*;
import java.awt.geom.*;

public class LinearTargetingGun extends AbstractGun {
	
	private Double bulletSpeed;
	private Double latVelocity;
	
	public LinearTargetingGun(double bulletSpeed, double latVelocity) {
		this.bulletSpeed = bulletSpeed;
		this.latVelocity = latVelocity;
	}
	
	/**
	 * Uses trigonometry as detailed in robocode.net/wiki/Linear_Targeting.
	 * 
	 * @param bulletPower the power of the bullet, used to determine the bullet travel time and speed
	 * @param latVelocity the lateral velocity of the enemy robot
	 * @return the firing angle
	 */
	@Override
	public Double getFiringAngle() {
		return Math.asin(latVelocity / bulletSpeed);
		
	}
	
}
