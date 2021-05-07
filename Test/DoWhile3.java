public class DoWhile3 {
    
    public static void main(String[] args) {
        

        int count = 1; 
        
        //While method without Do 
        while(count != 6) {
            System.out.println("Count: " + count);
            count++;
        }


        //Reset count for Do While method 
        count = 1;
        do {
            System.out.println("Do Count: " + count);
            count++;
            
        } while(count != 6);
        

    }
}
