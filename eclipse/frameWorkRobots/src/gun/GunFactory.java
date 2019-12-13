package gun;

import robocode.AdvancedRobot;
import robots.ConfigurationManager;

public class GunFactory {

    public static AbstractGun getGun(AdvancedRobot robot) {

        if(ConfigurationManager.getInstance().getProperty("GuessFactorTargeting")) {
            System.out.println("GuessFactorTargeting");
            return new GuessFactorTargeting(robot);
        }

        if(ConfigurationManager.getInstance().getProperty("CircularTargeting")) {
            System.out.println("CircularTargeting");
            return new CircularTargeting(robot);
        }

        if(ConfigurationManager.getInstance().getProperty("LinearTargeting")) {
            System.out.println("LinearTargeting");
            return new LinearTargetingGun(robot);
        }

        return null;
    }
}
