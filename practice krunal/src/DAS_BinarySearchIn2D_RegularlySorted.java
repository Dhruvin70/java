import java.util.Arrays;

public class DAS_BinarySearchIn2D_RegularlySorted {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4,5,6},
                        {7,8,9,10,11,12},
                         {13,14,15,16,17,18},
                          {19,20,21,22,23,24}
        };
        System.out.println(Arrays.toString(checking(arr,30)));
    }
    public static int[] checking(int[][] arr, int target) {
        int row = arr.length;
        int cols = arr[0].length;
        int rStart = 0;
        int rEnd = row - 1;
        int cMid = cols / 2;
        if (row == 1) {
            binarySearch(arr, target, 0, cols - 1, 0);
        }
        while (rStart < (rEnd - 1)) {
            int mid = rStart - ( rStart - rEnd) / 2;
            if (arr[mid][cMid] == target) {
                return new int[]{mid, cMid};
            }
            if (target > arr[mid][cMid]) {
                rStart = mid;
            } else {
                rEnd = mid;
            }
        }
        if (arr[rStart][cMid] == target) {
            return new int[]{rStart, cMid};
        }
        if (arr[rStart + 1][cMid] == target) {
            return new int[]{rStart + 1, cMid};
        }
        if (target <= arr[rStart][cMid - 1]) {
            return binarySearch(arr, target, 0, cMid - 1, rStart);
        }
        if (target >= arr[rStart][cMid + 1] && target <= arr[rStart][cols-1]) {
            return binarySearch(arr, target, cMid + 1, cols - 1, rStart);
        }
        if (target <= arr[rStart + 1][cMid - 1]) {
            return binarySearch(arr, target, 0, cMid - 1, rStart + 1);
        } else {
            return binarySearch(arr, target, cMid + 1, cols - 1, rStart);
        }

    }


    static int[] binarySearch(int[][] arr , int target , int cStart  , int cEnd , int row){
        while(cStart<=cEnd){
            int mid = cStart - (cStart - cEnd)/2;
            if(arr[row][mid]==target){
                return new int[]{row,mid};
            }
            if(arr[row][mid]<target){
                cStart = mid+1;
            }
            else {
                cEnd = mid -1;
            }
        }
        return new int[]{-1,-1};
    }
}
