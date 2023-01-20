import java.util.Arrays;

public class DSA_LinearSearchIn2D {

    //Searching element in array
    static int[] arr1(int[][] arry , int target) {
        for (int row = 0; row < arry.length; row++) {
            for (int col = 0; col < arry[row].length; col++) {
                int element = arry[row][col];
                if (element == target) {
                    return new int[]{row+1,col+1};
                }
            }
        }
        return new int[]{-1,-1};
    }

    //Searching max value in element

    static int arr2(int[][] arry) {
        int max = Integer.MIN_VALUE;
        for (int row = 0; row < arry.length; row++) {
            for (int col = 0; col < arry[row].length; col++) {
                int element = arry[row][col];
                if (element>max) {
                    max = element;
                }

            }
        }
        return max;
    }

    //Searching min value in element
    static int arr3(int[][] arry) {
        int min = Integer.MAX_VALUE;
        for (int row = 0; row < arry.length; row++) {
            for (int col = 0; col < arry[row].length; col++) {
                int element = arry[row][col];
                if (element< min) {
                    min = element;
                }

            }
        }
        return min;
    }


    public static void main(String[] args) {
        int[][] nums = {
                {23,4,1},
                {18,12,3,9},
                {78,199,34,56},
                {18,12}};
        int target = 100;
        int[] ans  = arr1(nums,target);
        System.out.println(Arrays.toString(ans));
        int ans2 = arr2(nums);
        System.out.println(ans2);
        int ans3 = arr3(nums);
        System.out.println(ans3);
    }

}
