import java.util.Scanner;
class Practice
{   
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int storeNum = 1; //declares number of stores to start at 1
        int salesOne = 0; //initializes salesOne variable; holds number of sales from store 1
        int salesTwo = 0; //initializes salesTwo variable; holds number of sales from store 2
        int salesThree = 0; //initializes salesThree variable; holds number of sales from store 3
        
        while (storeNum <= 3) {
            System.out.printf("Enter today's sales for Store %d: ", storeNum);
            {
                if (storeNum == 1) {
                        if (!scan.hasNextInt()) {
                        System.out.print("Invalid input - enter a value of zero or greater: ");
                        salesOne = scan.nextInt();
                        }
                        salesOne = scan.nextInt();
                        if (salesOne < 0) {
                        System.out.print("Invalid input - enter a value of zero or greater: ");
                        salesOne = scan.nextInt();
                        }
                     storeNum++;
                } else if (storeNum == 2) {
                        if (!scan.hasNextInt()) {
                        System.out.print("Invalid input - enter a value of zero or greater: ");
                        salesTwo = scan.nextInt();
                        }
                        salesTwo = scan.nextInt();
                        if (salesTwo < 0) {
                        System.out.print("Invalid input - enter a value of zero or greater: ");
                        salesTwo = scan.nextInt();
                        }
                     storeNum++;
                } else if (storeNum == 3) {
                        if (!scan.hasNextInt()) {
                        System.out.print("Invalid input - enter a value of zero or greater: ");
                        salesThree = scan.nextInt();
                        }
                        salesThree = scan.nextInt();
                        if (salesThree < 0) {
                        System.out.print("Invalid input - enter a value of zero or greater: ");
                        salesThree = scan.nextInt();
                        }
                storeNum++;
                }
            }
        }
        
        System.out.print("\nSALES BAR CHART\n");
        
        System.out.print("\nStore 1: ");
        int asterisk = 1; 
                 
        while (asterisk <= salesOne) {
            if ((asterisk%10) != 0) {
            System.out.print("*");
            asterisk++;
            } else {
            System.out.print("x");
            asterisk++;  
            } 
        }
        
        System.out.print("\nStore 2: ");
        asterisk = 1;
        
        while (asterisk <= salesTwo) {
            if ((asterisk%10) != 0) {
            System.out.print("*");
            asterisk++;
            } else {
            System.out.print("x");
            asterisk++;  
            } 
        }
        
        System.out.print("\nStore 3: ");
        asterisk = 1;
        
        while (asterisk <= salesThree) {
            if ((asterisk%10) != 0) {
            System.out.print("*");
            asterisk++;
            } else {
            System.out.print("x");
            asterisk++;  
            } 
        } 
    }
}
