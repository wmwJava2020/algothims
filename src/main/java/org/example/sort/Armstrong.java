/**
 * @author Admin01
 * @Date 9/21/2024
 */
package org.example.sort;

import java.math.MathContext;

public class Armstrong {
    public static void main(String[] args) {
        System.out.println(isArmstrongNumber(1634));
        int dD = (int) (Math.log10(153) + 1);
        System.out.println("numberOfDigits : "+dD);
        int x = 153;
        int digit0 = x % 10;
        System.out.println("digit : "+digit0);

        //Math.pow(r1,2)  --> Returns the value of the 1st arg raised to the power of the 2nd arg.
        //Math.log10(x) + 1 -- > Returns the correctly rounded positive square root of a double value.(numberOfDigits)
    }

    private static boolean isArmstrongNumber(int num) {
        int input = num;          // input number =153
        int sumOfPowers = 0; //  e.g. : sum of power of( 1^ + 5^ + 3^) = 1 + 125 + 27
        int numberOfDigits = (int) Math.log10(num) + 1; // count of digits in order 153 = 3

        while (num > 0) {             // while input is > 0
            int digit = num % 10;    //
            sumOfPowers += Math.pow(digit, numberOfDigits); // a(digit)->the base (pow) b(numberOfDigits)->the exponent
            //sumOfPowers = (int) (sumOfPowers + Math.pow(digit, numberOfDigits));
            num /= 10;
        }

        return sumOfPowers == input;
    }

    private static boolean checkIfArmstrongNumberOrNot(int num){

        int input = num;
        int sumOfPowers = 0;
        int cntOfDigits = (int) (Math.log10(num) + 1);

        while (num > 0){
            int digit = num % 10;
            sumOfPowers += Math.pow(digit,cntOfDigits);
            num /= 10;
        }

        return sumOfPowers == input;
    }
}
