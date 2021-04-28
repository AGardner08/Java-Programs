public class PlayTest {

    public static boolean isCatPlaying(boolean summer, int temperature) {

        //temp between 25 - 35
        // if summer max 45
        if (temperature >= 25 && temperature <= 35){
            System.out.println(temperature);
            return true;

        } else if ((temperature >= 35 && temperature <= 45) && (summer == true) ) {
            summer = true;
            System.out.println(temperature);
            return true;
        }

    return false;
    }
}
