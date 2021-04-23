public class BarkingDog {

    public  static boolean shouldWakeUp(boolean barking, int hourOfDay) {

        barking = true;

        //wake up if before 8 || after 22
        if (barking && hourOfDay<8 ) {
            return barking;
        } else if (barking && hourOfDay > 22) {
            return barking;
        } else {
            return false;
        }



    }
}
