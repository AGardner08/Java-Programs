public class EvenDigit {

    public static void main(String[] args) {

        System.out.println( getEvenDigitSum(252)); //Return 4
    }

    /*

        Sum the even numbers of any string of numbers
        Return -1 if negative

        ex: 252

   */


    //TODO: Need a div by 10 for divnumber to lower
    //TODO: Need a mod by 10 to extract value

    public static int getEvenDigitSum(int number) {

        if (number < 0) {
            return -1;
        }


       int total = 0;
        int divByTwo = number / 2;



        //Create a while loop to get every even number
        do  {
            //Create a conditional for numbers divided by 2
        if(number % 2 == 0) {


            //extract number by 10 and add to total
            total += number % 10;



        }//modByTwo conditional statement

            //discard number by 10
            number /= 10;


        } while (number > 0);


        return total;
    }//End of class

}
