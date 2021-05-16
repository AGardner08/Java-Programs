class Weapon {
    String close = "Sword";
    String medium = "Bow";
    String Long = "Wand";


}

//Inherit with the extends command 
public class Inheritance extends Weapon{
    public static void main(String[] args) {
        
        Inheritance clasS = new Inheritance();
        
        System.out.println("The inherited class for Warrior are: " + clasS.close  );
        System.out.println();
      
        System.out.println("The inherited class for Ranger are: " + clasS.medium);
        System.out.println();
      
        System.out.println("The inherited class for Mage are: " + clasS.Long );
        


    }
}
