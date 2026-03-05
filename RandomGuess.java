import javax.swing.JOptionPane;

public class RandomGuess
{
   public static void main(String[] args)
   {
      // Ask the user to think of a number
      JOptionPane.showMessageDialog(null,
         "Think of a number between 1 and 10.\nClick OK when you are ready.");

      // Generate a random number between 1 and 10
      int randomNumber = 1 + (int)(Math.random() * 10);

      // Show the random number
      JOptionPane.showMessageDialog(null,
         "The computer guessed: " + randomNumber +
         "\nWas that the number you were thinking of?");
   }
}
