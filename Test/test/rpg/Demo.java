package test.rpg;

public class Demo {


    public static void main(String[] args) {



        Player louise = new Player("Louise", 8);
        System.out.println(louise.getHandleName());
        System.out.println("Level " + louise.getLevel());
        System.out.println("Lives " + louise.getLives());
        System.out.println("Weapon: " + louise.getWeapon().getName());

        System.out.println();

        Weapon myAxe = new Weapon("Iron Axe", 16, 59);
        louise.setWeapon(myAxe);
        System.out.println(louise.getWeapon().getName());

        //Create a potion loot and set the type to POTION and set value to 7
        Loot redPotion = new Loot("Red Potion", LootType.POTION, 7);
        //Add red potion to the array
        louise.pickupLoot(redPotion);

        //CREATE 5 MORE LOOT

        Loot ironArmor = new Loot("Iron Armor", LootType.ARMOR, 35 );
        Loot blackRing = new Loot("Obsidian Ring", LootType.RING, 22);
        Loot bluePotion = new Loot("Mysterious Blue Potion", LootType.POTION, 8);

        //LOOT PICKUP SECTION
        louise.pickupLoot(ironArmor);
        louise.pickupLoot(blackRing);
        louise.pickupLoot(bluePotion);

        //Alternate way of adding loot
        louise.pickupLoot(new Loot("+5 Cursed Helmet", LootType.ARMOR, 99));

        //create a 2nd array<Loot> to collect all items added from louise inventory
//        ArrayList<Loot> allItems = louise.getInventory();


        louise.showInventory();

        //Delete redpotion
        boolean wasDeleted = louise.dropLoot(redPotion);
        System.out.println(wasDeleted);
        louise.showInventory();

        System.out.println(louise.score());

    }
}
