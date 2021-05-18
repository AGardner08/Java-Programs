package OOP.StaticKeyword;

public class Main {

    public static void main(String[] args) {

        TestClass.setName("Toriel");

        TestClass testClass = new TestClass(25, "Whote");
        System.out.println("Name: " + testClass.getName());

        TestClass secondTestClass = new TestClass(33, "Maven");
        System.out.println(secondTestClass.name);

        //Execute a method from another class to output
        TestClass.printSomething();

    }
}
