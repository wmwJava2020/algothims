/**
 * @author Admin01
 * @Date 9/21/2024
 */
package org.example.leet;

public class Armstrong {
    public static void main(String[] args) {
        System.out.println(isArmstrongNumber(153));
    }
    private static boolean isArmstrongNumber(int number) {
        int originalNumber = number;

        int sumOfPowers = 0;
        int numberOfDigits = (int) Math.log10(number) + 1;

        while (number > 0) {
            int digit = number % 10;
            sumOfPowers += Math.pow(digit, numberOfDigits);
            number /= 10;
        }

        return sumOfPowers == originalNumber;
    }
}
