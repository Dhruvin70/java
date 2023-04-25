import java.util.Arrays;

public class Leetcode_findErrorNums {
    public static void main(String[] args) {
        int[] ar = {1,1};
        System.out.println(Arrays.toString(findErrorNums(ar)));
    }
    public static int[] findErrorNums(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int value = nums[i] - 1;
            if (nums[i] != nums[value]) {
                int temp = nums[i];
                nums[i] = nums[value];
                nums[value] = temp;
            } else {
                i++;
            }
        }

        for (int j = 0; j < nums.length; j++) {
            if (j + 1 != nums[j]) {
                int x = nums[j];
                int y = j+1;
                return new int[]{x, y};
            }
        }
        return new int[]{-1, -1};
    }
}