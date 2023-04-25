public class Newtonsqrt {

    //root = x = (x + n/x)/2

    public static void main(String[] args) {
        System.out.println(sqrt(40));
    }
    static double sqrt(double n){
        double persicion = 0.5;
        double x = n;
        double root;
        while(true){
            root = (x + (n/x)) * 0.5;
            if(Math.abs(root - x) < persicion){
            break;
            }
            x = root;
        }
        return root;
    }

}
