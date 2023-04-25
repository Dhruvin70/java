public class Factors_of_number {
    public static void main(String[] args) {
        factors(20);
    }
    static void factors(int n){
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if(n%i==0){
                if(n/i == i){
                    System.out.println(i+" ");
                }
                else {
                    System.out.println(i+" "+n/i+" ");
                }
            }
        }
    }
}

