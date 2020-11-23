/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CST3513M9D24;

/**
 *
 * @author class
 */

//  newIncrement.java
// final variable initialized with a constructor argument.

public class newIncrement 
{
   public static void main( String[] args )
   {
      Increment value = new Increment( 5 );

      System.out.printf( "Before incrementing: %s\n\n", value );

      for ( int i = 1; i <= 3; i++ ) 
      {
         value.addIncrementToTotal();
         System.out.printf( "After increment %d: %s\n", i, value );
      } // end for
   } // end main
} // end class newIncrement