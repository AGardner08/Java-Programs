public class CastTest02 {
    public static void main(String[] args) {
       
        //Implicit Casting from string to int 
        String s = "2.3";
    
    //Need to force x as an int
    double x = Double.parseDouble(s)+ 5;

    System.out.println(x);

    }
}
