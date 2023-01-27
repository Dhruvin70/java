import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class exam {
    public static void main(String[] args) {
        int[] nums = {1,2,3,7,3,9,7};
        System.out.println(findDisappearedNumbers(nums));
    }

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result = new ArrayList<>();


        for (int n = 0; n < nums.length; n++) {
            int val = Math.abs(nums[n]) - 1;
            if (nums[val] > 0) {
                nums[val] = -nums[val];
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                result.add(i + 1);
            }


        }

        return result;
    }
}