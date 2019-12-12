package gun;
import robocode.*;
import robocode.util.Utils;
import utils.GFTUtils;
import utils.GFTWave;

import java.awt.geom.Point2D;

public class GuessFactorTargeting extends AbstractGun {
    private static final double BULLET_POWER = 1.9;
    private static double lateralDirection;
    private static double lastEnemyVelocity;

    @Override
    public void onScannedRobot(ScannedRobotEvent e) {
        lateralDirection = 1;
        lastEnemyVelocity = 0;
        double enemyAbsoluteBearing = getHeadingRadians() + e.getBearingRadians();
        double enemyDistance = e.getDistance();
        double enemyVelocity = e.getVelocity();
        if (enemyVelocity != 0) {
            lateralDirection = GFTUtils.sign(enemyVelocity * Math.sin(e.getHeadingRadians() - enemyAbsoluteBearing));
        }
        GFTWave wave = new GFTWave(this);
        wave.gunLocation = new Point2D.Double(getX(), getY());
        GFTWave.targetLocation = GFTUtils.project(wave.gunLocation, enemyAbsoluteBearing, enemyDistance);
        wave.lateralDirection = lateralDirection;
        wave.bulletPower = BULLET_POWER;
        wave.setSegmentations(enemyDistance, enemyVelocity, lastEnemyVelocity);
        lastEnemyVelocity = enemyVelocity;
        wave.bearing = enemyAbsoluteBearing;
        setTurnGunRightRadians(Utils.normalRelativeAngle(enemyAbsoluteBearing - getGunHeadingRadians() + wave.mostVisitedBearingOffset()));
        setFire(wave.bulletPower);
        if (getEnergy() >= BULLET_POWER) {
            addCustomEvent(wave);
        }
    }
}
