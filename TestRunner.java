import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import java.util.logging.Logger;

/**
 * TestRunner class to execute unit tests in Dec2HexTest.
 * This class uses JUnit to run all the test cases defined in Dec2HexTest
 * and provides a summary of the test results in the console.
 */


public class TestRunner {

  // Initialize the logger
    private static final Logger logger = Logger.getLogger(TestRunner.class.getName());


   public static void main(String[] args) {

      // Run all tests in the Dec2HexTest class
      Result result = JUnitCore.runClasses(Dec2HexTest.class);
      int fails = 0;

      try {

          // Loop through each failure in the test results
          for (Failure failure : result.getFailures()) {
             // Log the failure details (stack trace or error message)
             logger.severe(failure.toString());
             fails++;
         }
         // Check if there were any failed tests
         if (fails > 0) {
            // Throw a custom exception to indicate unsuccessful test run
              throw new TestFailureException(fails + " tests failed");
         }

         // If no failures, log success message
          logger.info("All tests passed successfully: " + result.wasSuccessful());
      } catch (TestFailureException e) {

         // Log the exception message and exit with status code 1
          logger.severe(e.getMessage());
          System.exit(1);
      }
          // Exit with status code 0 to indicate successful test run
          System.exit(0);
   }
}
 

// Custom exception to handle test failures
class TestFailureException extends Exception {
    public TestFailureException(String message) {
        super(message);
    }
}
