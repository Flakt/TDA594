package utils;

import java.awt.geom.Point2D;

// This can be defined as an inner class if you want.
public class EnemyWave {
    public Point2D.Double fireLocation;
    public long fireTime;
    public double bulletVelocity, directAngle, distanceTraveled;
    public int direction;

    public EnemyWave() { }
}
