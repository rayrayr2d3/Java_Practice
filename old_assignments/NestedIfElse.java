import java.util.Scanner;
class NestedIfElse
{ 
  public static void main(String [] args)
   {
      
      Scanner scan = new Scanner(System.in);
   
     int length;
           System.out.println("Please enter a length");
           while (!scan.hasNextInt()) {
               System.out.println("Error");
               System.exit(2);
           }
           length = scan.nextInt();
         if (length < 1 || length > 100)
          {
            System.out.print("Error.");
            System.exit(4);
          }
         System.out.println("Thank you!");
     
   }
}

      
       