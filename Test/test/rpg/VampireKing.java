package test.rpg;

import java.util.Random;

public class VampireKing extends Enemy{

    public VampireKing(String name) {
        super(name, 140, 3);
    }

    @Override
    public void takeDamage(int damage) {
        int damageReduction = (damage / 4);
        super.takeDamage(damageReduction);

    }

    public boolean runAway() {
//        if(getLives() < 2) {
//            return true;
//        } else {
//            return false;
//        }
        //Altermative method
        return (getLives() < 2);
    }

    public boolean dodge() {
        Random rand = new Random();
        //set an int chance (range 6) attached to rand if greater than 3
        int chance = rand.nextInt(6);
        //set successful range 3+
        if (chance >3 ) {
            System.out.println("Boss dodges!");
            return true;
        }
        return false;
    }

}
