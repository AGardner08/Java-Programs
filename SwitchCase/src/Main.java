import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int number = 0;
        System.out.println("Enter a number between 1 and 5");
        number = keyboard.nextInt();

        switch(number) {
            case 1:
                System.out.println("You've entered: "  + number);
                break;

            case 2:
                System.out.println("You've entered: "  + number);
                break;

            case 3:
                System.out.println("You've entered: "  + number);
                break;

            case 4:
                System.out.println("You've entered: "  + number);
                break;

            case 5:
                System.out.println("You've entered: "  + number);
                break;

            default:
                System.out.println("Incorrect range");
        }



    }
}
