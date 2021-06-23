package test.rpg;

public class DemoWhile {

    public static void main(String[] args) {

        VampireKing boss = new VampireKing("VLAD");
        boss.showInfo();

        while (boss.getLives() > 0) {


            boss.takeDamage(12);
            boss.showInfo();
            //check the condition whether the boss dodges and continue loop
            if(boss.dodge()) {
                continue;
                }

            if (boss.runAway()) {
                System.out.println("Ran away");
                break;

            }

        }

    }
}
