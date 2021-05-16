package org.vardantex.Inheritance;

//Using inheritance
public class Bird extends Animal {

    //Add an attribute exclusive to this class
    private int wings;

    //When using inheritance, must generate constructor

    public Bird(String name, String color, int legs, boolean hasTale, int wings) {
        super(name, color, legs, hasTale);
        this.wings = wings;
    }


    //Override and edit the eating method from Animals
    @Override
    public void eat(String food) {
        super.eat(food);
        System.out.println("Finished eating");
    }

    public  void fly() {
        System.out.println(this.getName() + " can fly");
    }

    public int getWings() {
        return wings;
    }

    public void setWings(int wings) {
        this.wings = wings;
    }
}
