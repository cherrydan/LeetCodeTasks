import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class TestIntToRoman {
    @ParameterizedTest
    @CsvSource(value = {

            "3, III",
            "58, LVIII",
            "1994, MCMXCIV",
            "27, XXVII",
            "971, CMLXX"

    })
    public void testIntToRoman(int num, String expected) {
        Assertions.assertEquals(IntegerToRoman.intToRoman(num), expected);
    }
}
