public class Main {

    public static void main(String[] args) {

        isEvenNumber(2);

        int number = 4;
        int finishNumber = 20;
        //Add count to limit the numbers in loop
        int count = 0;

        while (number <= finishNumber) {
            number ++;



            //Implement the if even method to number
            //Check if the rising number is odd
            if(!isEvenNumber(number)) {
                continue;
            }

            //Add the count conditional limit
            if(count == 5){
                break;
            }

            System.out.println("Even number: " + number);

            count++;

        }

        System.out.println("Max allowed numbers calculated: " + count);


    }

    public static boolean isEvenNumber(int n) {

        if((n %2 ==0)){
            return true;
        } else {
            return false;
        }


    }

}
