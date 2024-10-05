import java.util.Scanner;

public class Selectiion2exo2244107060008 {
    public static void main(String[] args) {

        Scanner input08 = new Scanner(System.in);
        int angle1, angle2, angle3;
        int totalAngle = 180;

        System.out.print("input angle 1 : ");
        angle1 = input08.nextInt();
        System.out.print("input angle 2 : ");   
        angle2 = input08.nextInt();
        System.out.print("input angle 3 : ");
        angle3 = input08.nextInt();

        if (totalAngle == 180) 
           if (angle1 == 90 || angle2 == 90 || angle3 == 90)
               System.out.println("right  triangle");
           else
               System.out.println("not a right  triangle");

        else
            System.out.println("not a triangle");

            

    }
}
            
        
