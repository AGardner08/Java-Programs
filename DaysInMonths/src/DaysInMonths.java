public class DaysInMonths {

    public static boolean isLeapYear(int year) {

        if(year >=1 && year < 9999) {//outer if else

            if(year % 4 == 0 && year % 100 == 0 ) {
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

    public static int getDaysInMonth(int month, int year) {

        if (month < 1 || month > 12) {
            return -1;
        } else if (year < 1 || year > 9999) {
            return -1;
        } else if (isLeapYear(year)) {

            switch (month) {

                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    return 31;

                case 4:
                case 6:
                case 9:
                case 11:
                    return 30;

                case 2:
                    return 28;
            }

        }



            return -1;


    }

}
