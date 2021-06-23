package test.rpg;

public class Enemy {
//Will be inherited

    String name;
    int hitPoints;
    int lives;

    //Create a Enemy method to set enemy, damage and lives

    public Enemy(String name, int hitPoints, int lives) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.lives = lives;
    }

    //Create a method called takeDamage (int damage)
    public void takeDamage (int damage) {
        int resetHP = hitPoints;
        int remainingHP = hitPoints - damage;
        //Check if still alive
        if (remainingHP > 0) {
            setHitPoints(remainingHP);
            System.out.println("Took " + damage + " damage.");
        } else {
            this.lives -= 1;
            if (lives > 0) {
                System.out.println("Lost a life");
            }
            else {
                System.out.println("game over");
            }

        }

    } //take dmg method

    //create a method showInfo() to display stats
    public void showInfo() {
        System.out.println("Name: " + this.name + " HP: " + hitPoints + " Lives: " + lives);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getLives() {
        return lives;
    }

    public void setLives(int lives) {
        this.lives = lives;
    }
}
