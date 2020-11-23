/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CST3513M10D15;

/**
 *
 * @author class
 */
public class Illustrate4 {



    private int x;
    private static int y;
    public static int count;

       //Default constructor
       //Postcondition: x = 0
    public Illustrate4()
    {
        x = 0;
    }

       //Constructor with parameters
       //Postcondition: x = a
    public Illustrate4(int a)
    {
         x = a;
    }

        //Method to set x.
        //Postcondition: x = a
    void setX(int a)
    {
        x = a;
    }

        //Method to return the values of the instance
        //and static variables as a string.
        //The string returned is used by the methods
        //print, println, or printf, to print the values
        //of the instance and static variables.
        //Postcondition: The values of x, y, and count
        //are returned as a string.
    public String toString()
    {
        return("x = " + x + ", y = " + y
             + ", count = " + count);
    }

       //Method to increment the value of the private
       //static member y.
       //Postcondition: y is incremented by 1.
    public static void incrementY()
    {
        y++;
    }    
}
