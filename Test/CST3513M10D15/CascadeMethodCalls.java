/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CST3513M10D15;
//new Person

public class CascadeMethodCalls {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

Person student1 =
                   new Person("Angela", "Smith");              //Line 1

         Person student2 = new Person();                       //Line 2

         Person student3 = new Person();                       //Line 3

         System.out.println("Line 4 -- Student 1: "
                          + student1);                         //Line 4

         student2.setFirstName("Shelly").setLastName("Malik"); //Line 5

         System.out.println("Line 6 -- Student 2: "
                           + student2);                        //Line 6

         student3.setFirstName("Chelsea");                     //Line 7

         System.out.println("Line 8 -- Student 3: "
                           + student3);                        //Line 8

         student3.setLastName("Tomek");                        //Line 9

         System.out.println("Line 10 -- Student 3: "
                           + student3);                        //Line 10




    }
    
}
