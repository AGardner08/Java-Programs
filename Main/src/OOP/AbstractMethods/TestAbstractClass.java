package OOP.AbstractMethods;

public abstract class TestAbstractClass {
    public TestAbstractClass() {

    }
//Abstract classes doesn't use body {}

    public abstract void printName(String name);

    private String name;


    public TestAbstractClass(String name) {
        this.name = name;
    }

    public void print(String text) {
        System.out.println(text);


    }



}
