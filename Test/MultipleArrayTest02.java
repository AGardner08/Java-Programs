import java.util.Arrays;

public class MultipleArrayTest02 {
    public static void main(String[] args) {
        
        //Different method of creating a multi array object 
    
        int[][] arrayM = {{1, 2, 3}, {4, 5, 6}};
        int[][] arrayN = {{0,0,0,0}, {5,3,2}};

        System.out.println("ArrayM: " + Arrays.deepToString(arrayM));
        
        System.out.println("ArrayN: " + Arrays.deepToString(arrayN));


    }
}
