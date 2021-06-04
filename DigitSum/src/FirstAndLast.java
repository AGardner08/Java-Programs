public class FirstAndLast {

    public static void main(String[] args) {

        //Test with the number 212
        System.out.println(sumFirstAndLastDigit(26512));

    }

    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1;
        }


        int lastDigit = number % 10;
        System.out.println("Last digit: number % 10 =  " + number );

        //set firt digit to 0
        int firstDigit = 0;

        while (number > 0) {

            System.out.println("Removed Digit: " + firstDigit);

            // This will provide the first digit at the last run of the loop
            firstDigit = number % 10;

            System.out.println("Number: " + number);
            //discard extra digits in between first and last
            number /= 10;
        }
        return lastDigit + firstDigit;
            }


    }


