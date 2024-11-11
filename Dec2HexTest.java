import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Unit test class for the Dec2Hex class.
 * This class tests the decimalToHex method to ensure it converts decimal integers
 * into their correct hexadecimal string representations.
 */


public class Dec2HexTest {

    /**
     * Setup method for the test class.
     * This method runs before each test case.
     * Currently, it doesn't perform any setup, but is included for potential future use.
     */


    @Before
    public void setUp() {
      // Intentionally left empty as no setup is needed for these tests

    }


     /**
     * Test method to verify the correctness of the decimalToHex method.
     * It includes a variety of test cases to check different input scenarios.
     */


    @Test
    public void testDecimalToHex() {

        // Test case for a basic decimal input of 10
        // The expected hexadecimal output for 10 is "A"

        assertEquals("Should return 'A' for 10", "A", Dec2Hex.decimalToHex(10));

        // Test case for a decimal input of 31
        // The expected hexadecimal output for 31 is "1F"

        assertEquals("Should return '1F' for 31", "1F", Dec2Hex.decimalToHex(31));

        // Test case for a decimal input of 255
        // The expected hexadecimal output for 255 is "FF"

        assertEquals("Should return 'FF' for 255", "FF", Dec2Hex.decimalToHex(255));

        // Test case for the smallest input 0
        // The expected output for 0 is "0" since it represents zero in hexadecimal

        assertEquals("Should return '0' for 0", "0", Dec2Hex.decimalToHex(0));
    }
}
