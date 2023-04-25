public class DAS_BinarySearch {
    public static void main(String[] args) {
        int[] array = {2};
        int goal = 30;
        int ans = binarySearch(array,goal);
        System.out.println(ans);
    }
    static int binarySearch(int[] arr ,int target){

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
                return mid;
            }
        }
        return -1;
    }
}
