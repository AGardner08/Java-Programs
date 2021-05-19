package OOP.SingletonPattern;

public class Main {
//used for database

    public static void main(String[] args) {

        //Get datase instance
        Database database = Database.getInstance("db_music");

        System.out.println(database.toString());

    }
}
