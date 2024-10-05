import java.util.Scanner;

public class bookshop {

    public static void main(String[] args) {
        Scanner input08 = new Scanner(System.in);
        String bookcategory ;
        int numberbooks;
        double discount = 0.0; 

       

        System.out.print("input book category : ");
        bookcategory = input08.nextLine();
        System.out.print("input number of books : ");
        numberbooks = input08.nextInt();

       if ((bookcategory.equalsIgnoreCase("dictionary") && numberbooks >= 2) )
            if (numberbooks >=2)
            discount = 0.12;
            else 
            discount = 0.10;
         else if ((bookcategory.equalsIgnoreCase("novel") && numberbooks >= 3) )
            if (numberbooks >= 3)
            discount = 0.8;
            else 
            discount = 0.7;
         else if ((!bookcategory.equalsIgnoreCase("dictionary") && !bookcategory.equalsIgnoreCase("novel")) )
            if (numberbooks >= 5)
            discount = 0.5;
             else
            discount = 0.0;

        else

            
         System.out.println("invalid input");
         System.out.println("total discount obtained : " + discount + "%");
                          

    }
}
