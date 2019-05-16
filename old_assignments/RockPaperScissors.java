import javax.swing.JOptionPane;

class RockPaperScissors
{
   public static void main (String [] args)
   {
      String roll = JOptionPane.showInputDialog(null, "Rock, paper, scissors");
      if (roll == "rock") {
         System.out.print("Rock.");
      }
      else if (roll == "paper") {
         System.out.print("Paper.");
      }
      else if (roll == "scissors") {
         System.out.print("Scissors");
      }
   }
}