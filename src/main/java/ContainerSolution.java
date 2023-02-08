public class ContainerSolution {

    public static int maxArea(int[] height) {
        int i = 0; // левая сторона нашего массива
        int j = height.length - 1; //правая сторона нашего массива
        int max_water_value = 0;
        while (i != j) {
            int left = height[i];
            int right = height[j];
            int current_val = Math.min(left, right) * (j - i);
            if(max_water_value < current_val) {
                max_water_value = current_val;
            }
            if(left > right) j--; else i++;
        }
        return max_water_value;
    }


    public static void main(String[] args) {
        int[] neight = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(neight));
    }

}
