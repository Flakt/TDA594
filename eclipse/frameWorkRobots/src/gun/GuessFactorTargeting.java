package gun;
import robocode.*;
import robocode.util.Utils;
import utils.GFTUtils;
import utils.GFTWave;

import java.awt.geom.Point2D;

public class GuessFactorTargeting extends GunState {
    private static final double BULLET_POWER = 1.9;
    private static double lateralDirection;
    private static double lastEnemyVelocity;

    private AdvancedRobot robot;

    public GuessFactorTargeting(AdvancedRobot robot){
        this.robot = robot;
    }

    @Override
    public void onScannedRobot(ScannedRobotEvent e) {
        lateralDirection = 1;
        lastEnemyVelocity = 0;
        double enemyAbsoluteBearing = robot.getHeadingRadians() + e.getBearingRadians();
        double enemyDistance = e.getDistance();
        double enemyVelocity = e.getVelocity();
        if (enemyVelocity != 0) {
            lateralDirection = GFTUtils.sign(enemyVelocity * Math.sin(e.getHeadingRadians() - enemyAbsoluteBearing));
        }
        GFTWave wave = new GFTWave(robot);
        wave.gunLocation = new Point2D.Double(robot.getX(), robot.getY());
        GFTWave.targetLocation = GFTUtils.project(wave.gunLocation, enemyAbsoluteBearing, enemyDistance);
        wave.lateralDirection = lateralDirection;
        wave.bulletPower = BULLET_POWER;
        wave.setSegmentations(enemyDistance, enemyVelocity, lastEnemyVelocity);
        lastEnemyVelocity = enemyVelocity;
        wave.bearing = enemyAbsoluteBearing;
        robot.setTurnGunRightRadians(Utils.normalRelativeAngle(enemyAbsoluteBearing -
                robot.getGunHeadingRadians() + wave.mostVisitedBearingOffset()));
        robot.setFire(wave.bulletPower);
        if (robot.getEnergy() >= BULLET_POWER) {
            robot.addCustomEvent(wave);
        }
    }
}
