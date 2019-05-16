/** 
   
   This program is used to determine the price of carpet for a client using the area of the floor and a 
   price structure based on quality of carpet. It was written for Oakland Community College's CIS 1500 course, 
   Introduction to Programming with Java, taken in Winter of 2018 with Professor Alan Jackson.
   
   @author Rachel Inderhees
   @professor Alan Jackson
   @semester Winter 2018
   @version 2.0

*/


import java.util.Scanner;
class InstallCarpet
{
   public static final double LEVEL_ONE = 4.99;
   public static final double LEVEL_TWO = 7.25;
   public static final double LEVEL_THREE = 11.50;
   public static final double RETURNER_DISCOUNT = .85;
  
   public static void main(String [] args)
   {
      double width; //declares variable width
      double length; //declares variable length
      int quality; //declares variable quality
   
      Scanner scan = new Scanner(System.in);
      System.out.println("Welcome to OCC Carpet Installation! \n");
      
      //Intakes width variables and checks that it's a double.
      System.out.print("\nWhat is the width of the room? ");
      if (!scan.hasNextDouble()) {
         System.out.print("\nError - the width and length must both be greater than zero, and less than 100.");
         System.exit(0);
      }
      length = scan.nextDouble();
      if (length < 1 || length > 100) {
         System.out.print("\nError - the width and length must both be greater than zero, and less than 100.");
         System.exit(1);
      }
      
      //Intakes length variable and checks that it's a double.
      System.out.print("\nWhat is the length of the room? ");
      if (!scan.hasNextDouble()) {
         System.out.print("\nError - the width and length must both be greater than zero, and less than 100.");
         System.exit(2);
      }
      width = scan.nextDouble();
      if (width < 1 || width > 100) {
         System.out.print("\nError - the width and length must both be greater than zero, and less than 100.");
         System.exit(3);
      }
      
      //Intakes carpet quality level and checks that it's an integer.
      System.out.print("The carpet quality levels are: \n\t1. Standard \n\t2. Premium \n\t3. Deluxe");
      System.out.print("\nEnter the quality level [1, 2, or 3]: ");
      if (!scan.hasNextInt()) {
         System.out.print("\nError - the width and length must both be greater than zero, and less than 100.");
         System.exit(4);
      }
      quality = scan.nextInt();
      if (quality < 1 || quality > 3) {
         System.out.print("\nError - you must enter a level of 1, 2, or 3.");
         System.exit(5);
      }
     
      System.out.print("Are you a returning customer [y/n]: ");
      String returner = scan.next();
         
      double area = length * width; // declares area variable to be length x width
      double total = 0; //declares variable total, which holds the total price of the transactions
      double level = 0; //declares variable level, which holds the quality level chosen by the client
      
      //calculates the values for total price depending on the quality level chosen by the client
      if (quality == 1) {
         total = area * LEVEL_ONE;
         level = LEVEL_ONE;
      } else if (quality == 2) {
         total = area * LEVEL_TWO;
         level = LEVEL_TWO;
      } else if (quality == 3) {
         total = area * LEVEL_THREE;
         level = LEVEL_THREE;
      }
      
      System.out.printf("%nSummary: %nWidth: %.0f feet%nLength: %.0f feet%nArea: %.0f square feet, at $%.2f per square foot.", width, length, area, level);
      System.out.printf("%nTotal: $%,.2f", total);
    
      //applies a 15% discount if the client is a returning customer
      if ((returner.equals("Y")) || (returner.equals("y"))) {
         total = total * RETURNER_DISCOUNT;
         System.out.printf("%n*** WITH RETURNING CUSTOMER DISCOUNT: $%,.2f", total);
      }
   }
}
