import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Dec2HexTest {

    @Before
    public void setUp() {

    }

    @Test
    public void testDecimalToHex() {
        assertEquals("Should return 'A' for 10", "A", Dec2Hex.decimalToHex(10));
        assertEquals("Should return '1F' for 31", "1F", Dec2Hex.decimalToHex(31));
        assertEquals("Should return 'FF' for 255", "FF", Dec2Hex.decimalToHex(255));
        assertEquals("Should return '0' for 0", "0", Dec2Hex.decimalToHex(0));
    }
}
