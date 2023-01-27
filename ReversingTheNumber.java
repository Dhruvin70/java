public class ReversingTheNumber {
    public static void main(String[] args) {
        int num=415402;
        int a=0;
        while (num>0){
            int r= num%10;
            num=num/10;
/*
    a=a*10=r  ==== is something (0*10+2)+(2*10+1)+(21*10+4)......
*/
            a=a*10+r;

        }
        System.out.println(a);
    }
}
