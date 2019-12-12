package movement;

import robocode.AdvancedRobot;
import robocode.util.Utils;

import java.awt.geom.Point2D;

public class WallSmoothing extends WaveSurfing {

    private AdvancedRobot robot;

    public WallSmoothing(AdvancedRobot robot){
        super(robot);
        this.robot = robot;
    }

    // CREDIT: Iterative WallSmoothing by Kawigi
    //   - return absolute angle to move at after account for WallSmoothing
    // robowiki.net?WallSmoothing
    public double wallSmoothing(Point2D.Double botLocation, double angle, int orientation) {
        while (!_fieldRect.contains(project(botLocation, angle, 160))) {
            angle += orientation*0.05;
        }
        return angle;
    }

    @Override
    public void doSurfing() {
        WaveSurfing.EnemyWave surfWave = getClosestSurfableWave();

        if (surfWave == null) { return; }

        double dangerLeft = checkDanger(surfWave, -1);
        double dangerRight = checkDanger(surfWave, 1);

        double goAngle = absoluteBearing(surfWave.fireLocation, _myLocation);
        if (dangerLeft < dangerRight) {
            goAngle = wallSmoothing(_myLocation, goAngle - (Math.PI/2), -1);
        } else {
            goAngle = wallSmoothing(_myLocation, goAngle + (Math.PI/2), 1);
        }

        setBackAsFront(this, goAngle);
    }

    @Override
    // CREDIT: mini sized predictor from Apollon, by rozu
    // http://robowiki.net?Apollon
    public Point2D.Double predictPosition(WaveSurfing.EnemyWave surfWave, int direction) {
        Point2D.Double predictedPosition = (Point2D.Double)_myLocation.clone();
        double predictedVelocity = getVelocity();
        double predictedHeading = getHeadingRadians();
        double maxTurning, moveAngle, moveDir;

        int counter = 0; // number of ticks in the future
        boolean intercepted = false;

        do {
            moveAngle =
                    wallSmoothing(predictedPosition, absoluteBearing(surfWave.fireLocation,
                            predictedPosition) + (direction * (Math.PI/2)), direction)
                            - predictedHeading;
            moveDir = 1;

            if(Math.cos(moveAngle) < 0) {
                moveAngle += Math.PI;
                moveDir = -1;
            }

            moveAngle = Utils.normalRelativeAngle(moveAngle);

            // maxTurning is built in like this, you can't turn more then this in one tick
            maxTurning = Math.PI/720d*(40d - 3d*Math.abs(predictedVelocity));
            predictedHeading = Utils.normalRelativeAngle(predictedHeading
                    + limit(-maxTurning, moveAngle, maxTurning));

            // this one is nice ;). if predictedVelocity and moveDir have
            // different signs you want to breack down
            // otherwise you want to accelerate (look at the factor "2")
            predictedVelocity += (predictedVelocity * moveDir < 0 ? 2*moveDir : moveDir);
            predictedVelocity = limit(-8, predictedVelocity, 8);

            // calculate the new predicted position
            predictedPosition = project(predictedPosition, predictedHeading, predictedVelocity);

            counter++;

            if (predictedPosition.distance(surfWave.fireLocation) <
                    surfWave.distanceTraveled + (counter * surfWave.bulletVelocity)
                            + surfWave.bulletVelocity) {
                intercepted = true;
            }
        } while(!intercepted && counter < 500);

        return predictedPosition;
    }
}
