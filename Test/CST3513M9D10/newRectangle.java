/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CST3513M9D10;

/**
 *
 * @author Andrew
 */
public class newRectangle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Rectangle rec = new Rectangle();
      //  Rectangle Rectangle = new Rectangle();
      
      rec.setLength(10);
      rec.setWidth(20);

      //Rectangle.setLength(10);
    //  Rectangle.setWidth(20);

      
      System.out.println("Length of the Rectangle is " + rec.getLength());
    //      System.out.println("Length of the Rectangle is " + Rectangle.getLength());
  
     
      System.out.println("Width of the Rectangle is " + rec.getWidth());
     // System.out.println("Width of the Rectangle is " + Rectangle.getWidth());
      
    
      System.out.println("The area of the Rectangle is " + rec.getArea());
     //  System.out.println("The area of the Rectangle is " + Rectangle.getArea());
   
    
    
    
    }
    
}
