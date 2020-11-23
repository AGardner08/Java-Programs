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
public class newDate {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    // Create a Date object, passing three
      //   arguments to the constructor.

         Date a = new Date(7,4,94);
         Date b = new Date(4,1,96);
         Date c = new Date(12,25,95);
          b.showDate(); 
         b.month=7;
           b.day=12;
           b.year=77;
         
         a.showDate();         // display object a's values
         b.showDate();         // display object b's values
         c.showDate();         // display object c's values
    
    
    }
    
}
