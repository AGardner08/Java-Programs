public class Main {


    /*While loop preferred
    Need to compare reversed with original
    if negative, change to positive
    * */
    public static void main(String[] args) {

        //System.out.println(isPalindrome(-1221)); // True
        System.out.println(isPalindrome(707));  //True
       // System.out.println(isPalindrome(11212));   //False
       // System.out.println(isPalindrome(0));    //False

    }

    public static boolean isPalindrome(int number) {

        System.out.println("Entered Number: " + number);

        //make a clone of number to compare
        int newNumber = number;

        if(newNumber < 0 && number <0) {
            newNumber *= -1;
            number *= -1;
        } else

        if(newNumber != 0 && number > 0) {


        int reverse = 0;
        //reverse = number;
        System.out.println(reverse);


            //Extract last digit
        int lastDIgit = newNumber % 10;
            System.out.println("Extract last digit from number: " + lastDIgit);

        //Increase place value by 1 (*10)
        reverse = reverse * 10;
            System.out.println("Increase place value of reverse by 1: " + reverse);

        //Add LastDigit to reverse
        reverse += lastDIgit;
            System.out.println("Add LastDigit to reverse" + reverse);

        //Divide by 10 to remove the last digit after its processed
        newNumber /= 10;
            System.out.println("Divide input number by 10 to remove last digit" + number);


            //Stop here and compare
            

        } else {

            System.out.println(number + " is false.");
            return false;
        }

return true;
    }
}
