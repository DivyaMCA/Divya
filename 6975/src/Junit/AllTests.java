package Junit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ AllTests.class, Testadd.class, Testclass.class, Testmul.class, Testsub.class })

public class AllTests {

}
