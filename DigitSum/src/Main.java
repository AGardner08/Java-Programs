public class Main {

    public static void main(String[] args) {

        System.out.println(sumDigits(32123));

    }

    public static int sumDigits(int number) {

        if (number < 10) {
            return -1;
        }
        //n = n % 10 extract least digit
        //n = n / 10 discard least digit

        int sum = 0;

        //125 > discard: 12 > 12 * 10 = 120 > 125 - 120
        //Use while method when int may be below 10 but not <= 0
        while(number> 0){

            //extract least digit:
            int digit = number % 10;
            System.out.println("Extracted " + number + " to get " + digit);

            //add to sum
            sum += digit;
            System.out.println("Added " + digit + " to the sum: " + sum);

            //discard least digit
            number /= 10; //number represents n
            System.out.println("Discarded least digit to get " + number);
        }

        System.out.println("Final answer:");

        return sum;

    }
}
