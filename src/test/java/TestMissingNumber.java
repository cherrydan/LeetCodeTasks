import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestMissingNumber {
    @Test
    public void test1() {
        int[] nums = {3, 0, 1};
        Assertions.assertEquals(MissingNumber.missingNumber(nums), 2);
    }

    @Test
    public void test2() {
        int[] nums = {0, 1};
        Assertions.assertEquals(MissingNumber.missingNumberWithShift(nums), 2);
    }

    @Test
    public void test3() {
        int[] nums = {9,6,4,2,3,5,7,0,1};
        Assertions.assertEquals(MissingNumber.missingNumberGauss(nums), -1);
    }
}
