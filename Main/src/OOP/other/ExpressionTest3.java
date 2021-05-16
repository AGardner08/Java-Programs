package OOP.other;

public class ExpressionTest3 {
    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        //For new methods 1 & 2
       String playerName = null;
       int playerScore = 0;

        int position =  calculateHighScorePosition(1500);
        displayHighScorePosition("James", position);

        position =  calculateHighScorePosition(900);
        displayHighScorePosition("Tom", position);

        position =  calculateHighScorePosition(400);
        displayHighScorePosition("Peter", position);

        position =  calculateHighScorePosition(50);
        displayHighScorePosition("Amy", position);

        position = calculateHighScorePosition(100);
        displayHighScorePosition("Train", position);

        //Implement the calculate method and values to the highscore
       int highscore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Final score: " + highscore);



        //First method to display name & score
        displayHighScorePosition(playerName, position);

        //Second method to calculate the scores
        calculateHighScorePosition(playerScore);



    }

    public static void displayHighScorePosition(String playerName, int positionScore) {

        if (playerName == null){
            System.out.println();
        } else {
            System.out.println(playerName + " managed to get into position " + positionScore +
                    " on the high score table.");
        }
    }

    public static int calculateHighScorePosition(int playerScore) {

       int position = 4;
        if(playerScore >= 1000) {
            return position = 1;
        } else if(playerScore >= 500 && playerScore < 1000) {
            return position = 2;
        } else if(playerScore >= 100 && playerScore < 500) {
            return position = 3;
        } else {
            return position;
        }
    }

    //Change method to return a finalScore integer
    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;
        } else {
            return -1;
        }

    }
}




