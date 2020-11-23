/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CST3513M9D10;

/**
 *
 * @author andrew.gardner67
 */
public class Constructor {

    /**
     * @param args the command line arguments
     */
 
        // TODO code application logic here
   
   public static void main(String[] args)
   {
      // Create a Rectangle object, passing 5.0 and
      // 15.0 as arguments to the constructor.
      Rectangle rectangle = new Rectangle(5.0, 15.0);

      // Display the length.
      System.out.println("The Rectangle's length is " +
                         rectangle.getLength());

      // Display the width.
      System.out.println("The Rectangle's width is " +
                         rectangle.getWidth());

      // Display the area.
      System.out.println("The Rectangle's area is " +
                         rectangle.getArea());
   }
}
