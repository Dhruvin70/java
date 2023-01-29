public class Leetcode_Finding_Duplicate_Numbers {
    public static void main(String[] args) {
        int[] nums = {1,3,4,2};
        System.out.println(findduplicateNumber(nums));
    }
    public  static int findduplicateNumber(int[] nums){
        int i =0 ;
        while (i<nums.length){
            int value = nums[i] - 1;
            if (nums[i] != nums[value]){
                int temp = nums[i];
                nums[i] = nums[value];
                nums[value] = temp;
            }
            else{ i++;}
        }
        int j = 0;
        while (j < nums.length) {
            if(j != nums[j] -1){
                return nums[j];
            }
            j++;
        }
        return -1;
    }
}
