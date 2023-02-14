public class PowerOfAnyNumber {
    public static void main(String[] args) {
        method(3,6);
      }
    static void method(int base , int power){
        int ans = 1;
        while (power>0){
            if((power & 1)==1 ){
                ans = ans *base;
            }
            power = power>>1;
            base = base *base;
        }
        System.out.println(ans);
    }

}
