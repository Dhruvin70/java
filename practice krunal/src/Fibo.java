public class Fibo {
    public static void main(String[] args) {
//        Scanner sc= new Scanner(System.in);
//        int n = sc.nextInt();
//        int a = 0;
//        int b =1;
//        int constantStart=2;
//        while(constantStart<=n){
//          int temparory = b;
//            b+=a;
//            constantStart++;
//            a=temparory;
//        }
//        System.out.println(b);
//    }

        // with decreased time complexity

        //  f(n) = f(n-1) + f(n-2)
        //  @^n = @^(n-1) + @^(n-2)

        int n = 50;
        int fibo = (int) (Math.pow((1 + Math.sqrt(5)) / 2,n) / Math.sqrt(5));
        System.out.println(fibo);
    }
}