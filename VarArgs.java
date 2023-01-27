import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        overLoading(5,6,3,3,3,3,3);
        overLoading(5,"Dhruvin",5,5,4,8,2,5,5,2,5);
    }
    static void overLoading(int...x){
        System.out.println(Arrays.toString(x));
    }
    static void overLoading(int a,String b,int ...v){
        System.out.println(Arrays.toString(v));
        System.out.println(a);
        System.out.println(b);
    }
}
