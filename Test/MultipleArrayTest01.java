import java.util.Arrays;

public class MultipleArrayTest01 {
    public static void main(String[] args) {
        
        //Create a multi array of 2 rows and 4 columns
        int[][] arrayM = new int[2][4];


        //Place a number 0 in the 2nd row 3rd column
        arrayM[1][2] = 2;

        //Place a number in the first row 1st column
        arrayM[0][0] = 5;

        //deepToString for multiple arrays
        System.out.println(Arrays.deepToString(arrayM));

    }

}
