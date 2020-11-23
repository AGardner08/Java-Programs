/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CSTM11D19;

/**
 *
 * @author andrew.gardner67
 */


public class X{ 
int a;
X(int i){a = i;}
public class Y extends X {
int b;
Y (int i, int j){ super(j);
b=i;
	}
}
}