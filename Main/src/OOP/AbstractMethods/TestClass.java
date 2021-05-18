package OOP.AbstractMethods;

public class TestClass extends TestAbstractClass{
    public TestClass(String name) {
        super(name);
    }

    public TestClass() {
        super();
    }
    //Abstract classes uses extends for another file
    //Cannot extends multiple classes

    @Override
    public void printName(String name) {

        System.out.println("Name: " + name);
    }
}
