import java.util.Scanner;

public class GetSet {
    
        private String name;
        
        public String getName() {
        return name;
        
        }
        
        public void setName(String name) {
        if(name!=null && name.length()>2)
        this.name = name;
        
        }
       
    Scanner keyboard = new Scanner(System.in);        
    
    public static void main(String[] args) {
        
        System.out.println("Enter a name:");

       // String text = keyboard.nextLine();

      //  System.out.println(text);
        
    }
}
