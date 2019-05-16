
      //a do-while loop ensures the input is correct. If not, an error message is given and the program is exited.
      
      System.out.print("What is the width of the room? ");
      if (!scan.hasNextDouble()) {
         System.out.print("\nError.");
         System.exit(0);
      else if (width < 1 || width > 100);
         System.out.print("Error.");
      else 
         System.out.print("Continue."); 
 ?8     
      do {
         System.out.print("What is the width of the room? ");
         while(!scan.hasNextDouble()) {
            System.out.print("\nError - the width and length must both be greater than zero, and less than 100.");
            System.exit(0);
         }
         width = scan.nextDouble();
      } while (width < 1 || width > 100);
 
      do {
         System.out.print("What is the length of the room? ");
         while(!scan.hasNextDouble()) {
            System.out.print("\nError - the width and length must both be greater than zero, and less than 100.");
            System.exit(0);
         }
         length = scan.nextDouble();
      } while (length < 1 || length > 100);
     
            
      //Checks for correct input. Gives an error message if input is incorrect. 
      do {
         System.out.print("The carpet quality levels are: \n\t1. Standard \n\t2. Premium \n\t3. Deluxe");
         System.out.print("\nEnter the quality level [1, 2, or 3]: ");
         while(!scan.hasNextInt()) {
            System.out.print("\nError - you must enter a level of 1, 2, or 3.");
            System.exit(0);
         }
         quality = scan.nextInt();
      } while (quality < 1 || quality > 3);
      
            
      //do-while loop to ensure correct input
      
     //if quality is less than 1 or greater than 3, prints an error.
      
      
      System.out.print("Are you a returning customer [y/n]: ");
      char yesNo = scan.nextChar().charAt(0);
      char returner = Character.toUpperCase(yesNo); //capitalizes the char in order to simplify later code
   
      double area = length * width; // declares area variable to be length x width
      double total = 0; //declares total variable, which holds the total price of the transactions
      double level = 0; //declares level variable, which holds the quality level chosen by the client
            
      if (quality == 1) //calculates the values for total price depending on the quality level chosen by the client
      {
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
    
      if (returner == 'Y') //applies a 15% discount if the client is a returning customer
      {
         total = total * RETURNER_DISCOUNT;
         System.out.printf("%n*** WITH RETURNING CUSTOMER DISCOUNT: $%,.2f", total);
      }
   }
}