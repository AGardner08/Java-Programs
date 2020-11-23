/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CST3513M11D5;
import java.util.Scanner;
        
/**
 *
 * @author class
 */
public class Rectangle {
//EC
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner Input = new Scanner(System.in);
        

    int length, width;
    final int rect1w = 5;
    final int rect1h = 10;
    
    final int rect2w, rect2L;
    
    
    System.out.println("Rect1 width: " + rect1w);
    System.out.println("Rect1 height: " + rect1h);
    
    System.out.println("Enter a width: ");
    rect2w = Input.nextInt();
    
    System.out.println("Enter a length: ");
    rect2L = Input.nextInt();
    
   
    
    
    
    System.out.println("Rect2 width: " + rect2w);
  // System.out.println("")
    
    }
        private int rect2w;
        private int rect2L;
    public int GetWidth(int Rec2W) {
        Rec2W = rect2w;
    return Rec2W;
    }
   private int GetLength(int Rec2L)  {
       Rec2L = rect2L;
      return Rec2L;
   }

    
}
