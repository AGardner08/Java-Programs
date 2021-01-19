import java.util.Scanner;

class Stats {

    private int level = 0;
    
    
    //set needs a void
    public void setStats(int level) {
        // => the private objects
        this.level = level;

    }
    
    //Use the get method 
    public int getStats(){
        return level;
       // return level
        
    }
    
}

//Encapsulation uses get set methods
public class Encapsulation {
    public static void main(String[] args) {
    
        //Stats [Name of set method.this name]
        Stats level = new Stats();
        level.setStats(100);

        //To sysout the get set. Use the (value)[Name].Get method()
        System.out.println((int)level.getStats());


    }
}
