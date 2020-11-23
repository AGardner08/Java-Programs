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

public class StaticMembers
{
    public static void main(String[] args)
    {
        Illustrate illusObject1 = new Illustrate(3);      //Line 1
		Illustrate illusObject2 = new Illustrate(5);      //Line 2

        Illustrate.incrementY();
		Illustrate.count++;

        System.out.println(illusObject1);
        System.out.println(illusObject2);

        Illustrate.count++;
        System.out.println(illusObject1);
		System.out.println(illusObject2);
    }
}