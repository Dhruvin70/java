import java.util.Arrays;

public class SearchingTheRangeOfTotalNumbers {
    public  static void main(String[] args) {
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 7;
        int [] ob = searchRange(nums ,target);
        System.out.println(Arrays.toString(ob));
    }
    public static int[] searchRange(int[] nums, int target) {
        int[] ans = {-1, -1};
        int start = searchRange(nums , target ,true);
        /*
        -----
         */
        int end = searchRange(nums , target , false);

        /*
        ---
        if(ans[0]!=-1){
            ans[1] = searchRange(nums , target , false);
        }
         */

        ans[0]=start;
        ans[1]=end;

        return ans;
    }

     static  int searchRange(int[] nums, int target, boolean findStartIndex) {
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
               ans = mid;
               if(findStartIndex){
                   end =mid - 1;
               }
               else{
                   start = mid + 1;
               }

            }
        }

        return ans;
    }
}