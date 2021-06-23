package test.rpg;

public class Troll extends Enemy {

    //Only require name as other stats are fixed
    public Troll(String name) {
        //These parameters will share across all Troll objects
        super(name, 26, 1);
    }

}
