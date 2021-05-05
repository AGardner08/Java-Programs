public class primeChecker {

    public static void main(String[] args) {


        //count will be the custom loop limit
        int count = 0;

        for(int i=10; i <50; i++) {
            //implement the isPrime method with the for loop
            if(isPrime(i)) {
                //increase the count in the conditional to reach the custom limit
                count++;
                System.out.println("Number " + i + " is prime");

                //in the isPrime conditional, set the custom limit
                if(count == 5) {
                    System.out.println("Max count " + count + "is reached");
                    break;
                }
            }

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

        System.out.println("Prime number: " + n);
        return true;

    }
}
