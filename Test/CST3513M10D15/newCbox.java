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
public class newCbox {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

  // Create a CBOX object, passing three
        //  arguments to the constructor.

        Cbox box1 = new Cbox();

        Cbox box2 = new Cbox(2.2, 1.1, 0.5);

        Cbox box3 = new Cbox(box2);

          System.out.println();
        // display object Box2's's values

          System.out.println("Volume of the box1=" + box1.Volume());
          System.out.println("Volume of the box2=" + box2.Volume());
        //  System.out.printf("Volume of the box2%.2f" , box2.Volume());

          System.out.println("Volume of the box3=" + box3.Volume());
         // System.out.printf("\nVolume of the box2%.2f" , box3.Volume());
          System.out.println();
     

    }
    
}
