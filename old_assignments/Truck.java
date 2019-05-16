public class Truck {
   /**
   * The Truck class contains methods that allow a user to
   * set the initial total capacity of the truck, 
   * change the amount of weight in the truck, to query
   * whether the truck is full or empty, to determine how 
   * much space is taken up and how much space is left,
   * and to print a string containing how much weight is
   * loaded and how much total capacity the truck has.
   *
   * @author Rachel Inderhees
   * @class CIS 1500
   * @version 1.5
   */

   private int capacity; //Holds the total capacity of the truck
   private int weight; //Holds the current weight of the truck
   private static final int MAX_CAPACITY = 10000; //Defines the maximum capacity of the truck as 10,000 pounds
   private static final int MIN_CAPACITY = 50; //Defines the minimum capacity of the truck as 50 pounds.
   
   /**
   * Constructs a truck with a capacity of at least 50 pounds,
   * and at most 10,000 pounds. 
   *
   * @param pounds The capacity of the truck.
   */
   public Truck(int pounds) {
      if (pounds >= MAX_CAPACITY)
         capacity = MAX_CAPACITY;
      else if (pounds >= MIN_CAPACITY)
         capacity = pounds;
      else
         capacity = MIN_CAPACITY;
   }
   
   /**
   * Adds weight to the truck.
   *
   * @param pounds The number of pounds added to the truck.
   */
   public void load(int pounds) {
      if ((weight + pounds) > capacity)
         System.out.printf("Addition of %d pounds exceeds the %d pound capacity of the truck.%n", pounds, capacity);
      else if (pounds < 0)
         System.out.println("Cannot add a negative weight.");
      else
         weight += pounds;
   }
   
   /**
   * Subtracts weight from the truck.
   *
   * @param pounds The number of pounds subtracted from the truck.
   */
   public void unload(int pounds) {
      if (weight < pounds)
         System.out.printf("Cannot subtract %d pounds from the current weight of %d pounds.%n", pounds, weight);
      else if (pounds < 0)
         System.out.println("Cannot subtract a negative weight.");
      else 
         weight -= pounds;
   }
   
   /**
   * Checks if the truck is empty.
   * 
   * @return True if there is no weight in the truck.
   * @return False if the weight in the truck is greater than 0.
   */
   public boolean isEmpty() {
      if (weight == 0)
         return true;
      else
         return false;
   }
   
   /**
   * Checks if the truck is full.
   *
   * @return True if the truck is full.
   * @return False if the truck's weight is less than its capacity.
   */
   public boolean isFull() {
      if (weight == capacity)
         return true;
      else
         return false;
   }
   
   /**
   * Checks how much room is left in the truck.
   *
   * @return The total capacity of the truck minus its current weight.
   */
   public int capacityLeft() {
      return capacity - weight;
   }
   
   /**
   * Checks how much weight is currently in the truck.
   *
   * @return The current weight of the truck.
   */
   public int getAmountLoaded() {
      return weight;
   }
   
   /**
   * Tells the user the capacity of the truck, and its current load.
   * 
   * @return String stating the capacity and current weight of the truck.
   */
   public String toString() {
      return String.format("Truck with a capacity of %d pounds, currently loaded with %d pounds.", capacity, weight);
   }
}