public class primeNumbers {
    public static void main(String[] args) {
//        Scanner sc1 = new Scanner(System.in);
//        int num = sc1.nextInt();
//        boolean sol = isPrime(num);
//        System.out.println(sol);
        int n = 40;
        boolean[] bool = new boolean[n+1];
        seive(n,bool);



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

        static void seive(int n , boolean[] prime){
            for (int i = 2; i*i <=n ; i++) {
                if(!prime[i]){
                    for (int j = i*2; j <=n ; j+=i) {
                        prime[j] = true;
                    }
                }
            }
            for (int i = 1; i <=n ; i++) {
                if (!prime[i]){
                    System.out.println(i+" ");
                }
            }

        }


    }