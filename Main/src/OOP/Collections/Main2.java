package OOP.Collections;

import java.util.ArrayList;
import java.util.List;

public class Main2 {

    //The use of collections for arrays
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        //Add names to the current array
        names.add("Apple");
        names.add("James");
        names.add("Amy");
        names.add("Sonic");
        names.add("Proton");
        names.add("Ace");

        //print the first element
        System.out.println(names.get(0));

        //To clear the array value: names.clear();

        //Remove the name Sonic
        names.remove("Sonic");

        System.out.println(names);

        //To check if a specific value is in an array
        System.out.println(names.contains("Sonic"));

        //Check position of where a value in an array is located
        System.out.println(names.indexOf("Amy"));

        //Get all names per line
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));

        }
    }
}
