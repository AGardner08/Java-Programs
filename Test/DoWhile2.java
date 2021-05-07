public class DoWhile2 {
    
    public static void main(String[] args) {
        
        int count = 1; 
        
        //While method without Do 
        while(count != 6) {
            System.out.println("Count: " + count);
            count++;
        }

        

        //To use the boolean while method, reset count to 1
        count = 1;
        while(true ) {
            if (count == 6) {
                break;
            }
            System.out.println("COunt " + count);
            count++;
        }


    }

}
