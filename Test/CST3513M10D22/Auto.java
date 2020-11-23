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

public class Auto
{
    // instance variables

    private String model;          //  model of auto
    private int milesDriven;       //  number of miles driven
    private double gallonsOfGas;   //  number of gallons of gas

    // Default constructor:
    //  initializes model to "unknown";
    //  milesDriven is auto-initialized to 0
    //        and gallonsOfGas to 0.0

    public Auto( )
    {
       model = "unknown";
    }

    // Overloaded constructor:
    // allows client to set beginning values for
    //   model, milesDriven, and gallonsOfGas.

    public Auto( String startModel,
                 int startMilesDriven,
                 double startGallonsOfGas )
    {
       model = startModel;

       // validate startMiles parameter

       if ( startMilesDriven >= 0 )
           milesDriven = startMilesDriven;
       else
       {
           System.err.println( "Miles driven is negative." );
           System.err.println( "Value set to 0." );
       }

       // validate startGallonsOfGas parameter

       if ( startGallonsOfGas >= 0.0 )
           gallonsOfGas = startGallonsOfGas;
       else
       {
           System.err.println( "Gallons of gas is negative" );
           System.err.println( "Value set to 0.0." );
       }
    }

    String getModel() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    double getGallonsOfGas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    int getMilesDriven() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}