package test.android;

public class Player {

    private String handleName ;
    private int lives, level, score;
    private Weapon weapon;

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
}
