public class Main {

    public static boolean isPalindrome(int number) {

        int reverse = 0;
        //reverse = number;

        //Extract last digit
        int lastDIgit = number % 10;
        reverse *= 10;
        reverse += lastDIgit;

        lastDIgit /= 10;

        reverse += lastDIgit;


    }
}
