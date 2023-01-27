import java.util.Scanner;

public class primeNumbers {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        int num = sc1.nextInt();
        boolean sol = isPrime(num);
        System.out.println(sol);
    }

    static boolean isPrime(int num) {
        if (num == 1) {
            return false;
        }

            int start = 2;
            while (start*start <= num) {

                if (num % start == 0) {
                    return false;
                }
                start++;
            }
return true;

        }
    }