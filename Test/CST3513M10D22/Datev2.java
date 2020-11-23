/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CST3513M10D22;

/**
 *
 * @author class
 */

public class Datev2{

      private int month;
      private int day;
      private int year;

// implementation section

// Definition of constructor
// constructor to initialize objects

 public Datev2(int mm , int dd , int yy )
 {
   month = mm;
   day = dd;
   year = yy;
 }




// member function to display a date

 public void showDatev2( )
 {
  System.out.println( "The date is "+ month + "/" + day + "/" + year + "\n");
 }


}