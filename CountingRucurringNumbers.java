import java.util.Scanner;

public class CountingRucurringNumbers {
    public static void main(String[] args) {
        Scanner sc1=new Scanner(System.in);
        System.out.println("Digit");
        int m = sc1.nextInt();
        System.out.println("Num");
        int x= sc1.nextInt();

        int count = 0;

        while (m != 0) {
/*
remainder by dividing 10 gives unit number of digit ex:-26542 ===2654+(2);where 2 is remainder;
 */
            int remainder = m%10;
            if(remainder==x){
                count++;
            }
            m=m/10;
        }
        System.out.println(count);
    }
}
