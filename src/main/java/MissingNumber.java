import java.util.Arrays;

public class MissingNumber {

    // перебором
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


    // сдвиг бит
    public static int missingNumberWithShift(int[] nums) {
        int missing = nums.length;
        for(int i = 0; i < nums.length; i++) {
            missing ^= i ^ nums[i];
        }
        return missing;
    }
    // по формуле Гаусса
    public static int missingNumberGauss(int[] nums) {
        int exptectedSum = nums.length * (nums.length + 1) / 2;
        int actualSum = 0;
        for(int num: nums) actualSum += num;
        return exptectedSum - actualSum;
    }
}
