import java.util.Arrays;
import java.util.Random;

public class Arraysinarry {
    public static void main(String[] args) {
        String[] arry = new String[5];
        Random rand = new Random();
        String y = " ";
        for (int x=1 ; x<30;x++){
            arry= new String[x] ;
            System.out.println(Arrays.toString(arry));
        }
    }
}
