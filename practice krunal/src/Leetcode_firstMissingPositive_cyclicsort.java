public class Leetcode_firstMissingPositive_cyclicsort {
    public static void main(String[] args) {
        int[] n = {1,-1};
        System.out.println(firstMissingPositive(n));
    }
    public static int firstMissingPositive(int[] nums){
    int i =0;
        while(i<nums.length){
    int value= nums[i]-1 ;
            if(nums[i]>0 && nums[i]< nums.length && nums[i]!=nums[value]) {
                int temp = nums[i];
                nums[i] = nums[value];
                nums[value] = temp;
            }
            else {
                i++;}
            }
        for (int j = 0; j < nums.length; j++) {

                if(j+1 != nums[j]){
                    return j+1;
                }
        }
        return nums.length+1;
    }
}
