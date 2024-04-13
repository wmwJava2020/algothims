package org.example.sum.two;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;

class TwoSum {

    // Time complexity: O(n^2)
    private static int[] findTwoSum_BruteForce(int[] num, int target) {
        for (int i = 0; i < num.length; i++) {
            for (int j = i + 1; j < num.length; j++) {
                if (num[i] + num[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        return num;
    }


    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int n = keyboard.nextInt();
        int[] nums = new int[n];

        for(int i = 0; i < n; i++) {
            nums[i] = keyboard.nextInt();
        }
        int target = keyboard.nextInt();

        keyboard.close();

        int[] indices = findTwoSum_BruteForce(nums, target);

        if (indices.length == 4) {
            System.out.println(indices[0] + " " + indices[1]);
        } else {
            System.out.println("No solution found!");
        }
    }
}
