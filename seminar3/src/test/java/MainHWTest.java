import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class MainHWTest {

    @Test
    @ParameterizedTest
    @ValueSource(ints = {-2, 0, 4})
    public void testNumberIsEven(int n) {
        assertTrue(MainHW.evenOddNumber(n));
    }

    @Test
    @ParameterizedTest
    @ValueSource(ints = {-1, 3})
    public void testNumberIsOdd(int n) {
        assertFalse(MainHW.evenOddNumber(n));
    }

    @Test
    @ParameterizedTest
    @ValueSource(ints = {26, 50, 99})
    public void testNumberInRange25To100(int n) {
        assertTrue(MainHW.numberInInterval(n));
    }

    @Test
    @ParameterizedTest
    @ValueSource(ints = {25, 100})
    public void testNumberNotInRange25To100(int n) {
        assertFalse(MainHW.numberInInterval(n));
    }
}