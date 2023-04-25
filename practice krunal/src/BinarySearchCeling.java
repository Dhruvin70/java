public class BinarySearchCeling {
    public static void main(String[] args) {
        int[] array = {2,3,5,8,6,15,20,25,29,30};
        int goal = 16;
        int ans = binarySearch(array,goal);
        System.out.println(ans);
    }
    static int binarySearch(int[] arr ,int target){
        if(target> arr[arr.length - 1]){
            return -1;
        }

        int start = 0;
        int end = arr.length-1;
        while(start<=end){

            //sometimes integer range can exceed the int value only when ascending order of array

            int mid = start - (start - end)/2;

            if(target< arr[mid]){
                end = mid - 1;
            } else if (target>arr[mid]) {
                start = mid +1;
            }
            else{
                return arr[mid];
            }
        }
        // for floor return become end when it his condition where end<start  where our answer lies   in    end    mid    start
        return arr[start];
    }
}
