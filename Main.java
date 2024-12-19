import java.util.Scanner;

/*doubles vines,
             rowLength,
             endpost,
             vineSpacing

Ask the user to enter the length of a row in feet
Read input into rowLength
Ask the user to enter how many feet is required by the endpost assembly
Read input into endpost
ask the user to enter the space between vines in feet
read input into vineSpacing
calculate vines as (rowLenth – 2 * endpost) / vineSpacing
Display the number of vines the user can fit in each row

*/
 
public class Main
{
   public static void main(String[] args)
   {
      // Variables
      double vines,              // Number of vines
             rowLength,          // Length of a row
             endpost,            // Endpost assembly space
             vineSpacing;        // Space between vines
      
      // Create a Scanner object for keyboard input.
      Scanner keyboard = new Scanner(System.in);
      
      // Get the necessary input.
      System.out.print("What is the length of a row, in feet? ");
      rowLength = keyboard.nextDouble();
      System.out.print("How many feet does an endpost assembly require? ");
      endpost = keyboard.nextDouble();
      System.out.print("What is the space between vines, in feet? ");
      vineSpacing = keyboard.nextDouble();
      
      // Calculate the number of vines.
      vines = (rowLength - 2 * endpost) / vineSpacing;
      
      // Display the result.
      System.out.println("You can fit " + vines +
                         " vines in a row.");
   }
}
