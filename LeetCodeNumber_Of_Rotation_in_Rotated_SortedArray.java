public class LeetCodeNumber_Of_Rotation_in_Rotated_SortedArray {

    public static void main(String[] args) {
        int[] arr ={15,18,19,0,1,2,3,4,5,6};
        System.out.println(findPivot_and_Calculating(arr));
    }
    public static int findPivot_and_Calculating(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start - (start - end)/2;
            if(mid<end && arr[mid]>arr[mid+1]){

                return mid + 1;
            }
            if(start<mid && arr[mid-1]>arr[mid]){
                return mid ;
            }
            if(arr[start]>=arr[mid]){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return 0;
    }
}
