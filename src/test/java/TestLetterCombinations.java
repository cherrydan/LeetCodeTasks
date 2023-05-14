import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class TestLetterCombinations {

    @Test
    public void test_two_digits() {
       List<String> actualArray = Arrays.asList("ad","ae","af","bd","be","bf","cd","ce","cf");

        Assertions.assertEquals(LetterCombinations.letterCombinations("23"), actualArray);
    }

    @Test
    public void test_empty() {
        List<String> actualArray = List.of();
        Assertions.assertEquals(LetterCombinations.letterCombinations(""), actualArray);
    }

    @Test
    public void test_one_digit() {
        List<String> actualArray = Arrays.asList("a","b","c");
        Assertions.assertEquals(LetterCombinations.letterCombinations("2"), actualArray);
    }
}
