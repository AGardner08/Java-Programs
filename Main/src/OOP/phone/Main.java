package OOP.phone;

public class Main {

    public static void main(String[] args) {

        //Referencing another code in the same package
        //Constructor sets all values in ()
        Phone iPhone = new Phone("iPhone", 7, 8, 8);

        //Use the name property from the phone class in the imported package
        //.setName uses the set method to give a name to the private field
        iPhone.setName("iPhone 11");
        //to get the value of the private object use the .getName
        System.out.println(iPhone.getName());


        //Set memory ram [private] to 8
        iPhone.setMemoryRam(8);

        System.out.println("The device RAM is set to " + iPhone.getMemoryRam());


        //Call the iphone playMusic class
        iPhone.playMusic("Pantera 10s");


    }
}
