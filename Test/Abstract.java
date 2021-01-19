
abstract class attackSounds {

    public abstract void swordAttack();
    public abstract void bowAttack();


}

public class Abstract extends attackSounds {

    //use all the abstract methods
    public void swordAttack() {
        System.out.println("Clank!");
    }

    public void bowAttack() {
        System.out.println("Pew!");
    }

    public static void main(String[] args) {
        
        attackSounds warrior = new Abstract();
        System.out.println("Warrior:");
        warrior.swordAttack();
        System.out.println();

        System.out.println("Ranger:");
        attackSounds ranger = new Abstract();
        ranger.bowAttack();
    }
}
