/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CST3513M9D10;

/**
 *
 * @author Andrew
 */
import java.util.Scanner;

public class GradeBookTest {

// main method brgins program execution

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        // create a GradeBook object and assign it to mygradebook
        GradeBook myGradeBook= new GradeBook();
        // display initial value of courseName
        System.out.printf("initial course name is:%s\n\n",
                 myGradeBook.getCourseName());
        // prompt for and read course name
        
       System.out.print("please enter the course name:");
       String theName=input.nextLine();// read a line of text
       myGradeBook.setCourseName(theName);//set the course name
        System.out.println();// outputs a blank line
        
        // display welcome message after specifying course name
        myGradeBook.displayMessage();
    } // end main  
     
    }// end GradeBookTest