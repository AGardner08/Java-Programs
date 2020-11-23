/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CST3513M9D10;

/**
 *
 * @author class
 */
public class Date {
 //public class Date {

  public int month;
  public int day;
  public int year;

// implementation section

// Definition of constructor
 public Date(int mm , int dd , int yy )
 {
   month = mm;
   day = dd;
   year = yy;
 }

// member function to assign a date

 public void setDate(int mm, int dd, int yy)
  {
    month = mm;
    day = dd;
    year = yy;
  }

// member function to display a date

 public void showDate( )
 {
  System.out.println( "The date is "+ month + "/" + day + "/" + year + "\n");
 }   
 }

