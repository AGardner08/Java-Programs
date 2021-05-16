package OOP.vehicle;

public class Main2 {

    public static void main(String[] args) {

        //Setting to null cannot be performed
        Car mercedes = null;
        //Check if value is null
        if(mercedes != null) {
            mercedes.getName();
        } else {
            System.out.println("Returned null");
        }


    }
}
