import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TitledPane;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import java.io.*;
import java.util.*;

public class IceCreamOrder extends Application {
   /**
   * This program creates a graphical user interface for the purpose of ordering ice cream.
   * It includes a selection of flavours, as well as two options for toppings.
   * It allows the user to calculate the cost of their order, as well as save their
   * preferences to a file, and then read the file to reselect their preferences.
   *
   * @author Rachel Inderhees
   * @course CIS 1500
   * @professor Alan Jackson
   * @semester Winter 2018
   */
   
   public final double MICHIGAN_TAX = 0.06;
   public final double TOPPINGS_COST = 0.50;
   public final double BASE_PRICE = 2.25;
   public static final String FILENAME = "icecream.txt";
   
   @Override
   public void start(Stage primaryStage) {
      TitledPane paneOne = new TitledPane(); //creates a new titled pane named "paneOne"
      paneOne.setText("Flavors"); //sets the title of the pane to "Flavors"
      ToggleGroup flavorGroup = new ToggleGroup(); //creates a togglegroup named "FlavorGroup"
   
      RadioButton chocolate = new RadioButton("Chocolate"); //creates the chocolate togglegroup button
      chocolate.setToggleGroup(flavorGroup); //puts the chocolate button into the Flavors togglegroup   
      chocolate.setSelected(true);
      
      RadioButton vanilla = new RadioButton("Vanilla"); //creates the vanilla togglegroup button
      vanilla.setToggleGroup(flavorGroup); //puts the vanilla button into the Flavors togglegroup
   
      RadioButton strawberry = new RadioButton("Strawberry"); //creates the strawberry togglegroup button
      strawberry.setToggleGroup(flavorGroup); //puts the Strawberry button into the Flavors togglegroup
      
      HBox flavors = new HBox(); //loads the radio buttons into the HBox
      flavors.getChildren().add(chocolate); //adds the chocolate radio button to the HBox
      flavors.getChildren().add(vanilla); //adds the vanilla radio button to the HBox
      flavors.getChildren().add(strawberry); //adds the strawberry radio button to the HBox
      paneOne.setContent(flavors); //loads the radio buttons into the pane
         
      TitledPane paneTwo = new TitledPane(); //creates the second TitledPane
      paneTwo.setText("Toppings"); //sets the title of the pane to "Toppings"
      
      CheckBox nuts = new CheckBox("Nuts"); //creates the nuts checkbox
      CheckBox cherries = new CheckBox("Cherries"); //creates the cherries checkbox
   
      HBox toppings = new HBox(); //creates an HBox to hold the toppings
      toppings.getChildren().add(nuts); //adds nuts to the HBox
      toppings.getChildren().add(cherries); //adds cherries to the HBox
      paneTwo.setContent(toppings); //adds the HBox to paneTwo
   
      TitledPane paneThree = new TitledPane(); //creates a new pane called paneThree
      paneThree.setText("Order"); //sets the name of paneThree to "Order"
      
      Button calculateCost = new Button("Calculate Cost"); //creates a button called calculateCost
      Button saveFile = new Button("Save"); //creates a button called saveFile
      Button restore = new Button("Restore"); //creates a button called restore
      
      //calculates the cost of the order
      calculateCost.setOnAction(
         (event) -> {
            double orderCost = BASE_PRICE; 
            if (nuts.isSelected() && cherries.isSelected()) 
               orderCost += (TOPPINGS_COST * 2); 
            else if (cherries.isSelected()) 
               orderCost += TOPPINGS_COST; 
            else if (nuts.isSelected())
               orderCost += TOPPINGS_COST;
            double taxCost = (orderCost * MICHIGAN_TAX);
            double finalCost = (orderCost + taxCost);
           
            Alert costCalc = new Alert(AlertType.INFORMATION);
            costCalc.setTitle(String.format("Your Order"));
            costCalc.setHeaderText(String.format("Total: $%.2f", finalCost));
            costCalc.setContentText(String.format("Order: $%.2f%nTax: $%.2f%nTotal: $%.2f", orderCost, taxCost, finalCost));
            costCalc.showAndWait();  
         }
      );
   
      //saves the order preferences as a file to a local folder
      saveFile.setOnAction(
         (event) -> {
            try {
               PrintWriter print = new PrintWriter(new FileOutputStream(FILENAME)); //creates an output file and a print method to write to it
               //writes the flavour to the file
               if (chocolate.isSelected())
                  print.println("Chocolate");
               else if (vanilla.isSelected())
                  print.println("Vanilla");
               else
                  print.println("Strawberry");
               //writes the nuts selection to the file
               if (nuts.isSelected())
                  print.println("With_Nuts");
               else 
                  print.println("Without_Nuts");
               //writes the cherries selection to the file
               if (cherries.isSelected())
                  print.println("With_Cherries");
               else
                  print.println("Without_Cherries");
                  
               print.close(); //closes the printer
            }
            catch (FileNotFoundException e) {
               Alert alert = new Alert(AlertType.ERROR); //presents an alert box if an error is thrown
               alert.setTitle("Error");
               alert.setHeaderText("File could not be created.");
               alert.setContentText("File could not be created.");
               alert.showAndWait();
            }
            
         }
      );
      
      //opens the most recently saved order preferences file and sets the preferences accordingly
      restore.setOnAction(
            (event) -> {
            try {
               Scanner scan = new Scanner(new FileInputStream(FILENAME)); //Creates a scanner to read from the file
               do {
                  String s = scan.nextLine(); //scans the first line of the document 
                  //selects the flavour based on what is written in the file
                  if (s.equals("Chocolate"))
                     chocolate.setSelected(true);
                  else if (s.equals("Vanilla"))
                     vanilla.setSelected(true);
                  else if (s.equals("Strawberry"))
                     strawberry.setSelected(true);
                  
                  String r = scan.nextLine(); //scans the second line of the file
                  //selects the flavour based on what is written in the file
                  if (r.equals("With_Nuts"))
                     nuts.setSelected(true);
                  else if (r.equals("Without_Nuts"))
                     nuts.setSelected(false);
                  
                  String p = scan.nextLine(); //scans the third line of the file
                  //selects the flavour based on what is written in his file
                  if (p.equals("With_Cherries"))
                     cherries.setSelected(true);
                  else if (p.equals("Without_Cherries"))
                     cherries.setSelected(false);
                     
               } while (scan.hasNextLine());
            } catch (FileNotFoundException e) {
               Alert alert = new Alert(AlertType.ERROR); //presents an alert box if an error is thrown
               alert.setTitle("Error");
               alert.setHeaderText("File does not exist.");
               alert.setContentText("File could not be found.");
               alert.showAndWait();
            }
         }
      );
             
      HBox order = new HBox(); //creates a new HBox to hold the buttons
      order.getChildren().add(calculateCost); //adds the calculateCost button to the HBox
      order.getChildren().add(saveFile); //adds the saveFile button to the HBox
      order.getChildren().add(restore); //adds the restore button to the HBox
      paneThree.setContent(order); //sets the HBox as the content of paneThree
     
      HBox fullBox = new HBox(); //creates an HBox to hold all the other HBoxes
      fullBox.getChildren().addAll(paneOne, paneTwo, paneThree); //adds all the panes to the HBox
      Scene scene = new Scene(fullBox); //sets the scene and adds the HBox with the panes
      primaryStage.setScene(scene); //sets the stage
      primaryStage.setTitle("Rachel Inderhees - Ice Cream"); //names the stage
      primaryStage.show(); //shows the stage
   }
          
   public static void main(String[] args) {
      launch(args);
   }
}