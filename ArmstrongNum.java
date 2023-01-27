import java.util.Scanner;

public class ArmstrongNum {
    public static void main(String[] args) {
        Scanner sc1= new Scanner(System.in);
        int num = sc1.nextInt();
        System.out.println(arm(num));

    }
    public static boolean arm(int x){
       int sum= 0;
       int org = x;

        while (x>0){
            int rem;
            rem=x%10;
            x=x/10;
            sum=sum+rem*rem*rem;
        }if (sum==org){
            return true;
        }
        return false;

        }
    }
