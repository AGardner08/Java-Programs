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

//  Increment.java
// final instance variable in a class.

public class Increment 
{
   private int total = 0; // total of all increments
   private final int INCREMENT; // constant variable (uninitialized)

   // constructor initializes final instance variable INCREMENT
   public Increment( int incrementValue )
   {
      INCREMENT = incrementValue; // initialize constant variable (once)
   } // end Increment constructor

   // add INCREMENT to total
   public void addIncrementToTotal()
   {
      total += INCREMENT;
   } // end method addIncrementToTotal 

   // return String representation of an Increment object's data
   public String toString()
   {
      return String.format( "total = %d", total );
   } // end method toString
} // end class Increment