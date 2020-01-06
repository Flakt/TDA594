/*
 * This file was automatically generated by EvoSuite
 * Sat Dec 28 15:49:48 GMT 2019
 */

package movement;

import org.junit.Test;
import static org.junit.Assert.*;
import movement.MovementFactory;
import movement.WaveSurfing;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import robocode.AdvancedRobot;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class MovementFactory_ESTest extends MovementFactory_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      AdvancedRobot advancedRobot0 = new AdvancedRobot();
      WaveSurfing waveSurfing0 = (WaveSurfing)MovementFactory.getMovement(advancedRobot0);
      assertEquals(47, WaveSurfing.BINS);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      MovementFactory movementFactory0 = new MovementFactory();
  }
}
