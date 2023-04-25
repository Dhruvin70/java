public class Recursion_concepts {

    public static void main(String[] args) {
        top_to_bottom(5);
        System.out.println();
        bottom_to_top(5);
        System.out.println();
        both(5);
        System.out.println();
        System.out.println(factorial(5));
        System.out.println();
        System.out.println(sum_of_digits_of_number(8154));
        System.out.println();
        System.out.println(prod_of_digits_of_number(12345));
        reverse_number(12345);
        System.out.print(sum);
    }

    static void top_to_bottom(int n){
        if (n==0){
            return;
        }
            System.out.print(n+" ");
            top_to_bottom(n-1);
        }



    static void bottom_to_top(int n){
        if(n==0){
            return;
        }
            bottom_to_top(n-1);
            System.out.print(n+" ");
    }

    static void both(int n){
        if(n==0){
            return;
        }
        System.out.print(n+" ");
        both(n-1);
        System.out.print(n+" ");
    }

    static int factorial(int n){
        if(n<=1){
           return 1 ;
        }
        return n * factorial(n-1);
    }

    static int sum_of_digits_of_number(int n){
        if(n == 0) {
            return 0;
        }
return sum_of_digits_of_number(n/10) + n%10;

    }

    static int prod_of_digits_of_number(int n){
        if(n%10 == n) {
            return n;
        }
        return prod_of_digits_of_number(n/10) * (n%10) ;

    }



    static int sum = 0;
    static void reverse_number(int n){
        if(n == 0){
            return ;
        }
        sum = sum*10 + n%10;
        reverse_number(n/10);
    }

}

