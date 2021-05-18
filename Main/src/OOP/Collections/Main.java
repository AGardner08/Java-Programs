package OOP.Collections;

public class Main {

    public static void main(String[] args) {

        String[] names = {"Apple", "James", "Amy", "Sonic", "Proton", "Ace" };

        //Output the third name in the names array
        System.out.println(names[2]);



        //Add a new array of names to a currently existing array
        String[] newNames = new String[6];
        for (int i=0; i < names.length; i++) {
            newNames[i] = names[i];

        }

        System.out.println(newNames[2] = "Jay");
    }
}
