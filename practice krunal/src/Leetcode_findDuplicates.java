import java.util.ArrayList;
import java.util.List;

public class Leetcode_findDuplicates {
    public static void main(String[] args) {
        int[] x = {4,3,2,7,8,2,3,1};
        System.out.println(findDuplicates(x));
    }
    public static List<Integer> findDuplicates(int[] nums) {
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
        List<Integer> ans = new ArrayList();
        int k = 0;
        for(int j = 0 ; j<nums.length ;j++){
            if(j != nums[j] -1){

                    ans.add(nums[j]);

            }
        }
        return ans;
    }
}

