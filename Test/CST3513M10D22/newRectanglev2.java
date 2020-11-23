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

public class newRectanglev2
{
   public static void main(String[] args)
   {
      // Create a Rectangle object, passing 5.0 and
      // 15.0 as arguments to the constructor.
      Rectanglev2 rectangle2 = new Rectanglev2(5.0, 15.0);
//ignore the new, copy the v2 after Rectangle

      // Display the length.
      System.out.println("The Rectangle's length is " +
                         rectangle2.getLength());

      // Display the width.
      System.out.println("The Rectangle's width is " +
                         rectangle2.getWidth());

      // Display the area.
      System.out.println("The Rectangle's area is " +
                         rectangle2.getArea());
   }
}