import java.util.ArrayList;
import java.util.List;

public class Practice_Cyclic_Missing_Multiple {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        System.out.println(findDisappearedNumbers(arr));
    }
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        int i = 0;
        while(i<nums.length){
            int correct = nums[i] -1;
            if(nums[i] != nums[correct]){
                int temp = nums[i];
                nums[i] = nums[correct];
                nums[correct]= temp;
            }
            else{
                i++;
            }
        }
        List<Integer> ans = new ArrayList();
        for(int j = 0 ; j<nums.length ; j++){
            if(nums[j] != j+1){
                ans.add(j + 1);
            }
        }
        return ans;
    }
}

