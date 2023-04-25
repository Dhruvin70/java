public class  AssignmentKrunalHCFandLCM {

    public static void main(String args[]){
        int temp1, temp2, num1, num2, temp, hcf, lcm;
  //      Scanner scanner = new Scanner(System.in);

        System.out.print("Enter First Number: ");
        num1 =4;
        System.out.print("Enter Second Number: ");
        num2 =12;
        System.out.println(Euclids_HCF_LCM(num2,num1));



        temp1 = num1;
        temp2 = num2;

        while(temp2 != 0){
            temp = temp2;
            temp2 = temp1%temp2;
            temp1 = temp;
        }

        hcf = temp1;
        lcm = (num1*num2)/hcf;

        System.out.println("HCF of input numbers: "+hcf);
        System.out.println("LCM of input numbers: "+lcm);
    }
    static int Euclids_HCF_LCM(int a,int b){
        if(a==0){
            return b;
        }
        return Euclids_HCF_LCM(b%a,a);
    }
}

/*properties of modulus */

