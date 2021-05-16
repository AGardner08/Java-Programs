package OOP.vehicle;

public class Main3 {

    public static void main(String[] args) {

        final Engine engine = new Engine("Renault", 8000);

        //To change the properties of a final object
        engine.setRpm(10_000);


    }
}
