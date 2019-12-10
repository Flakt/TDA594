import properties.PropertyManager;

public class testRunTime {
	
	public static void main(String[] args) {
		
		System.out.println("This robot has the features:");
		
		if(PropertyManager.getProperty("WaveSurfing")) {
			System.out.println("WaveSurfing");
		}
		
		if(PropertyManager.getProperty("WallSmoothing")) {
			System.out.println("WallSmoothing");
		}
		
		if(PropertyManager.getProperty("RandomOrbitalMovement")) {
			System.out.println("RandomOrbitalMovement");
		}
		
		if(PropertyManager.getProperty("GuessFactorTargeting")) {
			System.out.println("GuessFactorTargeting");
		}
		
		if(PropertyManager.getProperty("LinearTargeting")) {
			System.out.println("LinearTargeting");
		}
		
		if(PropertyManager.getProperty("SpinningRadar")) {
			System.out.println("SpinningRadar");
		}
		
		if(PropertyManager.getProperty("InfinityLock")) {
			System.out.println("InfinityLock");
		}
		
		if(PropertyManager.getProperty("PaintWaves")) {
			System.out.println("PaintWaves");
		}
		
		if(PropertyManager.getProperty("RobotColour")) {
			System.out.println("RobotColour");
		}
	}
	

}
