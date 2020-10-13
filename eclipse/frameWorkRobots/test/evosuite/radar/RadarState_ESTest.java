/*
 * This file was automatically generated by EvoSuite
 * Sat Dec 28 15:57:46 GMT 2019
 */

package radar;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import radar.SpinningRadar;
import robocode.AdvancedRobot;
import robocode.ScannedRobotEvent;
import robocode.robotinterfaces.peer.IBasicRobotPeer;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class RadarState_ESTest extends RadarState_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      AdvancedRobot advancedRobot0 = new AdvancedRobot();
      SpinningRadar spinningRadar0 = new SpinningRadar(advancedRobot0);
      // Undeclared exception!
      try { 
        spinningRadar0.run();
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // You cannot call the turnRadarRightRadians() method before your run() method is called, or you are using a Robot object that the game doesn't know about.
         //
         verifyException("robocode._RobotBase", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      SpinningRadar spinningRadar0 = new SpinningRadar((AdvancedRobot) null);
      // Undeclared exception!
      try { 
        spinningRadar0.run();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("radar.SpinningRadar", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      AdvancedRobot advancedRobot0 = new AdvancedRobot();
      IBasicRobotPeer iBasicRobotPeer0 = mock(IBasicRobotPeer.class, new ViolatedAssumptionAnswer());
      advancedRobot0.setPeer(iBasicRobotPeer0);
      SpinningRadar spinningRadar0 = new SpinningRadar(advancedRobot0);
      // Undeclared exception!
      try { 
        spinningRadar0.run();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // robocode.robotinterfaces.peer.IBasicRobotPeer$MockitoMock$464884520 cannot be cast to robocode.robotinterfaces.peer.IAdvancedRobotPeer
         //
         verifyException("robocode._AdvancedRadiansRobot", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      AdvancedRobot advancedRobot0 = new AdvancedRobot();
      SpinningRadar spinningRadar0 = new SpinningRadar(advancedRobot0);
      ScannedRobotEvent scannedRobotEvent0 = new ScannedRobotEvent();
      spinningRadar0.onScannedRobot(scannedRobotEvent0);
      assertEquals(0.0, scannedRobotEvent0.getVelocity(), 0.01);
  }
}