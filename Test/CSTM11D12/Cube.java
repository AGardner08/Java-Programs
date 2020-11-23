/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CSTM11D12;

/**
 *
 * @author class
 */

public class Cube extends Rectangle
{
   private double height;  // The cube's height

 

   public Cube(double len, double w, double h)
   {
      // Call the superclass constructor.
      super(len, w);
      
      // Set the height.
      height = h;
   }



   public double getHeight()
   {
      return height;
   }



   
   public double getVolume()
   {
      return super.getArea() * height;
   }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   

      // Create a cube object and pass the
      // dimensions to the constructor.

Rectangle rect_1 = new Rectangle(9.5,4.5); //create two rectangle objects

Rectangle rect_2 = new Rectangle(3.5,2.5);

      Cube myCube =
             new Cube(3.0, 4.0, 5.0); // create one cube object

      // Display the rectangles' area.
     
      System.out.println("rect_1 Area: " +
                         rect_1.getArea());
     System.out.println("rect_2 Area: " +
                         rect_2.getArea());

   // Display the cube's volume.


      System.out.println("Volume: " +
                         myCube.getVolume());
    
    
    }
    
}
