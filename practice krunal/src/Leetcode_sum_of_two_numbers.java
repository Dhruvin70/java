import java.util.Arrays;

public class Leetcode_sum_of_two_numbers {
    public static void main(String[] args) {

        int[] ar = {3,2,4};
        System.out.println(Arrays.toString(twoSum(ar, 6)));

    }
    public static int[] twoSum(int[] arr, int target) {
        int start = 0;
        while(start<arr.length-1){
            for (int i = start+1; i < arr.length;i++){
                int sum = arr[start] + arr[i];
                if(sum==target){
                    return new int[]{start,i};
                }
            }
            start++;
        }
        return null;
    }

}
