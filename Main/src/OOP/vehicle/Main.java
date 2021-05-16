package OOP.vehicle;

public class Main {

    public static void main(String[] args) {

        //Pre create engine
        Engine engine = new Engine("Renault", 8000);

        //Create a car
        Car mercedes = new Car("Mercedes AMG", 2, "silver", engine);

    /*  Alternative Route
        Car mercedes = new Car("Mercedes AMG", 2, "silver", new Engine("Renault", 8000);
     */
        System.out.println(mercedes.getName());
        Engine engines = mercedes.getEngine();

        //Get both engine and model to display line 8
        System.out.println("Engine model: " + mercedes.getEngine().getModel());




    }
}
