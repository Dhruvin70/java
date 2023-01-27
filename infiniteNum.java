import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

import static com.sun.tools.javac.main.Option.X;

public class infiniteNum {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        int sum = 0;
        String x;
        while (!(x = sc1.nextLine().toLowerCase()).equals("x")) {
            sum += Integer.parseInt(x);

        }
        System.out.println(sum);
    }

}

