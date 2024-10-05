import java.util.Scanner;

public class Selection2Exp3244107060008 {

    public static void main(String[] args) {
        Scanner input244107060008 = new Scanner(System.in);
        String category;
        int income, netSalary;
        double tax = 0;

        System.out.print("input category = ");
        category = input244107060008.nextLine();

        System.out.print("input income = ");
        income = input244107060008.nextInt();

        if(category.equals("worker")){
            if(income <= 2000000)
                tax = 0.1;
            else if(income <= 3000000)
                tax = 0.15;
            else
                tax = 0.2;
            netSalary = (int) (income - (tax*income));
            System.out.println("net salary = " + netSalary);
        }else if(category.equals("businessman")){
            if(income <= 2500000)
                tax = 0.15;
            else if(income <= 3500000)
                tax = 0.25;
            netSalary = (int) (income - (tax*income));
            System.out.println("net salary = " + netSalary);
        }else
            System.out.println("Invalid category!");
        
   }

}