/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CST3513M10D15;

/**
 *
 * @author class
 */
public class Coordinates {
    public int x, y;   
   
  public Coordinates()  { 
        this(0, 0);
    System.out.println("Inside Coordinates()"); 
  }  
 
  public Coordinates(Coordinates obj)  { 
       this(obj.x, obj.y);
    System.out.println("Inside Coordinates(obj)"); 
  }  
 
  public Coordinates(int i, int j) {  
    System.out.println("Inside Coordinates(int, int)"); 
    x = i; 
    y = j; 
}
}
