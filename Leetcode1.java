public class Leetcode1 {
    // GIVEN AN ARRAY CONTAINS EVEN NUMBER OF DIGITS
    static int findNumbers(int[] nums){
        int count =0;
        for(int i=0 ; i<nums.length;i++){
        int gan = 0;
            int divide = nums[i];
            while (divide>0){
                gan++;
                divide=divide/10;
            }
         //   System.out.println(gan);
            if(gan%2==0){
                count++;
            }
            ;

            }
        return count;
    }

    // THROUGH STRING METHOD
    static int findNumbers2(int[] nums) {
        int count1 = 0;
        for (int i = 0; i < nums.length; i++){
            String convert = String.valueOf(nums[i]);
            if(convert.length()%2!=0){
                count1++;
            }
        }
        return count1;
    }

    // USING LOG with base 10 FUNCTION

    static int findNumbers3(int[] nums) {
        int count1 = 0;
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if(num<0){
                num = num * (-1);
            }
            int convert = (int)(Math.log10(num)+1);
            System.out.println(Math.log10(num));
            System.out.println(Math.log10(num)+1);
            if (convert % 2 == 0) {
                count1++;
            }

        }
        return count1;
    }
    public static void main(String[] args) {
        int[] nums = {-12,345,2,6,7896,91,52};
        int ans =findNumbers(nums);
        System.out.println(ans);
        int ans2 =findNumbers2(nums);
        System.out.println(ans2);
        int ans3 =findNumbers3(nums);
        System.out.println(ans3);
    }


}
