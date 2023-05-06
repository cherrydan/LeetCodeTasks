import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestIntToEnglishWord {
    @Test
    public void test_1() {
        Assertions.assertEquals(IntToEnglishWord.numberToWords(111_111_111),
                "One Hundred Eleven Million One Hundred Eleven Thousand One Hundred Eleven");
    }

    @Test
    public void test_2() {
        Assertions.assertEquals(IntToEnglishWord.numberToWords(2_147_483_647),
                "Two Billion One Hundred Forty Seven Million Four Hundred Eighty Three Thousand Six Hundred" +
                        " Forty Seven");
    }
}
