import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestValidBrackets {

//    @ParameterizedTest
//    @ValueSource(strings = {"(abc)", "(({}[()]))",
//                            "()[]{}"})
//    public void testValidBrackets(String s) {
//        Assertions.assertTrue(ValidBracketsSolution.isValid(s));
//    }

    @Test
    public void testValidBrackets1() {
        Assertions.assertTrue(ValidBracketsSolution.isValid("(abc)"));

    }

    @Test
    public void testValidBrackets2() {
        Assertions.assertTrue(ValidBracketsSolution.isValid("(({}[()]))"));
    }

    @Test
    public void testValidBrackets3() {
        Assertions.assertTrue(ValidBracketsSolution.isValid( "()[]{}"));
    }
}
