package capstone;

/**
 *
 * @author Rachel Inderhees
 * @term Summer 2018
 * @prof John Baugh
 */
public class Node {
    public String firstName;
    public String lastName;
    public Node nextNode;
    
    //creates Node
    public Node() {
        this.nextNode = null;
    }//end cstr
    
    //creates Node w/ parameters
    public Node(String first, String last, Node next) {
        this.firstName = first;
        this.lastName = last;
        this.nextNode = next;
    }//end cstr
}
