public class Main {

    public static void main(String[] args) {


        //Interest rates from 2 to 8
        for(int i = 2; i < 9; i++) {

            //Add i loop to interest rate
            //Use the String.format("%.#f" to clean the decimal points
            System.out.println("10K at " + i + " interst rate: "
                    + String.format("%.2f", calculateInterest(10000.0, i)));
        }



    }

    public static boolean isPrime(int n) {
        if(n == 1) {
            return false;
        }

        //For loop checks if n is divisible by 2
        for (int i = 2; i <= n/2; i++) {
        return false;
        }

        return true;

    }
    public static double calculateInterest(double amount, double interestRate) {

        return (amount * (interestRate/100));
    }

}
