import java.util.Scanner;
public class Maxnumber {
    
    public static  void main(String[] args) {
        Scanner input08 = new Scanner(System.in);
        int num1 = 28, num2 = 54, num3 = 15;
        int Maxnumber = 0;

        if (num1>num2) {
            if (num1>num3) {
                Maxnumber = num1;
            } else {
                Maxnumber = num3;
            }

        } else if (num2>num1) {
            if (num2>num3){
                Maxnumber = num2;
            } else {
                Maxnumber = num3;
            }
                
        }
    
        System.out.println("Max number is " + Maxnumber);
    }

}