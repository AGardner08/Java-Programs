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

public class newRectangle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            // Create a Rectangle object.
      Rectangle rectangle = new Rectangle();

      // Set length to 10.0 and width to 20.0.
      rectangle.setLength(10.0);
      rectangle.setWidth(20.0);

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
