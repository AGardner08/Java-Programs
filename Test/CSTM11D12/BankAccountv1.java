/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CSTM11D12;

import java.text.DecimalFormat;





/**
 *
 * @author class
 */
public class BankAccountv1 {
    public final DecimalFormat MONEY
                  = new DecimalFormat( "$#,##0.00" );
  private double balance;

  /** Default constructor
  *   sets balance to 0.0
  */
  public BankAccountv1( )
  {
    balance = 0.0;
  }

  /** Overloaded constructor
  *   @param startBalance  beginning balance
  */
  public BankAccountv1( double startBalance )
  {
    deposit( startBalance );
  }

  /** Accessor for balance
  *   @return  current account balance
  */
  public double getBalance( )
  {
    return balance;
  }

  /** Deposit amount to account
  *   @param amount  amount to deposit;
  *                  amount must be >= 0.0
  */
  public void deposit( double amount )
  {
    if ( amount >= 0.0 )
      balance += amount;
    else
      System.err.println( "Deposit amount must be positive." );
  }

  /** withdraw amount from account
  *    @param amount   amount to withdraw;
  *                    amount must be >= 0.0
  *                    amount must be <= balance
  */
  public void withdraw( double amount )
  {
    if (  amount >= 0.0 && amount <= balance )
      balance -= amount;
    else
      System.err.println( "Withdrawal amount must be positive "
                          + "and cannot be greater than balance" );
  }

  /** toString
  *  @return  the balance formatted as money
  */
  public String toString( )
  {
    return ( "balance is " + MONEY.format( balance ) );
  }
}
