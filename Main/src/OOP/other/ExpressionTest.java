package OOP.other;

public class ExpressionTest {
    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        //Call the calculate mehtod and add values
        calculateScore(true, 800, levelCompleted, bonus);

        calculateScore(true, 10_000, 8, 200);


    }
        public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

            if (gameOver) {
                int finalScore = score + (levelCompleted * bonus);
                finalScore += 2000;
                System.out.println("FInal score: " + finalScore);
            }

        

        }



        }




