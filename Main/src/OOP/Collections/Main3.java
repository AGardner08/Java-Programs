package OOP.Collections;

import java.util.HashMap;
import java.util.Map;

public class Main3 {

    //Use of Map = HashMap to recieve values from a specific user
    public static void main(String[] args) {
        //< Key, Values>
        Map<String, String> emailList = new HashMap<>();
        emailList.put("Aegis", "Aegis@code.com");
        emailList.put("Sonic", "Sonic@code.com");
        System.out.println(emailList.get("Sonic"));

        //Check if key/value exists in HashMap
        System.out.println(emailList.containsKey("Sonic"));
        System.out.println(emailList.containsValue("Sonic"));


    }
}
