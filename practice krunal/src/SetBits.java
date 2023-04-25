public class SetBits {
    public static void main(String[] args) {
        int n = 45;
        System.out.println(Integer.toBinaryString(n));
        System.out.println(setBits(n));
    }
    private static int setBits(int n){
        int count = 0;
        while (n>0){
            count++;

            // -n = ((complement(n) + 1) & n)

            n = n - (n & -n);
        }
        return count;
    }
}
