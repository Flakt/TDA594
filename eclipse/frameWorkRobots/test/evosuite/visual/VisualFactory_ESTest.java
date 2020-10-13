/*
 * This file was automatically generated by EvoSuite
 * Sat Dec 28 15:51:50 GMT 2019
 */

package visual;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import robocode.AdvancedRobot;
import visual.VisualFactory;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class VisualFactory_ESTest extends VisualFactory_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      // Undeclared exception!
      try { 
        VisualFactory.getRadar((AdvancedRobot) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("visual.PaintWaves", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      AdvancedRobot advancedRobot0 = new AdvancedRobot();
      // Undeclared exception!
      try { 
        VisualFactory.getRadar(advancedRobot0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // robocode.AdvancedRobot cannot be cast to robots.VariantBot
         //
         verifyException("visual.PaintWaves", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      VisualFactory visualFactory0 = new VisualFactory();
  }
}