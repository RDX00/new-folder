
package com.equation;


public class IntegerEquation {
     public static void main(String[] args) {
        int A=13;
        int B=19;
        int C=21;
        int D=17;
        
        int result1= (A * B - C * D);
        int result2= (2*A - B + 3*D);
        int result3= (A*2 + B*2 - C*2 + D*2);
        int result4= (A*3 + B - C*2);
        
        System.out.println("Result :" +result1);
        System.out.println("Result :" +result2);
        System.out.println("Result :" +result3);
        System.out.println("Result :" +result4);
    }
}
