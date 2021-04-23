public class main {

    public static void main(String[] args) {


        //Must be false
        LeapYear.isLeapYear(1700);
        LeapYear.isLeapYear(1800);
        LeapYear.isLeapYear(1900);
        LeapYear.isLeapYear(2100);
        LeapYear.isLeapYear(2200);
        LeapYear.isLeapYear(2300);
        LeapYear.isLeapYear(2500);
        LeapYear.isLeapYear(2600);


        //Must be true
        LeapYear.isLeapYear(1600);
        LeapYear.isLeapYear(2000);
        LeapYear.isLeapYear(2400);
        //LeapYear.isLeapYear(1924);

    }
}
