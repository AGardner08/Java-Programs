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
       
        
        public static void main(String[] args) {
            Scanner keyboard = new Scanner(System.in);        
                
            System.out.println("Enter a name:");
            
            //set the name to retrieve
            GetSet text = new GetSet();
            text.setName(keyboard.nextLine());
            
            //Get the name and set as string 
            System.out.println("Greetings " + (String)text.getName());
            
    }
}
