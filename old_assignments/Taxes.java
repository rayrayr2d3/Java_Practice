import java.util.Scanner;

class Taxes
{
   public static void main(String [] args)
   {
      System.out.print("GPA Calc \n \n");
      System.out.print("What is your current GPA? ");
      Scanner scan = new Scanner(System.in);
      double currentGPA = scan.nextDouble();
      
      System.out.print("\nWhat was your GPA last semester? ");
      double lastGPA = scan.nextDouble();
      
      System.out.print("What will your GPA be next semester? ");
      double nextGPA = scan.nextDouble();
      
      double yearGPA = (currentGPA + lastGPA + nextGPA) / 3;
      System.out.println("\nYour GPA at the end of the year will be " + yearGPA);
      
   }
}