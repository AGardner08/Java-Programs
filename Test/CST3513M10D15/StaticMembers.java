/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CST3513M10D15;

// new Illustrate
public class StaticMembers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
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
