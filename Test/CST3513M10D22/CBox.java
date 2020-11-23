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
public class CBox {
     public double m_Length;                       // Length of a box in inches
       public double m_Breadth;                      // Breadth of a box in inches
       public double m_Height;                       // Height of a box in inches

      // Constructor definition

      CBox(double lv , double bv , double hv )
       {
         System.out.println("Constructor called.");
         m_Length = lv;                      // Set values of
         m_Breadth = bv;                     // data members
         m_Height = hv;
       }

      // Function to calculate the volume of a box

     public double Volume()
      {
         return m_Length*m_Breadth*m_Height;
      }
}
