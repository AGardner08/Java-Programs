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
public class ScannerClass {

    /**
     * @param args the command line arguments
     */
 //   public static void main(String[] args) {
        // TODO code application logic here
   
    
    //static Scanner console = new Scanner(System.in);
 
    public static void main(String[] args)  {
       Time2 t1 = new Time2(); 
      Time2 t2 = new Time2( 2 ); 
      Time2 t3 = new Time2( 21, 34 ); 
      Time2 t4 = new Time2( 12, 25, 42 ); 
      Time2 t5 = new Time2( 27, 74, 99 ); 
    

      System.out.println( "Constructed with:" );
      System.out.println( "t1: all arguments defaulted" );
      System.out.printf( "   %s\n", t1.toUniversalString() );
      System.out.printf( "   %s\n", t1.toString() );

      System.out.println( 
         "t2: hour specified; minute and second defaulted" );
      System.out.printf( "   %s\n", t2.toUniversalString() );
      System.out.printf( "   %s\n", t2.toString() );

      System.out.println( 
         "t3: hour and minute specified; second defaulted" );
      System.out.printf( "   %s\n", t3.toUniversalString() );
      System.out.printf( "   %s\n", t3.toString() );

      System.out.println( "t4: hour, minute and second specified" );
      System.out.printf( "   %s\n", t4.toUniversalString() );
      System.out.printf( "   %s\n", t4.toString() );

      System.out.println( "t5: all invalid values specified" );
      System.out.printf( "   %s\n", t5.toUniversalString() );
      System.out.printf( "   %s\n", t5.toString() );

    }
}
    
    

