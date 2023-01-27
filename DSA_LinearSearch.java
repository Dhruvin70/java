public class DSA_LinearSearch {

    //Searching the target intex
    public static int arr1(int[] arry , int target ) {

        for (int i = 0; i <arry.length; i++) {
            int element = arry[i] ;
            if ( element== target) {
                // trturning the position of number
                return i+1;
            }
        }
        return -1;
    }

    //Searching the maximum value of array

    static int arr2(int[] arry ){
        int max = arry[0];
        for(int i = 0; i <arry.length; i++){
              if (max < arry[i]){
                max=arry[i];
            }

        }
        return max;
    }

    //Searching the minimum value of array

    static int arr3(int[] arry ){
        int min = arry[0];
        for(int i = 0; i <arry.length; i++){
            if (min > arry[i]){
                min =arry[i];
            }

        }
        return min;
    }

    public static void main(String[] args) {
        int[] nums={23,45,1,2,8,19,-3,1,-11,28};
        int target = 19;
        int ans1 = arr1(nums,target);
        System.out.println(ans1);
        int ans2 = arr2(nums) ;
        System.out.println("MAX VAL IS "+ans2);
        int ans3 = arr3(nums);
        System.out.println("MIN VAL IS "+ans3);
    }
}
