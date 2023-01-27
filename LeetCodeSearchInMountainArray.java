public class LeetCodeSearchInMountainArray {
    public static void main(String[] args) {
        int[] a = {0,1, 2, 4, 5, 3, 1};
        int tar = 3;
        System.out.println(process(a, tar));
    }

    public static int searchInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }

        }
        return start;
    }

    static int process(int[] arr, int target) {

        int start = 0;
        int end = searchInMountainArray(arr);
        while (start <= end) {

            //sometimes integer range can exceed the int value only when ascending order of array

            int mid = start - (start - end) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return end(arr, target);
    }

    static int end(int[] arr, int target) {
        int start = searchInMountainArray(arr) + 1;
        int end = arr.length - 1;

        while (start <= end) {

            //sometimes integer range can exceed the int value only when ascending order of array

            int mid = start - (start - end) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
