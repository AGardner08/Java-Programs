public class LeapYear {

    public static boolean isLeapYear(int year) {

        if(year >=1 && year < 9999) {

            if(year % 4 == 0 && year % 100 == 0 && year % 400 == 0) {
                System.out.println("Leap year");
                return true;
            } else {
                System.out.println("Not a leap year ");
                return false;
            }
        } else { //outer if else
            return false;
        }



    }
}
