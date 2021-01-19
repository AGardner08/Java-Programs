public class BubbleSort {
    public static void main(String[] args) {
        
        double[] array = { 21, 13, 17, 5, 3};

        int temp = 0;
        int var1 = 0;
        int var2 = 0;

        for (var1 = 0; var1 < array.length - 1; var1++){
            for (var2 = 0; var2 < array.length - 1 - var1; var2++) {
                if (array[var2] > array[var2 + 1]) {
                    temp = (int) array[var2];
                    array[var2] = array[var2 + 1];
                    array[var2 + 1] = temp;
        }
            }   
            System.out.println(temp);
        }
    }
}
