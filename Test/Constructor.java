public class Constructor {
    
    //These values are used in the public class compared to encapsulation 
    String name;
    char gender;

    //Default constructor must be named the same as the file name
    Constructor() {
        name = "Warrior";
        gender = 'M';
    }
    
    Constructor(String n, char g) {

        //this.object => class objects
        this.name = n; 
        this.gender = g;

    }
    
    //Constructor only test
    public static void main(String[] args) {
        
        //Predetermined values
        Constructor obj1 = new Constructor();

        //Set values
        Constructor obj2 = new Constructor("Ranger", 'F');

        System.out.println(obj1.name + " " + obj1.gender);
        
        System.out.println(obj2.name + " " + obj2.gender);
        

    }
}
