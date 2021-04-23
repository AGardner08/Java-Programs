public class LeapYear {

    public static boolean isLeapYear(int year) {

        if(year >=1 && year < 9999) {//outer if else

            if(year % 4 == 0 && year % 100 == 0 && year % 400 == 0) {
                System.out.println(year + " is Leap year");
                return true;
            } else if (year % 100 == 0 && year % 400 == 0){
                System.out.println(year + " is Leap year? (true)");
                return true;
            } else {
                System.out.println(year + " is False");
                return false;

            }

        } else { //outer if else
            System.out.println(year + " is False");
            return false;
        }



    }
}
