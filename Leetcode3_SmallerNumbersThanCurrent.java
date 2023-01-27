import java.util.Arrays;

public class Leetcode3_SmallerNumbersThanCurrent {
    public static void main(String[] args) {
        int[] num = {8, 1, 2, 2, 3};
        int[] a = smallerNumbersThanCurrent(num);
        System.out.println(Arrays.toString(a));
    }

    public static int[] smallerNumbersThanCurrent(int[] numbers) {
        int[] tot = new int[numbers.length];
        for (int k = 0; k < tot.length; k++) {
            for (int num : numbers) {
                int sum = 0;
                for (int i : numbers) {
                    if (num > i) {
                        sum++;
                    }
                }
                tot[k] = sum;
                k++;
            }
        }
        return tot;
    }

}