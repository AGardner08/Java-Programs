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

public class newAutov2
{
    public static void main( String [] args )
    {
        Auto sedan = new Auto( );
        String sedanModel = sedan.getModel( );
        int sedanMiles = sedan.getMilesDriven( );
        double sedanGallons = sedan.getGallonsOfGas( );
        System.out.println( "sedan: model is " + sedanModel
                   + "\n miles driven is " + sedanMiles
                   + "\n gallons of gas is " + sedanGallons );

        Auto suv = new Auto( "Trailblazer", 7000, 437.5 );
        String suvModel = suv.getModel( );
        int suvMiles = suv.getMilesDriven( );
        double suvGallons = suv.getGallonsOfGas( );
        System.out.println( "suv: model is " + suvModel
                   + "\n miles driven is " + suvMiles
                   + "\n gallons of gas is " + suvGallons );
    }
}