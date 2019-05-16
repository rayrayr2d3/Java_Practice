/**

   This program was created for Professor Alan Jackson of Oakland Community College, for CIS 1500: An Intro
   to Programming with Java, during the Winter semester of 2018.
   
   The program is meant to provide a visual way to measure sales at three stores by using a barchart.

   author: Rachel Inderhees
   version: 2.0.1
   professor: Alan Jackson
   semester: Winter 2018
   
*/
import java.util.Scanner;

class BarChart
{
   /*
      A method that asks the user for input, checks the input for value and type, and then prints out the input as a
      chart of x's and *'s.
   */
   public static void main(String [] args)
   {
      Scanner scan = new Scanner(System.in);
      
      System.out.print("Enter today's sales for Store 1: ");
      int storeOne = 0;
      storeOne = typeCheck(storeOne);
      
      System.out.print("Enter today's sales for Store 2: ");
      int storeTwo = 0;
      storeTwo = typeCheck(storeTwo);
    
      System.out.print("Enter today's sales for Store 3: ");
      int storeThree = 0;
      storeThree = typeCheck(storeThree);
     
      System.out.print("\nSALES BAR CHART\n");
      
      System.out.print("\nStore 1: ");
      chart(storeOne);
      System.out.print("\nStore 2: ");
      chart(storeTwo);
      System.out.print("\nStore 3: ");
      chart(storeThree);  
   }
   /*
      A method that checks that the user has input a valid type of variable. If the user inputs a variable that is not
      an integer, the user will be prompted until he or she inputs an integer. Once the user has input an integer, the
      method will check that the integer is greater than or equal to zero. If the user inputs a number less than 0, the 
      user is prompted to enter an integer with a value of zero or greater. The loop will run until the user inputs a 
      valid integer, at which point it will return the value to the main method.
   */
   static int typeCheck(int input) 
   {
      Scanner scan = new Scanner(System.in);
      
      while (true) {
         if (scan.hasNextInt()) {
            input = scan.nextInt();
            if (input >= 0) {
               break;
            }
         } else {
            scan.next();
         }
         System.out.print("Invalid input = enter a value of zero or greater: ");
      }
      
      return input;
   }
   /*
      A method that prints a bar chart to aid in visualization of the sales for each store. Each sale is signified with 
      an 'x'. Every ten x's is replaced with an asterisk (*) to aid in readability.
   */
   static void chart(int sales) 
   {
      int asterisk = 1;
      while (asterisk <= sales) {
         if (asterisk % 10 != 0) {
            System.out.print("*");
            asterisk++;
         } else {
            System.out.print("x");
            asterisk++;  
         } 
      }
   }
}