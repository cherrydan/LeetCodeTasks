import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestUniqueSymbol {

    @Test
    public void test1() {
        Assertions.assertEquals(UniqueSymbol.firstUniqChar("leetcode"), 0);
    }

    @Test
    public void test2() {
        Assertions.assertEquals(UniqueSymbol.firstUniqChar("loveleetcode"), 2);
    }

    @Test
    public void test3() {
        Assertions.assertEquals(UniqueSymbol.firstUniqChar("aabb"), -1);
    }
}
