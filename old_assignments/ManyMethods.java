public class ManyMethods {

    /**
     * Students should write method definitions for the all of the
     * methods called in this main method.  The code in the main method
     * should be left EXACTLY as it is.
     * 
     * @param args the command line arguments (not used in this program)
     */
    
   public static void main(String[] args) {
        // The add method takes in two integers and returns their sum.
      int x = add(3, 15);
      System.out.printf("x is: %d\n", x);
        
        // Print two digits after the decimal point for monetary values and
        // one digit after the decimal point for the tax rate.
      totalCost(150.00, 0.06);
      totalCost(3099.95, 0.03);
             
        // Takes in a integer that represents a month of the year, where
        // 1 is January, 2 is February, etc., and returns a string representing
        // the SEASON that that month appears in.  Use this mapping of 
        // months to seasons:  
        //    11, 12, 1, and 2 are "Winter" (all lower case except upper case 'W')
        //    3, 4, and 5 are "Spring"
        //    6, 7, and 8 are "Summer"
        //    9 and 10 are "Fall"
        //    Return "Invalid month" for any other integer values
        //
      String season1 = getSeason(5);
      String season2 = getSeason(20);
      System.out.println(season1 + " and " + season2);
      System.out.println(getSeason(12));
        
        // This method is similar to the getSeason method, except that 
        // instead of returning a value (this method returns nothing) this 
        // method prints one line to the console of the format:
        //   "3 is Spring"
        // For invalid values print a message to the console of the
        // format:
        //   "15 is Invalid month"
      reportSeasonForMonth(3);
      reportSeasonForMonth(12);
      reportSeasonForMonth(15);
           
        // This method takes in an integer parameter that represents
        // the width of a screen in pixels.  It prints a message to the 
        // console of the format:
        //    333 pixels is a phone
        //    2300 pixels is a computer
        //    7 pixels is too small to be a phone
        //    9000 pixels is bigger than a computer
        // The ranges are:
        //    Less than 100 pixels is "too small to be a phone"
        //    100 to 500 pixels, inclusive, is "a phone"
        //    500 to 899 pixels is "a tablet"
        //    900 to 3999 pixels is "a computer"
        //    4000 pixels and above is "bigger than a computer"
        //
      screenType(333);
      screenType(2300);
      screenType(7);
      screenType(9000);
        
        // The isAdult method takes in an age and returns true if they 
        // are 18 years old or older, and returns false otherwise.
      if (isAdult(7) == true)
         System.out.println("Yes, is an adult!");
      else
         System.out.println("No, is NOT an adult!");
        
      if (isAdult(35))
         System.out.println("Yes, is an adult!");
      else
         System.out.println("No, is NOT an adult!");
        
        // The multiply method takes in two integers and returns the 
        // product of those two numbers.
      int result = multiply(3, 5);
      System.out.printf("d is: %d\n", result);
        
      System.out.println(multiply(10, 37));    
      System.out.println(multiply(2, multiply(3, 4)) );  
      System.out.println(add( multiply(10, 10), add(2, 2)));
        
        // The getAverage method takes in three doubles and returns their
        // average.
      double ave1 = getAverage(14.0, 16.0, 15.0);
      double ave2 = getAverage(99.9, 75.5, 84.0);
      System.out.printf("Averages: %.1f and %.1f\n", ave1, ave2);
        
        // The passed method takes in three test scores as double values,
        // and returns the boolean true value if they passed the tests with 
        // and average test score of 70.0 or greater, otherwise it returns
        // the boolean false value.
      boolean status = passed(100.0, 88.0, 90.0);
      System.out.println("passed: " + status);
        
      System.out.println("passed: " + passed(73.0, 70.0, 61.0));
   }
    
    // *** Add your code BELOW this line (do not change ANYTHING above this line 
    
    // This first method is done for you:
    
    /**
     * Adds two integers and returns their sum.
     * 
     * @param num1 The first of two integers to add.
     * @param num2 The second integer to add.
     * @return The sum of the two integers.
     */
    
   public static int add(int num1, int num2) {
      return num1 + num2;
   }
   
   /**
    * Calculates the final cost of an item.
    *
    * @param cost Cost of the item
    * @param tax Tax on the item
    */
   static void totalCost(double cost, double percent)
   {
      double taxConverted = percent * 100;
      double taxTotal = percent * cost;
      double totalCost = cost + taxTotal;
      System.out.printf("Price: $%.2f, %.1f%% tax: $%.2f, total: $%.2f%n", cost, taxConverted, taxTotal, totalCost);
   }
   
   /**
    * Returns the season for a specific month.
    *
    * @param Month as an integer value
    * @return Season as a String
    */
   public static String getSeason(int month)
   {
      if (month == 11 || month == 12 || month == 1 || month == 2)
         return "Winter";
      else if (month == 3 || month == 4 || month == 5)
         return "Spring";
      else if (month == 6 || month == 7 || month == 8)
         return "Summer";
      else if (month == 9 || month == 10)
         return "Fall";
      else 
         return "Invalid month";
   }
   
   /**
    * Tells which season a month is in.
    *
    * @param Month as integer representation for a month.
    */
   public static void reportSeasonForMonth(int month)
   {
      if (month == 11 || month == 12 || month == 1 || month == 2)
         System.out.printf("%d is Winter%n", month);
      else if (month == 3 || month == 4 || month == 5)
         System.out.printf("%d is Spring%n", month);
      else if (month == 6 || month == 7 || month == 8)
         System.out.printf("%d is Summer%n", month);
      else if (month == 9 || month == 10)
         System.out.printf("%d is Fall%n", month);
      else
         System.out.printf("%d is Invalid month%n", month);
   }
   
   /**
    * Determines the type of device based on numbers of pixels.
    *
    * @param pixels Number of pixels in the screen
    *
    */ 
   public static void screenType(int pixels)
   {
      if (pixels < 100)
         System.out.printf("%d is too small to be a phone%n", pixels);
      else if (pixels >= 100 && pixels <= 500)
         System.out.printf("%d pixels is a phone%n", pixels);
      else if (pixels > 500 && pixels < 899)
         System.out.printf("%d pixels is a tablet%n", pixels);
      else if (pixels > 900 && pixels < 3999)
         System.out.printf("%d pixels is a computer%n", pixels);
      else if (pixels > 4000)
         System.out.printf("%d pixels is bigger than a computer%n", pixels);
   }
   
   /**
    * Determines whether a person is an adult.
    *
    * @param age Age in question
    * @return True, if the age is 18 or older
    * @return False, if the age is younger than 18
    */
   public static boolean isAdult(int age)
   {
      if (age >= 18)
         return true;
      else 
         return false;
   }

   /**
    * Multiplies two numbers together.
    *
    * @param val1 The first of two integers to multiply
    * @param val2 The second of two integers to multiply
    * @return Returns the product
    */
   public static int multiply(int val1, int val2)
   {
      return val1 * val2;
   }
   
   /**
    * Takes in three grade values and returns the average.
    *
    * @param num The first of three grades
    * @param val The second of three grades
    * @param dub The third of three grades
    */
   public static double getAverage(double num, double val, double dub)
   {
      double average = (num + val + dub) / 3;
      return average;
   }

   /**
    * Determines whether or not a student has passed the class.
    *
    * @param num The first of three grades
    * @param val The second of three grades
    * @param dub The third of three grades
    * @return Returns true if a student has an average grade equal
    *         to or above 70
    */
   public static boolean passed(double num, double val, double dub)
   {
      double average = getAverage(num, val, dub);
      if (average >= 70)
         return true;
      else
         return false;
   }


}