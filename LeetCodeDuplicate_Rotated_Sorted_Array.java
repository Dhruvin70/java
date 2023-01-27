public class LeetCodeDuplicate_Rotated_Sorted_Array {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        int target = 0;
        System.out.println(search(arr,target));
    }
    public static int search(int[] arr , int target){
        int pivot = findPivot(arr);

        if(pivot==-1){
            return binarySearch(arr,target,0, arr.length-1);
        }
        if (arr[pivot]==target){
            return pivot;
        }
        if(target>=arr[0]){
            return binarySearch(arr,target,0,pivot-1);
        }

        return binarySearch(arr,target,pivot +1,arr.length - 1);

    }
    static int binarySearch(int[] arr ,int target ,int start,int end ){
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
    static int findPivot(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start - (start - end)/2;
            if(mid<end && arr[mid]> arr[mid+1]){
                return mid;
            }
            if(mid>start && arr[mid]<arr[mid-1]){
                return mid - 1;
            }
            if(arr[mid]==arr[start] && arr[mid]==arr[end]){

                if (arr[start]>arr[start+1]){
                    return start;
                }
                start++;
                if(arr[end]<arr[end-1]){
                    return end-1;
                }
                end--;
            }
            else if(arr[start]< arr[mid] ||  (arr[mid]==arr[start] && arr[mid]>arr[end])){
                start = mid +1;
            }
            else{
                end = mid -1;
            }
        }
        return -1;
    }
}

