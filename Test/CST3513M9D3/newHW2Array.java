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
public class newHW2Array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //new HW2Array();
        
    }
           public double[] newHW2Array (double[] list){
 double[] sort = {21, 13, 17, 5, 3};

int var1= 0;
int var2 = 0;
int temp = 0;

for (var1 = 0; var1 < list.length - 1; var1++){
    for (var2 = 0; var2 < list.length -1-var1; var2++) {
        if (list[var2] > list[var2 + 1]) {
            temp = (int) list[var2];
            list[var2] = list[var2 + 1];
            list[var2 + 1] = temp;
            
            
            
        }
    }
}
return list;
        
        
    }
    
}
