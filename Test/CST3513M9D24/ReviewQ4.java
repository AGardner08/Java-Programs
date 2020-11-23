/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CST3513M9D24;

/**
 *
 * @author andrew.gardner67
 */


import java.util.Scanner;

public class ReviewQ4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        int i = 1;
        while (i <= 6 ) {
            method1 ( i,2) ;
            i++;
        }
    }
    public static void method1 (int i, int num) {
        for (int j=1; j<=i;j++) {
        System.out.println(num + " ");
        num *=2;
        
       
    }
    
    System.out.println();
    
    
    
    
    
    
    }
    
}
