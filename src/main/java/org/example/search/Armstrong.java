/**
 * @author Admin01
 * @Date 9/21/2024
 */
package org.example.search;

public class Armstrong {

    public static void main(String[] args) {
        int num = 153;
        int digit = num % 10;
        //System.out.println("digit : "+digit);

        int numOfDigit = (int) Math.log10(num) + 1;
        //System.out.println("numOfDigit: "+num);

        System.out.println(isArmstrong(num));

    }

    private static boolean isArmstrong(int num){
        int numOfDigit = (int) Math.log10(num) + 1;

        int sumOfPowers = 0;

        while(num > 0){
            int digit = num % 10;
            sumOfPowers  += Math.pow(numOfDigit,digit);
            num /= 10;
        }

        return sumOfPowers == num;
    }
}
