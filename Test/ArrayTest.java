import java.util.Arrays;
import java.util.Scanner;

public class ArrayTest {
    public static void main(String[] args) {
        final int ARRAY_SIZE = 4;  // Size of the array

      // Create an array.
      int[] nums = new int[ARRAY_SIZE];
    
        // Create a Scanner objects for keyboard input.
      Scanner keyboard = new Scanner(System.in);

      System.out.println("Enter a series of " +
                    nums.length + " numbers.");

      // Read values into the array
      for (int index = 0; index < nums.length; index++)
      {
         System.out.print("Enter number " +
                          (index + 1) + ": ");
         nums[index] = keyboard.nextInt();
      }

      //Convert the array values into a String 
          System.out.println("Here are the " +
                  "numbers that you entered: " + Arrays.toString(nums));

      // Pass the array to the showArray method. (incomplete)
      //showArray(nums);
    } 
}
