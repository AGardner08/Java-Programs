public class MathTest01 {
   
    public static void main(String[] args) {
        
        //Using the ceil command that gets the >= Closest whole Number
        double result = Math.ceil(2.3F);

        //Force a decimal to an int
        int ans = (int) Math.ceil(3.4);

        System.out.println("Without force int: " + result);

        //Forcing a decimal to int takes out the x.0
        System.out.println("With Force int: " + ans);


        //Using the floor command to get the <= Closest whole number
        int low = (int) Math.floor(5.3F);

        System.out.println("Floor Command: " + low);





    }
}
