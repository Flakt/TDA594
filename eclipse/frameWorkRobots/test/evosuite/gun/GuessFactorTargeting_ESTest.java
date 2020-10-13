/*
 * This file was automatically generated by EvoSuite
 * Sat Dec 28 15:52:50 GMT 2019
 */

package gun;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import gun.GuessFactorTargeting;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import robocode.AdvancedRobot;
import robocode.ScannedRobotEvent;
import robocode.robotinterfaces.peer.IBasicRobotPeer;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class GuessFactorTargeting_ESTest extends GuessFactorTargeting_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ScannedRobotEvent scannedRobotEvent0 = new ScannedRobotEvent();
      AdvancedRobot advancedRobot0 = new AdvancedRobot();
      IBasicRobotPeer iBasicRobotPeer0 = mock(IBasicRobotPeer.class, new ViolatedAssumptionAnswer());
      doReturn(0.0).when(iBasicRobotPeer0).getBodyHeading();
      doReturn(0.0).when(iBasicRobotPeer0).getGunHeading();
      doReturn(0.0).when(iBasicRobotPeer0).getX();
      doReturn(0.0).when(iBasicRobotPeer0).getY();
      advancedRobot0.setPeer(iBasicRobotPeer0);
      GuessFactorTargeting guessFactorTargeting0 = new GuessFactorTargeting(advancedRobot0);
      // Undeclared exception!
      try { 
        guessFactorTargeting0.onScannedRobot(scannedRobotEvent0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // robocode.robotinterfaces.peer.IBasicRobotPeer$MockitoMock$1329601853 cannot be cast to robocode.robotinterfaces.peer.IAdvancedRobotPeer
         //
         verifyException("robocode._AdvancedRadiansRobot", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      AdvancedRobot advancedRobot0 = new AdvancedRobot();
      IBasicRobotPeer iBasicRobotPeer0 = mock(IBasicRobotPeer.class, new ViolatedAssumptionAnswer());
      doReturn((-5051.31)).when(iBasicRobotPeer0).getBodyHeading();
      doReturn((-5051.31)).when(iBasicRobotPeer0).getX();
      doReturn(3.141592653589793).when(iBasicRobotPeer0).getY();
      advancedRobot0.setPeer(iBasicRobotPeer0);
      GuessFactorTargeting guessFactorTargeting0 = new GuessFactorTargeting(advancedRobot0);
      ScannedRobotEvent scannedRobotEvent0 = new ScannedRobotEvent("gun.GuessFactorTargeting", (-1509.234), 806.9, (-1391.1917345147751), (-660.9884145020039), (-5051.31), true);
      // Undeclared exception!
      try { 
        guessFactorTargeting0.onScannedRobot(scannedRobotEvent0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -7
         //
         verifyException("utils.GFTWave", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      AdvancedRobot advancedRobot0 = new AdvancedRobot();
      IBasicRobotPeer iBasicRobotPeer0 = mock(IBasicRobotPeer.class, new ViolatedAssumptionAnswer());
      doReturn(0.0).when(iBasicRobotPeer0).getBodyHeading();
      doReturn(0.0).when(iBasicRobotPeer0).getX();
      doReturn(0.0).when(iBasicRobotPeer0).getY();
      advancedRobot0.setPeer(iBasicRobotPeer0);
      GuessFactorTargeting guessFactorTargeting0 = new GuessFactorTargeting(advancedRobot0);
      ScannedRobotEvent scannedRobotEvent0 = new ScannedRobotEvent("!frr[4MomDk|L86", 0.0, (-3414.6143802329143), 806.9, (-376.493293041), 806.9);
      // Undeclared exception!
      try { 
        guessFactorTargeting0.onScannedRobot(scannedRobotEvent0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 403
         //
         verifyException("utils.GFTWave", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      AdvancedRobot advancedRobot0 = new AdvancedRobot();
      IBasicRobotPeer iBasicRobotPeer0 = mock(IBasicRobotPeer.class, new ViolatedAssumptionAnswer());
      doReturn((-5051.31)).when(iBasicRobotPeer0).getBodyHeading();
      doReturn((-5051.31)).when(iBasicRobotPeer0).getGunHeading();
      doReturn((-5051.31)).when(iBasicRobotPeer0).getX();
      doReturn(3.141592653589793).when(iBasicRobotPeer0).getY();
      advancedRobot0.setPeer(iBasicRobotPeer0);
      GuessFactorTargeting guessFactorTargeting0 = new GuessFactorTargeting(advancedRobot0);
      ScannedRobotEvent scannedRobotEvent0 = new ScannedRobotEvent((String) null, (-5051.31), (-1509.234), 4.71238898038469, 3.141592653589793, 0.0);
      // Undeclared exception!
      try { 
        guessFactorTargeting0.onScannedRobot(scannedRobotEvent0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // robocode.robotinterfaces.peer.IBasicRobotPeer$MockitoMock$1329601853 cannot be cast to robocode.robotinterfaces.peer.IAdvancedRobotPeer
         //
         verifyException("robocode._AdvancedRadiansRobot", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      GuessFactorTargeting guessFactorTargeting0 = new GuessFactorTargeting((AdvancedRobot) null);
      ScannedRobotEvent scannedRobotEvent0 = new ScannedRobotEvent();
      // Undeclared exception!
      try { 
        guessFactorTargeting0.onScannedRobot(scannedRobotEvent0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("gun.GuessFactorTargeting", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      AdvancedRobot advancedRobot0 = new AdvancedRobot();
      GuessFactorTargeting guessFactorTargeting0 = new GuessFactorTargeting(advancedRobot0);
      ScannedRobotEvent scannedRobotEvent0 = new ScannedRobotEvent();
      // Undeclared exception!
      try { 
        guessFactorTargeting0.onScannedRobot(scannedRobotEvent0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // You cannot call the getHeadingRadians() method before your run() method is called, or you are using a Robot object that the game doesn't know about.
         //
         verifyException("robocode._RobotBase", e);
      }
  }
}