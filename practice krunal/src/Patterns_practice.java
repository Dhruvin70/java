public class Patterns_practice {
    public static void main(String[] args) {
        pascletringle(5);
//pattern7(4);
    }
//  static void pattern2(int n){
//        for (int i = 1; i <=n ; i++) {
//            for (int j = 0; j <i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }
//    static void pattern3(int n){
//        for (int i = 1; i <=n ; i++) {
//            for (int j = n; j >=i ; j--) {
//                System.out.print("*");
//
//            }
//            System.out.println();
//        }
//    }
//
//    static void pattern4(int n){
//        for (int i = 1; i <= 2*n; i++) {
//            int c = i >=n ? 2 * n - i : i;
//            for (int j = 0; j <c ; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }
//  //  static void pattern5(int n) {
//        for (int i = 1; i <=n ; i++) {
//            for (int j = 1; j <=n ; j++) {
//                if (j<= n-i ){
//                    System.out.print(" ");
//                }
//                else System.out.print("* ");
//            }
//            System.out.println();
//        }
//        int a = 1;
//        while (a<=n){
//        int b = 1;
//            while (b<=n){
//                if (b<= n-a ){
//                    System.out.print(" ");
//                }
//                else System.out.print("* ");
//                b++;
//            }
//            System.out.println();
//
//            a++;
//        }
//
//
//    }
//        static void pattern6 (int n){
//            for (int row = 1; row <= 2 * n; row++) {
//                int spaces = row <=n ?n- row : row -n;
//                for (int space = 0; space < spaces; space++) {
//                    System.out.print(" ");
//
//                }
//                for (int j = 1; j <=n-spaces ; j++) {
//                    System.out.print("* ");
//                }
//                System.out.println();
//            }
//        }
//    static void pattern7(int n) {
//        for (int row = 1; row < 2 * n; row++) {
//            for (int col = 1; col < 2 * n; col++) {
//                int minRow = Math.min(row - 1, 2 * n - row - 1);
//                int minCol = Math.min(col - 1, 2 * n - 1 - col);
//                int bothMax = Math.min(minCol, minRow);
//                System.out.print( n - bothMax+"  ");
//            }
//            System.out.println();
//        }
//    }
    static void pascletringle(int n){

        for (int i = 1; i <=n ; i++) {
            for (int j = n-i+1; j >0 ; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <=i ; j++) {
                int calculation = facteriol(i)/(facteriol(j)*facteriol(i-j));
                System.out.print(calculation+" ");
            }
            System.out.println();
        }
    }

    static int facteriol(int n){
        int multiplier = 1;
        for (int i = 1; i <=n ; i++) {
            multiplier = multiplier*i;
        }
        return multiplier;
    }

}







