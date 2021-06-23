package test.rpg;

public class DemoEnemy {

    public static void main(String[] args) {

        //Enemy enemy = new Enemy("test enemy", 10, 3);
        //Show enemy stat method
       // enemy.showInfo();

        VampireKing VLAD = new VampireKing("Vampire BOSS");
        VLAD.showInfo();
        VLAD.takeDamage(4);
        VLAD.showInfo();

        System.out.println();

        Vampire shalltear = new Vampire("True Vampire");
        shalltear.showInfo();
        shalltear.takeDamage(10);
        shalltear.showInfo();
    }
}
