public class Main {
    public static void main(String[] args) {

        System.out.println(getDurationString(65,45));
        System.out.println(getDurationString(3600));
    }

    public static String getDurationString(int minutes, int seconds) {

        if((minutes < 0) || (seconds < 0  && seconds > 60)) {
            return "Invalid Value";
        }

        int hours = minutes / 60;
        int remainingMinutes = minutes % 60;



        //XXHOURS YYMINUTES ZZSECONDS
        return hours + "h " + remainingMinutes + "m " + seconds + "s";
    }

    //Calculate how many minutes are in seconds
    //call other method for correct minutes
    public static String getDurationString(int seconds) {

        if(seconds <0 ){
            System.out.println("Invalid value");

        }

        int minutes = seconds / 60;
        int remainingSeconds = seconds % 60;



        return getDurationString(minutes, remainingSeconds);
    }

}
