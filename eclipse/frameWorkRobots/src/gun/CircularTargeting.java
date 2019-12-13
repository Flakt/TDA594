package gun;
import robocode.*;
import robocode.util.Utils;

import java.awt.geom.*;
/**
 * Code gathered in pieces from http://robowiki.net/wiki/Circular_Targeting. Credit goes to Dummy.
 * */
public class CircularTargeting extends GunState {
    static double oldEnemyHeading;

    private AdvancedRobot robot;

    public CircularTargeting(AdvancedRobot robot){
        this.robot = robot;
    }

    @Override
    public void onScannedRobot(ScannedRobotEvent e) {

        double bulletPower = Math.min(3.0,robot.getEnergy());
        double myX = robot.getX();
        double myY = robot.getY();
        double absoluteBearing = robot.getHeadingRadians() + e.getBearingRadians();
        double enemyX = robot.getX() + e.getDistance() * Math.sin(absoluteBearing);
        double enemyY = robot.getY() + e.getDistance() * Math.cos(absoluteBearing);
        double enemyHeading = e.getHeadingRadians();
        double enemyHeadingChange = enemyHeading - oldEnemyHeading;
        double enemyVelocity = e.getVelocity();
        oldEnemyHeading = enemyHeading;

        double deltaTime = 0;
        double battleFieldHeight = robot.getBattleFieldHeight(),
                battleFieldWidth = robot.getBattleFieldWidth();
        double predictedX = enemyX, predictedY = enemyY;
        while((++deltaTime) * (20.0 - 3.0 * bulletPower) <
                Point2D.Double.distance(myX, myY, predictedX, predictedY)){
            predictedX += Math.sin(enemyHeading) * enemyVelocity;
            predictedY += Math.cos(enemyHeading) * enemyVelocity;
            enemyHeading += enemyHeadingChange;
            if(	predictedX < 18.0
                    || predictedY < 18.0
                    || predictedX > battleFieldWidth - 18.0
                    || predictedY > battleFieldHeight - 18.0){

                predictedX = Math.min(Math.max(18.0, predictedX),
                        battleFieldWidth - 18.0);
                predictedY = Math.min(Math.max(18.0, predictedY),
                        battleFieldHeight - 18.0);
                break;
            }
        }
        double theta = Utils.normalAbsoluteAngle(Math.atan2(
                predictedX - robot.getX(), predictedY - robot.getY()));

        robot.setTurnRadarRightRadians(Utils.normalRelativeAngle(
                absoluteBearing - robot.getRadarHeadingRadians()));
        robot.setTurnGunRightRadians(Utils.normalRelativeAngle(
                theta - robot.getGunHeadingRadians()));
        robot.fire(3);

    }
}
