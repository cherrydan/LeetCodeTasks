import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestTwoSum {


    @Test
    public void testTwoSum1() {
        Assertions.assertArrayEquals(TwoSumSolution.twoSum(new Integer[]{ 2, 3, 4}, 6), new Integer[]{0, 2});
    }

    @Test
    public void testTwoSum2() {
        Assertions.assertArrayEquals(TwoSumSolution.twoSum(new Integer[]{ 2, 7, 11, 15}, 9),
                new Integer[]{0, 1});
    }

    @Test
    public void testTwoSum3() {
        Assertions.assertArrayEquals(TwoSumSolution.twoSum(new Integer[]{ 2, 7, 11, 15}, 26),
                new Integer[]{2, 3});
    }


}
