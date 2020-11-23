import java.util.Arrays;
import java.util.Scanner;

public class SeatingTest {
    public static void main(String[] args) {
        
        final int ARRAY_SIZE = 10;  // Size of the array
        boolean full = false;

        // Create an array.
        int[] seat = new int[ARRAY_SIZE];
      
          // Create a Scanner objects for keyboard input.
        Scanner keyboard = new Scanner(System.in);
  
        System.out.println("Please enter the class" +
                      seat.length + " number for your seating.");
  
        // Read values into the array
        for (int index = 0; index < seat.length; index++)
        {
           System.out.print("Enter number 1 for First class, 2 for Economy" +
                            (index + 1) + ": ");
                //continue here >
                       seat[index] = keyboard.nextInt();
            

        }
  
        //Convert the array values into a String 
            System.out.println("Here are the " +
                    "numbers that you entered: " + Arrays.toString(seat));
  
        // Pass the array to the showArray method. (incomplete)
        //showArray(seat);
        
    }
}