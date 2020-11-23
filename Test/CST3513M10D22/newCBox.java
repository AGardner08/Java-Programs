/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CST3513M10D22;

/**
 *
 * @author class
 */
import java.util.Scanner;


public class newCBox
{
   public static void main(String[] args)
   {
      // Create a CBOX object, passing three
      //  arguments to the constructor.

         CBox box2  = new CBox(2.2,1.1,0.5);

       System.out.println();
// display object Box2's's values

       // System.out.println("Volume of the box2=" + box2.Volume());

        System.out.printf("Volume of the box2 is %.2f\n" , box2.Volume());

          box2.m_Length = 4.2;                     // Set values of
          box2.m_Breadth = 2.5;                     // data members
          box2.m_Height = 1.5;

        System.out.printf("Volume of the box2 is %.2f\n" , box2.Volume());
        System.out.println();

    }

   }