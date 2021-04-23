public class BarkingDog {

    public  static boolean shouldWakeUp(boolean barking, int hourOfDay) {

       // barking = true;

        //wake up if before 8 || after 22
        if (barking && hourOfDay<8 && hourOfDay >= 0 ) {
            System.out.println(barking);
            System.out.println(hourOfDay);
            return barking;
        } else if (barking && hourOfDay > 22 && hourOfDay <=23 ) {
            System.out.println(barking);
            System.out.println( hourOfDay);
            return barking;
        } else {
            barking = false;
            System.out.println(hourOfDay + " is false");
            System.out.println(barking + " < should be false");

            return barking = false;
        }



    }
}
