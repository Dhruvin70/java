import java.util.Scanner;

public class Fibo {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0;
        int b =1;
        int constantStart=2;
        while(constantStart<=n){
          int temparory = b;
            b+=a;
            constantStart++;
            a=temparory;
        }
        System.out.println(b);
    }
}
