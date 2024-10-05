import java.util.Scanner;

public class shoestrore {
    public static void main(String[] args) {
        Scanner input08 = new Scanner(System.in);
        String brand;
        String category;
        int size ;
        double price = 0.0;
        

        System.out.print("input brand : ");
        brand = input08.nextLine();

        System.out.print("input category : ");
        category = input08.nextLine();

        System.out.print("input size : ");
        size = input08.nextInt();

        if (brand.equalsIgnoreCase("converse")) {
            if (category.equalsIgnoreCase("slip on")) {
                if (size == 36) {
                    price = 800000;
                } else if (size == 37) { 
                    price = 800000;
                } else if (size == 38) {
                    price = 800000;
                } else if (size == 39) {
                    price = 800000;
                } else if (size == 40) {
                    price = 800000;
                } else if (size == 41) {
                    price = 800000;
                } else if (size == 42) {
                    price = 800000;
                } else if (size == 43) {
                    price = 800000;
                } else if (size == 44) {
                    price = 800000;
                } else {
                    System.out.println("invalid size");
                }

            } else if (category.equalsIgnoreCase("high top")) {
                if (size == 40) {
                    price = 1200000;
                } else if (size == 41) {
                    price = 1200000;
                } else if (size == 42) {
                    price = 1200000;
                } else if (size == 43) {
                    price = 1200000;
                } else if (size == 44) {
                    price = 1200000;
                } else {
                    System.out.println("invalid size");
                }
            } else {
                System.out.println("invalid category");
            }
        } else if (brand.equalsIgnoreCase("sketcher")) {
            if (category.equalsIgnoreCase("woman")) {
                if (size == 36) {
                    price = 1000000;
                } else if (size == 37) {
                    price = 1000000;
                } else if (size == 38) {
                    price = 1000000;
                } else if (size == 39) {
                    price = 1000000;
                } else if (size == 40) {
                    price = 1000000;
                } else if (size == 41) {
                    price = 1000000;
                } else {
                    System.out.println("invalid size");
                }
            } else if (category.equalsIgnoreCase("man")) {
                if (size == 41) {
                    price = 1800000;
                } else if (size == 42) {
                    price = 1800000;
                } else if (size == 43) {
                    price = 1800000;
                } else if (size == 44) {
                    price = 1800000;
              
                } else {
                    System.out.println("invalid size");
                }
            } else {
                System.out.println("invalid category");
            }
        } else if (brand.equalsIgnoreCase("nike")) {
            if (category.equalsIgnoreCase("kids")) {
                if (size == 36) {
                    price = 750000;
                } else if (size == 37) {
                    price = 750000;
                } else if (size == 38) {
                    price = 750000;
                } else if (size == 39) {
                    price = 750000;
                } else if (size == 40) {
                    price = 750000;
                } else {
                    System.out.println("invalid size");
                }
            } else if (category.equalsIgnoreCase("adult")) {
                if (size == 40) {
                    price = 1500000;
                } else if (size == 41) {
                    price = 1500000;
                } else if (size == 42) {
                    price = 1500000;
                } else if (size == 43) {
                    price = 1500000;
                } else if (size == 44) {
                    price = 1500000;
                } else {
                    System.out.println("invalid size");
                }
            } else {
                System.out.println("invalid category");
        }

        } else {
            System.out.println("invalid brand");
        }
        System.out.println(" total price : " + price);
            
                
            
            
        }


    }

  
