package org.vardantex.Inheritance;

public class Main {

    public static void main(String[] args) {

        Bird phoenix = new Bird("Apple", "Yellow",2, true, 2);
        System.out.println(phoenix.getName());
        phoenix.eat("Food");
        System.out.println("Total wings: " + phoenix.getWings());
        //Call the fly method
        phoenix.fly();




        System.out.println();

        Animal husky = new Animal("Amy","Black & White", 4, true);
        System.out.println();




        }
}
