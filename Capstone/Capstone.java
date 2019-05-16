package capstone;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * This project is the capstone project for the CIS 2353 course in Data Structures
 * at Oakland Community College. It takes in names and conditions of patients
 * read from a file and assigns them to linked lists based on the severity of
 * their condition.
 * 
 * @author Rachel Inderhees
 * @course CIS 2353
 * @prof John Baugh
 * @sem Summer 2018
 */
public class Capstone {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        try {
            Scanner scan = new Scanner(new File("TriageNames.txt"));
            while (scan.hasNextLine())
                arr.add(scan.nextLine());
        } catch (FileNotFoundException ex) {
            System.out.print("File not found. Please check your file location "
                    + "and name and run the program again.");
            System.exit(0);
        } //reads the file of patients and stores them in an ArrayList
        
        //for (int i = 0; i < arr.size(); i++) {
        //    System.out.println(arr.get(i));
        //} //Checks that the file was read into the ArrayList by printing it
        
        TriageSimulator triage = new TriageSimulator(); //creates new instance of TriageSimulator
        
        System.out.println(triage.isEmpty()); //tests the isEmpty() case
        triage.print(); //tests the print method
        
        for (int i = 0; i < arr.size(); i++) {
            triage.add(arr.get(i));
        } //adds the entries from the array into the lists
        
        //System.out.println(triage.isEmpty()); //tests the isEmpty() case
        //triage.print(); //tests the print method.
        
        triage.remove(); //removes the first entry in the highest priority list
        triage.remove();
        triage.remove();
        triage.remove();
        triage.remove();
        System.out.println(triage.isEmpty()); //tests the isEmpty method on a non-empty list
        triage.remove();
        triage.add(arr.get(0)); //tests the sorting if another entry is added
        triage.remove();
        triage.remove();
        triage.remove();
        triage.remove();
        triage.remove();
        triage.add(arr.get(2)); //tests the sorting if another entry is added
        triage.remove(); //checks the next entry is correctly sorted
        triage.remove();
        triage.remove();
        triage.remove();
        triage.remove();
        triage.remove(); //removes the last entry in the lowest priority list
        triage.remove(); //checks the empty list case
        System.out.println(triage.isEmpty()); //Tests that the list is empty
    }
}
