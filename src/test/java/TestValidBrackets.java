import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class TestValidBrackets {

    @ParameterizedTest
    @ValueSource(strings = {"(abc)", "(({}[()]))",
                            "()[]{}"})
    public void testValidBrackets(String s) {
        Assertions.assertTrue(ValidBracketsSolution.isValid(s));
    }
}
