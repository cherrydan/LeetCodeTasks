import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestRomanToInt {
    private final String[] romans = {"DCLXXI", "MCMXCIV", "MCMLXXVII" };
    private final int[] numbers = { 671, 1994, 1978 };
    @Test
    public void testRomanToInt1() {
        for (int i = 0; i < romans.length; i++) {
            Assertions.assertEquals(RomanToInteger.romanToInt(romans[i]), numbers[i]);
        }
    }

}
