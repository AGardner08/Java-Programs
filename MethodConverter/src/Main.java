public class Main {

    public static void main(String[] args) {

       // int newScore = calculatedScore("Tim", 500);
       // System.out.println("new score: " + newScore);

        //Without the need of a name
       // calculatedScore(75);

        //Methlod overloaded with no value
       // calculatedScore();

        //Test calc method
        calcFeetAndInchesToCentemeters(6,0);
        calcFeetAndInchesToCentemeters(-4,55);

        //1 in = 2.54cm
        //1 feet = 12 in


    }

    public static int calculatedScore(String playerName, int score) {

        System.out.println("Player: " +playerName + " scored " + score );
        return score * 1000;
    }

//Overloading methods
    public static int calculatedScore(int score) {

        System.out.println("Unknown Player:" +" scored " + score );
        return score * 1000;
    }

    //Overload with no value
    public static int calculatedScore() {

        System.out.println("Unknown Player:" +" scored nothing" );
        return 0;
    }

    public static double calcFeetAndInchesToCentemeters(double feet, double inches) {

        if((feet >= 0) || (inches >= 0 && inches <=12)) {
            //1 in = 2.54cm
            //1 feet = 12 in
            double centimenters = (feet * 12) * 2.54;
            centimenters += inches * 2.54;

            System.out.println(feet + " feet has passed and " + inches + " inches = "
                    + centimenters + "cm");
            return centimenters;
        } else {

            System.out.println("no");
            return -1;
        }



    }

}
