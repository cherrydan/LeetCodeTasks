import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestContainer {
    @Test
    public void testContainer1() {
        Assertions.assertEquals(ContainerSolution.maxArea(new int[]{1,8,6,2,5,4,8,3,7}), 49);
    }

    @Test
    public void testContainer2() {
        Assertions.assertEquals(ContainerSolution.maxArea(new int[]{1, 1}), 1);
    }
}
