package OOP.Interface;

//Class to implement the interface
public class ElectricCar implements CarInterface{

    private String name;

    public ElectricCar(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //Two overrrides needs to be used when implementing an interface
    @Override
    public void start() {
        System.out.println(this);
        System.out.println("Energy flow started...");
    }

    @Override
    public void move(int speed) {

        System.out.println(this.getName() + " is moving at the speed of " + speed);
    }
}
