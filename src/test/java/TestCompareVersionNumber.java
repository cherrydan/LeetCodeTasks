import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestCompareVersionNumber {
    @Test
    public void testVersionNumberComparison1() {
        Assertions.assertEquals(CompareVersionNumber.compareVersion("1.01", "1.001"), 0);
    }

    @Test
    public void testVersionNumberComparison2() {
        Assertions.assertEquals(CompareVersionNumber.compareVersion("1.0", "1.0.0"), 0);
    }

    @Test
    public void testVersionComparison3() {
        Assertions.assertEquals(CompareVersionNumber.compareVersion("0.1", "1.1"), -1);
    }
}
