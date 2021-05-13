package org.vardantex.phone;

public class Phone {

    //Properties to phone class
   //Set name access to private
   private String name;
    int screenSize;
    int memoryRam;
    int camera;

    public void playMusic (String trackName) {

        System.out.println("Music Playing: " + trackName);

    }

    //Get access to set a value in private field name
    public void setName(String name) {
        //this.name accesses the private string name
        this.name = name;
    }

    public  String getName() {
        return this.name;
    }

}

