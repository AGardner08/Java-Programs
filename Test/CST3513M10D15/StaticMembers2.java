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
public class StaticMembers2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
 Illustrate illusObject1 = new Illustrate(3);     //Line 1
        Illustrate illusObject2 = new Illustrate(5);     //Line 2


        Illustrate.incrementY();                         //Line 3
        Illustrate.count++;                              //Line 4

        System.out.println("Line 5: illusObject1: "
                          + illusObject1);               //Line 5
        System.out.println("Line 6: illusObject2: "
                          + illusObject2);                //Line 6

        System.out.println("Line 7: ***Increment y "
                         + "using illusObject1***");     //Line 7
        illusObject1.incrementY();                       //Line 8

        illusObject1.setX(8);                            //Line 9

        System.out.println("Line 10: illusObject1: "
                         + illusObject1);                //Line 10
        System.out.println("Line 11: illusObject2: "
                         + illusObject2);                //Line 11

        System.out.println("Line 12: ***Increment y "
                         + "using illusObject2***");     //Line 12
        illusObject2.incrementY();                       //Line 13

        illusObject2.setX(23);                           //Line 14

        System.out.println("Line 15: illusObject1: "
                         + illusObject1);                //Line 15
        System.out.println("Line 16: illusObject2: "
                         + illusObject2);           

    }
    
}
