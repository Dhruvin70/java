import java.util.Arrays;

public class LeetCode_Min_Pair_Sum {
    public static void main(String[] args) {
        int[] arrays = {4,1,5,1,2,5,1,5,5,4};
        System.out.println(minPairSum(arrays));
    }
    public static int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int max = 0;
        int i = 0 ;
        int j = nums.length-1;
//        for (int k = 0; k < nums.length/2; k++) {
            while (i < j) {
                max = Math.max(max, nums[i++] + nums[j--]);
            }

        return max;
    }
}
