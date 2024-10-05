import java.util.Scanner;
public class Selection2exp108 {
    public static void main(String[] args) {
        Scanner input244107060008 = new Scanner(System.in);
        int year;

        System.out.print("input year : ");
        year = input244107060008.nextInt();

        if (year%4 == 0) 
            if (year%100 == 0)
                if (year%400 == 0)
                    System.out.println("leap year");
                else
                    System.out.println("not leap year");

            else
                System.out.println("leap year");

            else
            System.out.println("not leap year");

        
        
        
    }

}
