public class LeapYear {

    public static boolean isLeapYear(int year) {

        if(year >=1 && year < 9999) {
            if(year % 4 == 0) {
                System.out.println("Divisible by 4");
               // return true;
            }  if (year % 100 == 0 ) {
                System.out.println("Divisible by 100");

               // return true;
            }  if (year % 400 == 0) {
                System.out.println("Divisible by 400");

               // return true;
            }
            System.out.println("366 days = leap");

            return true;
        } else {

            return false;
        }

    }
}
