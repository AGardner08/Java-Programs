/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CST3513M9D24;

import java.util.Scanner;



/**
 *
 * @author class
 */
public class newDaysCW {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   Scanner keyboard = new Scanner(System.in);
    
  //  double Mon = input.nextDouble();
  // Mon = Increment;  
  
  
  {
      Increment value = new Increment( 5 );

      //System.out.printf( "Before incrementing: %s\n\n", value );

      System.out.printf( "Set a date :" );
      //array[i] =
               keyboard.nextInt();
      
      for ( int i = 1; i <= 3; i++ ) 
      {
         value.addIncrementToTotal();
         System.out.printf( "After increment %d: %s\n", i, value );
      } //
    
    
    
    
    }
    
    } 
}
