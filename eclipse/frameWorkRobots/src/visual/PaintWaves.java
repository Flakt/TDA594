package visual;

import movement.WaveSurfing;
import robocode.AdvancedRobot;
import robots.VariantBot;
import utils.EnemyWave;

import java.awt.geom.Point2D;

public class PaintWaves extends AbstractVisual {

    private WaveSurfing ws;

    public PaintWaves(AdvancedRobot robot) {
        //Terrible way of doing this
        ws = ((WaveSurfing)((VariantBot)robot).getMovement());
    }

    private void onPaint(java.awt.Graphics2D g) {
        g.setColor(java.awt.Color.red);
        for(int i = 0; i < ws._enemyWaves.size(); i++){
            EnemyWave w = (EnemyWave)(ws._enemyWaves.get(i));
            Point2D.Double center = w.fireLocation;

            //int radius = (int)(w.distanceTraveled + w.bulletVelocity);
            //hack to make waves line up visually, due to execution sequence in robocode engine
            //use this only if you advance waves in the event handlers (eg. in onScannedRobot())
            //NB! above hack is now only necessary for robocode versions before 1.4.2
            //otherwise use:
            int radius = (int)w.distanceTraveled;

            //Point2D.Double center = w.fireLocation;
            if(radius - 40 < center.distance(ws._myLocation))
                g.drawOval((int)(center.x - radius ), (int)(center.y - radius), radius*2, radius*2);
        }
    }
}
