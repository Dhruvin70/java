import java.util.Arrays;

public class Sorting_Methods {
    public static void main(String[] args) {
        int[] array = {5};
 //       System.out.println(Arrays.toString(sorting(array)));
        insertionSorting(array);
     //   selection(array);
        System.out.println(Arrays.toString(array));
    }
    // increases the space complexity

//    public static int[] sorting (int[] arry) {
//
//        int index = 0;
//        int[] count = new int[arry.length];
//        for (int i = 0; i < arry.length; i++) {
//
//        int min = Integer.MAX_VALUE;
//            for (int j = 0 ; j < arry.length; j++) {
//                if (arry[j] <= min) {
//                    min = arry[j];
//                    index=j;
//                    }
//            }
//            arry[index] = Integer.MAX_VALUE;
//                count[i] = min;
//        }
//        return count;
//    }





    //                                                       Bubble sorting


    // space complexity = 0
    // time complexity in best O(n) and in worst case O(n^2)


//    public static void bubble(int[] arr) {
//        boolean swapped;
//        //running the steps for n-1 times
//        for (int i = 0; i < arr.length; i++) {
//            swapped = true;
//            // for each step, max item will come at the last respective index
//            for (int j = 1; j < arr.length - 1; j++) {
//                // swap if the item is smaller than the previous item
//                if (arr[j] < arr[j - 1]) {
//                    int temp = arr[j];
//                    arr[j] = arr[j - 1];
//                    arr[j - 1] = temp;
//                    swapped = false;
//                }
//            }
//            if (swapped) {
//                break;
//            }
//
//        }
//
//    }
//
//    //                                                              Selection Sorting
//
//    // time complexity  is O(N^2)
//    // space complexity is not changed because no new thing created
//
//     public static void selection(int[] arr){
//         for(int i = 0; i< arr.length-1;i++) {
//             int end = arr.length-i-1;
//             int maxIndex = getMaximumNumber(arr, end);
//             int temp = arr[end];
//             arr[end] = arr[maxIndex];
//             arr[maxIndex] = temp;
//         }
//     }
//        static int getMaximumNumber(int[] arr, int last){
//        int max = 0;
//        for(int j = 0; j <=last; j++){
//            if(arr[max]<arr[j]){
//               max = j;
//            }
//        }
//        return max;
//    }

    //                                     Insertion Sorting

        static void insertionSorting(int[] arr){
            for (int i = 0; i < arr.length-1; i++) {
                for (int j = i+1; j >0 ; j--) {
                    int max = arr[j];
                    if(arr[j]<arr[j-1]){
                        arr[j]=arr[j-1];
                        arr[j-1]=max;
                    }
                    else {
                        break;
                    }
                }
            }
}



}

