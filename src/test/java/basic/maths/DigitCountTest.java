package basic.maths;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DigitCountTest {

    @Test
    void testDigitCountOptimal() {
        assertEquals(1, DigitCount.digitCountOptimal(0), "Failed for 0");
        assertEquals(3, DigitCount.digitCountOptimal(123), "Failed for positive number");
        assertEquals(3, DigitCount.digitCountOptimal(-123), "Failed for negative number");
    }

    @Test
    void testDigitCountUsingCounter() {
        assertEquals(1, DigitCount.digitCountUsingCounter(0), "Failed for 0");
        assertEquals(3, DigitCount.digitCountUsingCounter(123), "Failed for positive number");
        assertEquals(3, DigitCount.digitCountUsingCounter(-123), "Failed for negative number");
    }
}
