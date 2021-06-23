package test.rpg;

import java.util.ArrayList;

public class Player {

    private String handleName ;
    private int lives, level, score;
    private Weapon weapon;
    private ArrayList<Loot> inventory;

    public Player() {
        handleName = "Unknown";

    }

    //TODO: If name length conditions don't work, implement set inside the methods


    public Player(String handle){
        this(handle, 1);
    //    lives = 3;
      //  level = 1;
        //score = 0;
    }

    public Player(String handle, int startingLevel) {
//        this.handleName = handle;
//        this.lives = 3;
//        this.level = startingLevel;
//        this.score = 0;

        setHandleName(handle);
        setLives(3);
        setLevel(startingLevel);
        setScore(0);
        setDefaultWeapon();
        inventory = new ArrayList<>();


    }

    public String getHandleName() {
        return handleName;
    }

    public void setNameAndLevel(String name, int level) {
//        this.handleName = name;
//        this.level = level;
        setHandleName(name);
        setLevel(level);

    }

    //Create a new handle to set conditions
    public void setHandleName(String handle) {
        if(handle.length() < 3) {
            System.out.println("Name must be beigger than 3 characters");
            //New name must be shorter than 4
            return;
        }   //Original name set will output if false
            this.handleName = handle;
    }

    private void setDefaultWeapon() {
        //Create this.weapon using the testWeapon class amd 3 parameters
        this.weapon = new Weapon("Sword", 10,20);
    }

    public int getLives() {
        return lives;
    }

    public void setLives(int lives) {
        this.lives = lives;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    //Array get set generation
    public ArrayList<Loot> getInventory() {
        return inventory;
    }

//    public void setInventory(ArrayList<Loot> inventory) {
//        this.inventory = inventory;
//    }

    //Create a method to add new items to the loot array
    public void pickupLoot(Loot newLoot) {
        inventory.add(newLoot);
    }

    public boolean dropLoot(Loot loot) {
        //Check if inventory contains the specified loot
        if (this.inventory.contains(loot)) {
            inventory.remove(loot);
            return true;
        }
        return false;
    }

    public void showInventory() {
        //Create a loop to print all items in inventory
        for(Loot item : inventory) {
            System.out.println(item.getName());
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

    }

    //TODO: Create a method score that tracks the total value of items collected
    public int score() {
        int total = 0;
        for (int i = 0; i < inventory.size(); i++) {

            //Create a Loot object that receives the i loop
            Loot currentLoot = inventory.get(i);
            total = total + currentLoot.getValue();
        }
        return total;

    }
}
