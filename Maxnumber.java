import java.util.Scanner;
public class Maxnumber {
    
    public static  void main(String[] args) {
        Scanner input08 = new Scanner(System.in);
        int num1 = 28, num2 = 54, num3 = 15;
        int Maxnumber = 0;

        System.out.println("input number 1 : ");
        num1 = input08.nextInt();

        System.out.println("input number 2 : ");
        num2 = input08.nextInt();
        
        System.out.println("input number 3 : ");
        num3 = input08.nextInt();

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
