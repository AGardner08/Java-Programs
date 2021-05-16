package OOP.other;

import java.util.Scanner;

public class PoundConverter {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int Pound = 1;
        double Kilo = 0.45359237d;
        double custompKilo;
        double onepKilo = Pound * Kilo;

        System.out.println("One pound converted to a kilo is : " + onepKilo );
        System.out.println();
        System.out.println("Enter a number of pounds to convert it to kilo: ");
        custompKilo = keyboard.nextDouble();

        //Create the converted method
        double convertedpKilo = custompKilo * Kilo;

        System.out.println("Converted value is: " + convertedpKilo);

    }
}
