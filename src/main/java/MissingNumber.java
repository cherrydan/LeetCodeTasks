import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MissingNumber {

    public static int missingNumber(int[] nums) {

        Arrays.sort(nums);
        if(nums[nums.length-1] != nums.length) {
            return nums.length;
        }

        else if(nums[0] != 0) {
            return 0;
        }

        for(int i = 1; i < nums.length; i++) {
            int expectedNum = nums[i - 1] + 1;
            if(nums[i] != expectedNum) {
                return expectedNum;
            }
        }
        return -1;

    }

    public static int missingNumberWithHash(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        for(int num: nums) numSet.add(num);
        int expectedNumCount = nums.length - 1;
        for(int number = 0; number < expectedNumCount; number++) {
            if(!numSet.contains(number)) {
                return number;
            }
        }

        return -1;
    }
}