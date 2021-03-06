/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Sat Dec 28 15:57:46 GMT 2019
 */

package radar;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

import static org.evosuite.shaded.org.mockito.Mockito.*;
@EvoSuiteClassExclude
public class RadarState_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "radar.RadarState"; 
    org.evosuite.runtime.GuiSupport.initialize(); 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfThreads = 100; 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfIterationsPerLoop = 10000; 
    org.evosuite.runtime.RuntimeSettings.mockSystemIn = true; 
    org.evosuite.runtime.RuntimeSettings.sandboxMode = org.evosuite.runtime.sandbox.Sandbox.SandboxMode.RECOMMENDED; 
    org.evosuite.runtime.sandbox.Sandbox.initializeSecurityManagerForSUT(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.init();
    setSystemProperties();
    initializeClasses();
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    try { initMocksToAvoidTimeoutsInTheTests(); } catch(ClassNotFoundException e) {} 
  } 

  @AfterClass 
  public static void clearEvoSuiteFramework(){ 
    Sandbox.resetDefaultSecurityManager(); 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
  } 

  @Before 
  public void initTestCase(){ 
    threadStopper.storeCurrentThreads();
    threadStopper.startRecordingTime();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().initHandler(); 
    org.evosuite.runtime.sandbox.Sandbox.goingToExecuteSUTCode(); 
    setSystemProperties(); 
    org.evosuite.runtime.GuiSupport.setHeadless(); 
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    org.evosuite.runtime.agent.InstrumentingAgent.activate(); 
  } 

  @After 
  public void doneWithTestCase(){ 
    threadStopper.killAndJoinClientThreads();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().safeExecuteAddedHooks(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.reset(); 
    resetClasses(); 
    org.evosuite.runtime.sandbox.Sandbox.doneWithExecutingSUTCode(); 
    org.evosuite.runtime.agent.InstrumentingAgent.deactivate(); 
    org.evosuite.runtime.GuiSupport.restoreHeadlessMode(); 
  } 

  public static void setSystemProperties() {
 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
    java.lang.System.setProperty("file.encoding", "UTF-8"); 
    java.lang.System.setProperty("java.awt.headless", "true"); 
    java.lang.System.setProperty("java.io.tmpdir", "/tmp"); 
    java.lang.System.setProperty("user.country", "US"); 
    java.lang.System.setProperty("user.dir", "/home/flakt/Dokument/TDA594/eclipse/frameWorkRobots"); 
    java.lang.System.setProperty("user.home", "/home/flakt"); 
    java.lang.System.setProperty("user.language", "en"); 
    java.lang.System.setProperty("user.name", "flakt"); 
    java.lang.System.setProperty("user.timezone", "Europe/Stockholm"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(RadarState_ESTest_scaffolding.class.getClassLoader() ,
      "robocode.Robot",
      "robocode.BattleResults",
      "robocode.control.events.RoundStartedEvent",
      "robocode.control.events.BattleMessageEvent",
      "robocode.RadarTurnCompleteCondition",
      "robocode.control.events.BattleEvent",
      "robocode.HitByBulletEvent",
      "robocode.control.events.TurnStartedEvent",
      "robocode.AdvancedRobot",
      "robocode.WinEvent",
      "net.sf.robocode.security.IHiddenEventHelper",
      "robocode.CustomEvent",
      "robocode.RobotStatus",
      "robocode.robotinterfaces.IInteractiveRobot",
      "robocode.HitWallEvent",
      "robocode.TurnCompleteCondition",
      "robocode.robotinterfaces.IInteractiveEvents",
      "robocode.Event",
      "robocode.Condition",
      "robocode.HitRobotEvent",
      "robocode.ScannedRobotEvent",
      "robocode.MoveCompleteCondition",
      "robocode.control.events.TurnEndedEvent",
      "robocode.robotinterfaces.IAdvancedEvents",
      "radar.SpinningRadar",
      "robocode.control.events.BattleResumedEvent",
      "robocode.robotinterfaces.IBasicEvents",
      "robocode.control.events.BattlePausedEvent",
      "robocode.Bullet",
      "radar.RadarState",
      "robocode.BulletHitBulletEvent",
      "robocode.BattleEndedEvent",
      "robocode.robotinterfaces.IAdvancedRobot",
      "robocode._AdvancedRadiansRobot",
      "robocode.control.events.IBattleListener",
      "robocode.robotinterfaces.peer.IAdvancedRobotPeer",
      "robocode._AdvancedRobot",
      "robocode.robotinterfaces.IBasicRobot",
      "robocode.exception.RobotException",
      "robocode.BulletMissedEvent",
      "robocode.robotinterfaces.IPaintRobot",
      "robocode.BulletHitEvent",
      "robocode.DeathEvent",
      "net.sf.robocode.io.Logger",
      "net.sf.robocode.serialization.ISerializableHelper",
      "net.sf.robocode.security.IHiddenBulletHelper",
      "robocode.RoundEndedEvent",
      "robocode.SkippedTurnEvent",
      "net.sf.robocode.peer.IRobotStatics",
      "robocode.GunTurnCompleteCondition",
      "robocode.robotinterfaces.peer.IStandardRobotPeer",
      "robocode.control.events.BattleErrorEvent",
      "robocode.control.events.BattleStartedEvent",
      "robocode.StatusEvent",
      "robocode.RobotDeathEvent",
      "robocode.robotinterfaces.peer.IBasicRobotPeer",
      "net.sf.robocode.serialization.RbSerializer",
      "robocode.robotinterfaces.IPaintEvents",
      "robocode._RobotBase",
      "robocode.robotinterfaces.IBasicEvents3",
      "robocode.control.events.BattleFinishedEvent",
      "robocode.control.events.BattleCompletedEvent",
      "robocode.control.events.RoundEndedEvent",
      "robocode.robotinterfaces.IBasicEvents2",
      "robocode._Robot"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("robocode.robotinterfaces.peer.IBasicRobotPeer", false, RadarState_ESTest_scaffolding.class.getClassLoader()));
  }

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(RadarState_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "radar.RadarState",
      "robocode._RobotBase",
      "robocode._Robot",
      "robocode.Robot",
      "robocode._AdvancedRobot",
      "robocode._AdvancedRadiansRobot",
      "robocode.AdvancedRobot",
      "radar.SpinningRadar",
      "robocode.exception.RobotException",
      "robocode.Event",
      "robocode.ScannedRobotEvent",
      "net.sf.robocode.io.Logger",
      "robocode.Condition",
      "robocode.GunTurnCompleteCondition",
      "robocode.RadarTurnCompleteCondition",
      "robocode.MoveCompleteCondition",
      "robocode.TurnCompleteCondition"
    );
  }
}
