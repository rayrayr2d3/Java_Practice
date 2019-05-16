package capstone;

/**
 * Holds the methods used to manipulate the lists.
 * 
 * @author Rachel Inderhees
 * @course CIS 2353
 * @prof John Baugh
 */
public class TriageSimulator {
    public Node headOne;
    public Node headTwo;
    public Node headThree;
    
    /*
    * Creates the linked lists and initializes the first node of each of them.
    */
    public TriageSimulator() {
        this.headOne = null;
        this.headTwo = null;
        this.headThree = null;
    }//end cstr
    
    /*
    * This method reads in a line from the file stored in the array in main and 
    * splits it into its component parts and stores it in the relevant linked list.
    * @param fromFile The string read from the file in main.
    */
    public void add(String fromFile) {
        Node one = new Node();
        Node two = new Node();
        Node three = new Node();
        Node current = new Node();
        
        String newString = fromFile;
        String[] list = newString.split(" ");
        for (int i = 0; i < list.length; i++) {
            String temp = list[i]; //list[0] = firstname; list[1] = lastname; list[2] = code;
        }
    
        switch (list[2]) {
            case "AL":
            case "HA":
            case "ST":
                if (headOne == null) {
                    this.headOne = new Node();
                    this.headOne.firstName = list[0];
                    this.headOne.lastName = list[1];
                    this.headOne.nextNode = null;
                } else {
                    one.firstName = list[0];
                    one.lastName = list[1];
                    one.nextNode = null;
                    current = headOne;
                    while (current.nextNode != null) {
                        current = current.nextNode;
                    }   
                    current.nextNode = one; 
                }
                break;
                
            case "BL":
            case "IW":
            case "KS":
            case "OT":
                if (headTwo == null) {
                    this.headTwo = new Node();
                    this.headTwo.firstName = list[0];
                    this.headTwo.lastName = list[1];
                    this.headTwo.nextNode = null;
                } else {
                    two.firstName = list[0];
                    two.lastName = list[1];
                    two.nextNode = null;
                    current = headTwo;
                    while (current.nextNode != null) {
                        current = current.nextNode;
                    }   
                    current.nextNode = two;
                }
                break;
                
            case "HN":
                if (headThree == null) {
                    this.headThree = new Node();
                    this.headThree.firstName = list[0];
                    this.headThree.lastName = list[1];
                    this.headThree.nextNode = null;
                } else {
                    three.firstName = list[0];
                    three.lastName = list[1];
                    three.nextNode = null;
                    current = headThree;
                    while (current.nextNode != null) {
                        current = current.nextNode;
                    }
                    current.nextNode = three;
                }
                break;
                
            default:
                System.out.print("Something went wrong.");
                break;
        }
    }
    
    /*
    * Returns true if each priority list is empty.
    * @return True if all three lists are empty.
    * @return False if there is any name in any of the lists.
    */
    public boolean isEmpty() {
        return headOne == null && headTwo == null && headThree == null;
    }
    
    /*
    * Removes and prints the top entry of all the lists.
    */
    public void remove() {
        Node next = new Node();
        
        if (isEmpty() == true) {
            System.out.println("Cannot remove entry from an empty list.");
        } else if (this.headOne != null) {
            System.out.println(headOne.firstName + " " + headOne.lastName);
            headOne = headOne.nextNode;
        } else if (this.headOne == null && this.headTwo != null) {
            System.out.println(headTwo.firstName + " " + headTwo.lastName);
            headTwo = headTwo.nextNode;
        } else if (this.headOne == null && this.headTwo == null && this.headThree != null) {
            System.out.println(headThree.firstName + " " + headThree.lastName);
            headThree = headThree.nextNode;
        }
    }
    
    /*
    * Prints the list.
    */
    public void print() {
        Node tempOne = this.headOne;
        Node tempTwo = this.headTwo;
        Node tempThree = this.headThree;
        
        if (isEmpty()) {
            System.out.println("The lists are empty. There are no people in the "
                    + "emergency room.");
        } else if (isEmpty() != true) {
            while (tempOne != null) {
                System.out.println(tempOne.firstName + " " + tempOne.lastName);
                tempOne = tempOne.nextNode;
            }
            while (tempTwo != null) {
                System.out.println(tempTwo.firstName + " " + tempTwo.lastName);
                tempTwo = tempTwo.nextNode;
            }
            while (tempThree != null) {
                System.out.println(tempThree.firstName + " " + tempThree.lastName);
                tempThree = tempThree.nextNode;
            } 
        }
    }
}
