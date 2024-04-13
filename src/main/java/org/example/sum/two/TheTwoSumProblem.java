package org.example.sum.two;

import java.util.Scanner;

public class TheTwoSumProblem {
    // The Two Sum problem involves finding two numbers in an array that add up to a given target number.
    //      Input: numbs = [5, 2, 3], target = 8 Output: [0, 2]
    //      index value of 0 and index value of 2 could sum up to target 8;
    // We need to know which combination of the two index could be added to get target value
    // To solve this problem, we can split this into two steps:
    //      1.) Iterate over every possible pair of numbers
    //      2.) Check if a given pair sums up to our target.

    static int[] getIndexOfGivenNumbers(int[] num, int target) {

        for (int i = 0; i < num.length; i++) {
            // we should skip (j= i+1) the first number,not to add to itself
            for (int j = i + 1; j < num.length; j++) {
                if (num[i] + num[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return num;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter value to evaluate........");
        int x = scan.nextInt();
        int num[] = new int[x];

        for(int i = 0; i < x; i++){
            num[i] = scan.nextInt();
        }
        System.out.println("Enter target number........");
        int target = scan.nextInt();

        scan.close();
        //int num[] = {2,6,8,9,4,0};
        //int target = 13;
        int[] indexes = getIndexOfGivenNumbers(num, target);

        if(indexes.length == 2){
            System.out.println(indexes[0] + ":"+indexes[1]);
        }else {
            System.out.println("Value not found......");
        }
    }
}
