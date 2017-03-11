import junit.framework.TestCase;

/**
 * Created by Joel on 3/1/2017.
 */
public class CalculationTest extends TestCase{
        private int value1;
        private int value2;

        public CalculationTest(String testName) {
            super(testName);
        }
        //sets up whatever values or information tests needs before test
        protected void setUp() throws Exception {
            super.setUp();
            value1 = 3;
            value2 = 5;
        }
        //deletes any info that was stored after test case has been run
        protected void tearDown() throws Exception {
            super.tearDown();
            value1 = 0;
            value2 = 0;
        }
        // add method test
        public void testAdd() {
            int total = 8;
            int sum = Calculation.add(value1, value2);
            assertEquals(sum, total);
        }
        //verify that it can fail
        public void testFailedAdd() {
            int total = 9;
            int sum = Calculation.add(value1, value2);
            assertNotSame(sum, total);
        }
        // check the sub method
        public void testSub() {
            int total = 0;
            int sub = Calculation.sub(2, 2);
            assertEquals(sub, total);
        }
    }

