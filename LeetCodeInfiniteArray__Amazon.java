import java.util.Arrays;

public class LeetCodeInfiniteArray__Amazon {
    public static void main(String[] args) {
        int[] nums = {1,2,5,6,9,11,16,19,20,25,30};
        int target = 9;

        int ans = findStart_End(nums ,target);
        System.out.println(ans);
    }
    public static int findStart_End(int[] arr, int target) {
        int start = 0;
        int end = 1;
        while(target>arr[end]){
            int tempStart=end+1;
            end = end + ((end - start + 1) * 2);
            start = tempStart;
        }
        return binarySearch(arr,target,start ,end);
    }

    static int binarySearch(int[] arr ,int target , int start ,int end){


        while(start<=end){

            //sometimes integer range can exceed the int value only when ascending order of array

            int mid = start + (end - start)/2;

            if(target< arr[mid]){
                end = mid - 1;
            } else if (target>arr[mid]) {
                start = mid +1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
