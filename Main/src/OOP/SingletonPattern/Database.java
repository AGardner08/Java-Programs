package OOP.SingletonPattern;


public class Database {
    private String name;

    private static Database instance;

    //Create a getter method for instance
    public static synchronized Database getInstance(String name) {
        if(null == instance) {
            //New instance
            instance = new Database(name);
            return instance;
        }else {
            //Existing instance
            return instance;
        }

    }
    //Change to privaate to prevent others from accessing the inner database in line 12
    private Database(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //To print the name of the database object
    @Override
    public String toString() {
        String text = "Database class\n" +
                "Name: " + this.name;
        return text;
    }
}
