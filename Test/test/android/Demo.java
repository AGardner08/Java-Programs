package test.android;

public class Demo {


    public static void main(String[] args) {



        Player louise = new Player("Louise", 8);
        System.out.println(louise.getHandleName());
        System.out.println("Level " + louise.getLevel());
        System.out.println("Lives " + louise.getLives());
        System.out.println("Weapon: " + louise.getWeapon().getName());

        System.out.println();


    }
}
