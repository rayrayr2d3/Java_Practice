import javax.swing.JOptionPane;

class Spont
{
   public static void main(String [] args)
   {
      String speed = JOptionPane.showInputDialog(null, "What is your speed limit?");        
      int fast = Integer.parseInt(speed);
      if(fast > 75) {
         JOptionPane.showMessageDialog(null, "You are going too fast.", "Caution", JOptionPane.ERROR_MESSAGE);
         Object[] options = {"OK", "CANCEL" };
         JOptionPane.showOptionDialog(null, "You're going to crash.", "Warning",
               JOptionPane.DEFAULT_OPTION,
               JOptionPane.WARNING_MESSAGE,
               null, options, options[0]);
      }else {
         JOptionPane.showMessageDialog(null, "You're driving under the speed limit.", "Great job!", JOptionPane.INFORMATION_MESSAGE);
         Object[] options = {"OK", "CANCEL" };
         JOptionPane.showOptionDialog(null, "You've arrived safely.", "Congrats",
               JOptionPane.DEFAULT_OPTION,
               JOptionPane.INFORMATION_MESSAGE,
               null, options, options[0]);
            }
   }
}
