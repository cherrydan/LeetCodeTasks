import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestIntToRoman {
    @Test
    public void testIntToRoman1() {
        Assertions.assertEquals(IntegerToRoman.intToRoman(671), "DCLXXI");
    }

    @Test
    public void testIntToRoman2() {
        Assertions.assertEquals(IntegerToRoman.intToRoman(1994), "DCLXXI");
    }
}
