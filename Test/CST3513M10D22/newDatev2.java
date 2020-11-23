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
public class newDatev2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
// Create a Date object, passing three
      //  arguments to the constructor.

         Datev2 a = new Datev2(7,4,94);
         Datev2 b = new Datev2(4,1,96);
         Datev2 c = new Datev2(12,25,95);
         a.showDatev2();         // display object a's values
         b.showDatev2();         // display object b's values
         c.showDatev2();         // display object c's values
      //   b.month; // ERROR because private member
      
       }
  }