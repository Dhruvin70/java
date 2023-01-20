import java.util.Arrays;

public class Question_First_and_Last_ElementIndex {
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,3,3,3,3,5};
        System.out.println(Arrays.toString(lastIndex(arr, 6)));

    }
        public static int firstIndex(int[] arr , int target){

            int start = 0;
            int end = arr.length-1;
            int ans = -1;
            while(start<=end){
                int mid = start + (end - start)/2;
                if(arr[mid]==target){
                    ans = mid;
                    end = mid -1;
                }
                else if(arr[mid]>target){
                    end = mid -1;
                }
                else {
                    start = mid + 1;
                }
            }
        return ans;
    }
   public static int[] lastIndex(int[] arr , int target){
       int start = 0;
       int end = arr.length-1;
       int ans = -1;
       while(start<=end){
           int mid = start + (end - start)/2;
           if(arr[mid]==target){
               ans = mid;
               start = mid +1;
           }
           else if(arr[mid]>target){
               end = mid -1;
           }
           else {
               start = mid + 1;
           }
       }
       return new int[]{firstIndex(arr, target),ans};
  }

}