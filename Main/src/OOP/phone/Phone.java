package OOP.phone;

public class Phone {

    //Properties to phone class
   //Set name access to private
    private String name;
    private int screenSize;
    private int memoryRam;
    private int camera;

    //Create a constructor
    //Cannot be private
    public Phone(String name, int screenSize, int memoryRam, int camera) {
        this.name = name;
        this.screenSize = screenSize;
        this.memoryRam = memoryRam;
        this.camera = camera;
    }

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

    //Generate the remaining getters/setters
    public int getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(int screenSize) {
        this.screenSize = screenSize;
    }

    public int getMemoryRam() {
        return memoryRam;
    }

    public void setMemoryRam(int memoryRam) {
        this.memoryRam = memoryRam;
    }

    public int getCamera() {
        return camera;
    }

    public void setCamera(int camera) {
        this.camera = camera;
    }
}

