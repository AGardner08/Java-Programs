public class MinutesToYearsDaysCalculator {
    public static void printYearsAndDays (long minutes) {

        if(minutes<0) {
            System.out.println("Invalid Value");
        } else {

            //XX MIN
            //YY YEARS
            //ZZ DAYS

            long hours = minutes / 60;
            long remainHours =  minutes % 60;

            //Dont add to output
            long days = hours / 24;
            long remainDays = hours % 24;

            long years = days / 365;
            long remainYears = days % 365;


            System.out.println(minutes + " min = " + years + " y and " + remainYears + " d");
        }

    }
}
