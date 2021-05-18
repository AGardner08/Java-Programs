package OOP.Interface;

import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args) {

        //Assign a class to an interface
        CarInterface carInterface = new ElectricCar("Tesla");
        carInterface.start();
        carInterface.move(50);

        //Call the Fossilfuel car
        CarInterface fossilCarInterface = new FossilFuelCar("Mercedes");
        fossilCarInterface.start();
        fossilCarInterface.move(70);


    }
}
