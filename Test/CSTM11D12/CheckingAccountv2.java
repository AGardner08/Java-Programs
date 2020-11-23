/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CSTM11D12;




/**
 *
 * @author class
 */
public class CheckingAccountv2 extends BankAccountv1 {
     public CheckingAccountv2( )
   {
       super( ); // optional, call BankAccount constructor
       System.out.println( "In CheckingAccount "
                            + "default constructor" );
   }

   /** overloaded constructor
   *   calls BankAccount overloaded constructor
   *   @param  startBalance  starting balance
   */
   public CheckingAccountv2( double startBalance )
   {
       super( startBalance ); // call BankAccount constructor
       System.out.println( "In CheckingAccount "
                           + "overloaded constructor" );
   }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   
    
    
    // use default constructor
     CheckingAccountv2 c1 = new CheckingAccountv2( );
     System.out.println( "New checking account: " + c1 + "\n" );

     // use overloaded constructor
     CheckingAccountv2 c2 = new CheckingAccountv2( 100.00 );
     System.out.println( "New checking account: " + c2 );
    }
    
}
