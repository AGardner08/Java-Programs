package OOP.StaticKeyword;

public class TestClass2 {

    private int age;
    private String color;

    private class TestInnerClass {
        private String name;

        public TestInnerClass(String name) {
            this.name = name;
        }

        private void printAge() {
            System.out.println("Age " + age);
        }

    } //End of Test Inner

}
