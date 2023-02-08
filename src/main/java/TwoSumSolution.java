import java.util.Arrays;
import java.util.HashMap;


public class TwoSumSolution {

        public static Integer[] twoSum(Integer[] nums, int target) {
            HashMap<Integer, Integer> num_map = new HashMap<>();
            for(int i = 0; i < nums.length; i++) {
                num_map.put(nums[i], i);
            }

            for(int i = 0; i < nums.length; i++) {
                int diff = target - nums[i];
                if(num_map.containsKey(diff) && i != num_map.get(diff)) {
                    return  new Integer[] {i, num_map.get(diff)};
                }
            }
            return null;
        }

        public static void main(String[] args) {
            Integer[] list = {2, 3, 4 };
            System.out.println(Arrays.toString(twoSum(list, 6)));

        }
}

