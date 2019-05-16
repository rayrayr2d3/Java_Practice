/**   
      This program was created to calculate the difference in cost incurred
      by a resident of Michigan should the sales tax increase by 1%.
      
      This program was created for Professor Alan Jackson of Oakland Community
      College, for the course CIS 1500: Introduction to Programming in Java.
      
      Creator: Rachel Inderhees
      Course: CIS 1500
      Professor Alan Jackson
      Winter Semester 2018
*/

import java.util.Scanner;

class SalesTax

{
   public static void main(String [] args)
   {
      System.out.println("Proposed Sales Tax Increase Program \n");
      
      System.out.print("What is your current income: $");
      Scanner scan = new Scanner(System.in);
      double income = scan.nextDouble();
      
      System.out.print("What percent of your income is taxable (0 to 100): ");
      double percentIncome = scan.nextDouble();
      
      double taxableIncome = income * percentIncome * .01;
      // The $%.2f limits the double to two places after the decimal point.
      // It also formats the variable to be in USD.
      System.out.printf("\nTaxable Income: $%.2f \n", taxableIncome);
      
      double taxPercent6 = taxableIncome * .06;
      System.out.printf("At current 6%% tax: $%.2f \n", taxPercent6);
      
      double taxPercent7 = taxableIncome * .07;
      System.out.printf("At proposed 7%% tax: $%.2f \n", taxPercent7);
      
      double difference = taxPercent7 - taxPercent6;
      System.out.printf("Difference: $%.2f \n", difference);
   }

}

