package org.vardantex.phone;

public class Main {

    public static void main(String[] args) {

        //Referencing another code in the same package
        Phone iPhone = new Phone();
        //Use the name property from the phone class in the imported package
        //.setName uses the set method to give a name to the private field
        iPhone.setName("iPhone 11");
        //to get the value of the private object use the .getName
        System.out.println(iPhone.getName());


        //Call the iphone playMusic class
        iPhone.playMusic("Pantera 10s");


    }
}
