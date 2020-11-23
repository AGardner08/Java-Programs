/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CST3513M9D3;

/**
 *
 * @author Andrew
 */
public class HW2Arrayv2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        int[] numbers = {21, 13, 17, 5, 3};
          
          //int[] numbers = {10, 5, 15, 20, 25, 30, 35, 40};
          int temp;
      for (int index = 0; index < numbers.length; index++){
         showValue(numbers[index]);
         for (int vex = 0; vex < numbers.length - 1 - index; vex++) {
       if (numbers[vex] > numbers[vex + 1]){
           temp = numbers[vex];
           numbers[vex] = numbers[vex + 1];
           numbers[vex + 1] = temp;
            // showValue(numbers[index]);

       }
             
             
         }
      }
      }


   public static void showValue(int n)
   {
      System.out.print(n + " ");
    }
    
    
    
   
}
