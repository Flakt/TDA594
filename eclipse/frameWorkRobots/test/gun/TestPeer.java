package gun;

import robocode.*;
import robocode.Event;
import robocode.robotinterfaces.peer.IAdvancedRobotPeer;

import java.awt.*;
import java.io.File;
import java.util.List;

public class TestPeer implements IAdvancedRobotPeer {

    private double energy = 100;

    private double x = 10;
    private double y = 10;

    @Override
    public boolean isAdjustGunForBodyTurn() {
        return false;
    }

    @Override
    public boolean isAdjustRadarForGunTurn() {
        return false;
    }

    @Override
    public boolean isAdjustRadarForBodyTurn() {
        return false;
    }

    @Override
    public void setStop(boolean b) {

    }

    @Override
    public void setResume() {

    }

    @Override
    public void setMove(double v) {

    }

    @Override
    public void setTurnBody(double v) {

    }

    @Override
    public void setTurnGun(double v) {

    }

    @Override
    public void setTurnRadar(double v) {

    }

    @Override
    public void setMaxTurnRate(double v) {

    }

    @Override
    public void setMaxVelocity(double v) {

    }

    @Override
    public void waitFor(Condition condition) {

    }

    @Override
    public void setInterruptible(boolean b) {

    }

    @Override
    public void setEventPriority(String s, int i) {

    }

    @Override
    public int getEventPriority(String s) {
        return 0;
    }

    @Override
    public void addCustomEvent(Condition condition) {

    }

    @Override
    public void removeCustomEvent(Condition condition) {

    }

    @Override
    public void clearAllEvents() {

    }

    @Override
    public List<Event> getAllEvents() {
        return null;
    }

    @Override
    public List<StatusEvent> getStatusEvents() {
        return null;
    }

    @Override
    public List<BulletMissedEvent> getBulletMissedEvents() {
        return null;
    }

    @Override
    public List<BulletHitBulletEvent> getBulletHitBulletEvents() {
        return null;
    }

    @Override
    public List<BulletHitEvent> getBulletHitEvents() {
        return null;
    }

    @Override
    public List<HitByBulletEvent> getHitByBulletEvents() {
        return null;
    }

    @Override
    public List<HitRobotEvent> getHitRobotEvents() {
        return null;
    }

    @Override
    public List<HitWallEvent> getHitWallEvents() {
        return null;
    }

    @Override
    public List<RobotDeathEvent> getRobotDeathEvents() {
        return null;
    }

    @Override
    public List<ScannedRobotEvent> getScannedRobotEvents() {
        return null;
    }

    @Override
    public File getDataDirectory() {
        return null;
    }

    @Override
    public File getDataFile(String s) {
        return null;
    }

    @Override
    public long getDataQuotaAvailable() {
        return 0;
    }

    @Override
    public void stop(boolean b) {

    }

    @Override
    public void resume() {

    }

    @Override
    public void turnRadar(double v) {

    }

    @Override
    public void setAdjustGunForBodyTurn(boolean b) {

    }

    @Override
    public void setAdjustRadarForGunTurn(boolean b) {

    }

    @Override
    public void setAdjustRadarForBodyTurn(boolean b) {

    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public long getTime() {
        return 0;
    }

    @Override
    public double getEnergy() {
        return energy;
    }

    @Override
    public double getX() {
        return x;
    }

    @Override
    public double getY() {
        return y;
    }

    @Override
    public double getVelocity() {
        return 0;
    }

    @Override
    public double getBodyHeading() {
        return 0;
    }

    @Override
    public double getGunHeading() {
        return 0;
    }

    @Override
    public double getRadarHeading() {
        return 0;
    }

    @Override
    public double getGunHeat() {
        return 0;
    }

    @Override
    public double getBattleFieldWidth() {
        return 0;
    }

    @Override
    public double getBattleFieldHeight() {
        return 0;
    }

    @Override
    public int getOthers() {
        return 0;
    }

    @Override
    public int getNumSentries() {
        return 0;
    }

    @Override
    public int getNumRounds() {
        return 0;
    }

    @Override
    public int getRoundNum() {
        return 0;
    }

    @Override
    public int getSentryBorderSize() {
        return 0;
    }

    @Override
    public double getGunCoolingRate() {
        return 0;
    }

    @Override
    public double getDistanceRemaining() {
        return 0;
    }

    @Override
    public double getBodyTurnRemaining() {
        return 0;
    }

    @Override
    public double getGunTurnRemaining() {
        return 0;
    }

    @Override
    public double getRadarTurnRemaining() {
        return 0;
    }

    @Override
    public void execute() {

    }

    @Override
    public void move(double v) {

    }

    @Override
    public void turnBody(double v) {

    }

    @Override
    public void turnGun(double v) {

    }

    @Override
    public Bullet fire(double v) {
        return null;
    }

    @Override
    public Bullet setFire(double v) {

        energy -= 1;

        return null;
    }

    @Override
    public void setBodyColor(Color color) {

    }

    @Override
    public void setGunColor(Color color) {

    }

    @Override
    public void setRadarColor(Color color) {

    }

    @Override
    public void setBulletColor(Color color) {

    }

    @Override
    public void setScanColor(Color color) {

    }

    @Override
    public void getCall() {

    }

    @Override
    public void setCall() {

    }

    @Override
    public Graphics2D getGraphics() {
        return null;
    }

    @Override
    public void setDebugProperty(String s, String s1) {

    }

    @Override
    public void rescan() {

    }
}
