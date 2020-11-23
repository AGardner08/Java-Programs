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
public class newCoordinates {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

Coordinates t1 = new Coordinates();   
    Coordinates t2 = new Coordinates(8, 9);   
    Coordinates t3 = new Coordinates(t2);   
   
     System.out.println("t1.x, t1.y: " + t1.x + ", " + t1.y);  
     System.out.println("t2.x, t2.y: " + t2.x + ", " + t2.y);  
     System.out.println("t3.x, t3.y: " + t3.x + ", " + t3.y); 
     

    }
    
}
