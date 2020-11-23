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


public class HW3v1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
  Scanner input = new Scanner(System.in);
    
  System.out.println("Enter a numerator for the first fraction: ");
  int num1 = input.nextInt();
  
  System.out.println("Enter the denominator for the first fraction: ");
  int den1 = input.nextInt();
  
  System.out.println("Result: " + num1 + "/" + den1);
  
  System.out.println("Enter a numerator for the second fraction: ");
  int num2 = input.nextInt();
  
  System.out.println("Enter the denominator for the second fraction: ");
  int den2 = input.nextInt();
  
  System.out.println("Result: " + num2 + "/" + den2);
  
  
  
  
  int add1, add2,  IFadd1, IFadd2, IFadd3, IFadd4;
  double IFR1, IFR2;
   int addR1;
//IFadd5 Reduces the same numerator and demonimator
                //IFadd1 = same den
                //IFadd2 = den1 * num2, numerator 2
                //IFadd3 = den2 * num1 numerator 1
                
  
  
  int IFadd5;
  int sub1, sub2; 
  int mx1, mx2;
  int div1, div2;

  
  
  System.out.println("Equation: "+ num1 + "/" + den1 + " &  " + num2 + "/" + den2);
  System.out.println("Choose which method to solve this equation: ");
          System.out.println("1. Add");
          System.out.println("2. Subtract");
          System.out.println("3. Multiply");
          System.out.println("4. Divide");
     int math = input.nextInt();
     
     
     
  switch(math) {
      case 1: add1 = num1 + num2;
                add2 = den1 + den2;
                
                
                
                
                
                
                
                //IFadd1 = same den
                //IFadd2 = den1 * num2, numerator 2
                //IFadd3 = den2 * num1 numerator 1
                
                    if (den1 != den2){
        IFadd1 = den1 * den2;
      IFadd2 = den1 * num2;
      IFadd3 = den2 * num1;
      IFadd4 = IFadd2 + IFadd3;
      
    /**  if(IFadd4 >= IFadd1)
      { 
       IFR1 =  IFadd4 / 2; 
       IFR2 = IFadd1 / 2;
      }
      */
      System.out.println("Addition Reuslts: " + num1 + "/" + den1 + " +  " + num2 + "/" + den2 + " = " + IFadd4 
                + " / " + IFadd1);
      
      if( IFadd4 >= IFadd1) {
          //IFadd5 Reduces the same numerator and demonimator
          IFadd5 = IFadd1 / IFadd4;
          
         System.out.println("The fraction: " + IFadd4 + "/" + IFadd1 + " can be reduced to: " + IFadd5);
          
      }
      
      
          
                    }
                   else     {     
                System.out.println("Results: " + num1 + "/" + den1 + " +  " + num2 + "/" + den2 + " = " + add1 
                + " / " + add2);            
                               
                addR1 = add1 * 2;

                if (add1 == add2) {     
               //addR1 checks if numerator can reduce with denominator
               
                if (add1 == addR1) {
                    int addRC1, addTemp1;
                    //RC1 will divide the denominator
                    
                    addTemp1 = add1 / add1;
                    addRC1 = add2 / add1;
                    add1 = addTemp1;
                    
                    
                    System.out.println("The Reduced fractopm will result in: " + add1 + "/" + addRC1);
                   
                    
                    
                }
                    
                   }
                    }
              
      
                    break;
                    
                    
      case 2: sub1 = num1 - num2;
      sub2 = den1 - den2;
      
      System.out.println("Subtraction: " + num1 + "/" + den1 + " +  " + num2 + "/" + den2 + " = " + sub1 
                + " / " + sub2);
  break;
      
      case 3: mx1 = num1 * num2;
      mx2 = den1 * den2;
      
      
      
      System.out.println("Multiplication: " + num1 + "/" + den1 + " +  " + num2 + "/" + den2 + " = " + mx1 
                + " / " + mx2);
  break;
  
      case 4: div1 = num1 / num2;
      div2 = den1 / den2;
      
      System.out.println("Division: " + num1 + "/" + den1 + " + " + num2 + "/" + den2 + " = " + div1 + "/" + div2);
      
  break;
  }
  
    
    
    
    }
  
    
}
