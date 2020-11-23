/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CST3513M9D3;

/**
 *
 * @author class
 */
public class Array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   
          
        int[] numbers = {5, 10, 15, 20, 25, 30, 35, 40};
          
          //int[] numbers = {10, 5, 15, 20, 25, 30, 35, 40};
          
      for (int index = 0; index < numbers.length; index++)
         showValue(numbers[index]);
    }


   public static void showValue(int n)
   {
      System.out.print(n + " ");
    }
    
}
