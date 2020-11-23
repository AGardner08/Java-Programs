/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CST3513M9D24;

/**
 *
 * @author class
 */

public class StaticMembers2
{
    public static void main(String[] args)
    {
        Illustrate2 illusObject1 = new Illustrate2(3);     //Line 1
        Illustrate2 illusObject2 = new Illustrate2(5);     //Line 2


        Illustrate2.incrementY();                         //Line 3
        Illustrate2.count++;                              //Line 4

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
                         + illusObject2);                //Line 16
    }
}
