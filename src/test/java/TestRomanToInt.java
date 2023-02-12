import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestRomanToInt {

    @Test
    public void testRomanToInt1() {
        Assertions.assertEquals(RomanToInteger.romanToInt("DCLXXI"), 671);
    }

    @Test
    public void testRomanToInt2() {
        Assertions.assertEquals(RomanToInteger.romanToInt("MCMXCIV"), 1994);
    }

    @Test
    public void testRomanToInt3() {
        Assertions.assertEquals(RomanToInteger.romanToInt("MCMLXXVIII"), 1978);
    }

}
