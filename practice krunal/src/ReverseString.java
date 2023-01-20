import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        String a = sc1.next();
        System.out.println(a);
        String y="";
        for(int r = a.length()-1; r>=0 ;r--){
            y+=a.charAt(r);
        }
        System.out.println(y);
    }

}
