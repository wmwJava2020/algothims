/**
 * @author Admin01
 * @Date 9/19/2024
 */
package org.example.sum.arm;

import org.example.string.OnStringCoding;

public class Armstrong {

    public static void main(String[] args) {

        Armstrong ob = new Armstrong();
        int x = 371;
        //boolean armStrong = code.isArmStrong(x);
        System.out.println(ob.isArmStrong(x));
        int y = 153;
        //boolean armStrong1 = code.isArmStrong(y);
        System.out.println(ob.isArmStrong(y));
    }

    int power(int x, long y){ // Function to calculate x raised to the power y
        if(y == 0)
            return 1;
        if(y % 2 == 0)
            return power(x, y / 2) * power(x,y / 2);
        return x * power(x, y / 2) * power(x, y / 2);
    }

    int order(int x){ // Function to calculate order of the number
        int n = 0;
        while(x != 0){
            n++;
            x = x / 10;
        }
        return n;
    }

    boolean isArmStrong(int x){ // Function to check if the given number is Armstrong number or not

        int n = order(x);
        int temp = x;
        int sum = 0;

        while(temp != 0){
            int r = temp % 10;
            sum = sum + power(n, r);
            temp = temp / 10;
        }
        return (sum == x);
    }
}
