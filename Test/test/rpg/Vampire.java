package test.rpg;

public class Vampire extends Enemy {

    //Refactor to one parameter
    public Vampire(String name) {
        //set fixed stats unique to vampires
        super(name, 20, 3);
    }

    @Override
    public void takeDamage(int damage) {
        //Set dmg cut by half
        int damageHalf = (damage /2 );
        //set modified damage to take damage
        super.takeDamage(damageHalf);
    }


}
