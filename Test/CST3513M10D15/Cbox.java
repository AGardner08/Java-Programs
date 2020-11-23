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
public class Cbox {
private double m_Length;  // Length of a box in inches
    private double m_Breadth; // Breadth of a box in inches
    private double m_Height;  // Height of a box in inches

    // Constructor definition

    public Cbox()
        
    {
       this(0, 0, 0);

          System.out.println("Inside Cbox()");

    }
    public Cbox(Cbox obj)
        
    {
        this (obj.m_Length, obj.m_Breadth, obj.m_Height);
          System.out.println("Inside Cbox(obj)");

    }

    public Cbox(double lv, double bv, double hv)
    {
          System.out.println("Inside Cbox(double,double,double)");
        
        m_Length = lv;  // Set values of
        m_Breadth = bv; // data members
        m_Height = hv;
    }

    // Function to calculate the volume of a box

    public double Volume()
    {
        return m_Length * m_Breadth * m_Height;
    }     
}
