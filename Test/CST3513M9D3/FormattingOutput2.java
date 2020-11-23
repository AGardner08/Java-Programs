/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CST3513M9D3;

/**
 *
 * @author andrew.gardner67
 */
public class FormattingOutput2 {

    /**
     * @param args the command line arguments
     */
    //public static void main(String[] args) {
        // TODO code application logic here
    
    
        static final double PI = 3.14159265;                   //Line 3
    public static void main(String[] args) {
    double radius = 12.67;                             //Line 6
        double height = 12.00;                             //Line 7

        System.out.println("Two decimal places: ");        //Line 8

        System.out.printf("Line 9: radius = %.2f, "
                + "height = %.2f, volume = %.2f, "
                + "PI = %.2f%n%n", radius, height,
                PI * radius * radius * height, PI);        //Line 9

        System.out.println("Three decimal places: ");      //Line 10
        System.out.printf("Line 11: radius = %.3f, "
                + "height = %.3f, volume = %.3f,%n"
                + "         PI = %.3f%n%n", radius,
                height,PI * radius * radius * height, PI); //Line 11

        System.out.println("Four decimal places: ");       //Line 12
        System.out.printf("Line 13: radius = %.4f, "
                + "height = %.4f, volume = %.4f,%n "
                + "        PI = %.4f%n%n", radius,
                height,PI * radius * radius * height, PI); //Line 13

        System.out.printf("Line 14: radius = %.3f, "
                  + "height = %.2f, PI = %.5f%n",
                   radius, height, PI);                    //Line 14
    
    
    }
    
}
