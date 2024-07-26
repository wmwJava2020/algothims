/**
 * Created by:AIDA
 * Date : 7/22/2024
 * Time : 1:17 PM
 */
package org.example.search;

import java.util.ArrayList;
import java.util.List;

public class OnAlgorithms {

    public static void main(String[] args) {
        int[] num = {2, 4, 6, 8, 9, 10, 13, 15, 17, 19};
        int numbers = getTargetIndexNumber(num, 17);
        System.out.println(numbers);

        Integer[] num0 = {2, 4, 6, 8, 9, 10, 13, 15, 17, 19};
        int TARGET = 12;
        //List<Integer[]> addTen = getTheSumOfTwoNumbers(num0, target);


    }

    private static int getTargetIndexNumber(int[] num, int target) {
        // int[] num ={2,4,6,8,9,10,13,15,17,19}

        int low = 0;
        int high = num.length - 1;

        while (low <= high) {

            int index = (low + high) / 2; // we got the middle index
            int number = num[index];  // if we got the pointer by default, we got the number

            if (target == number) {
                return index;
            } else if (target < number) {
                high = index - 1;
            } else {
                low = index + 1;
            }

        }
        return -1;
    }

    private static int getTheSumOfTwoNumbers(Integer[] arr, int GIVEN) {

        List<Integer[]> ls = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == GIVEN) {
                    ls.add(new Integer[]{arr[i], arr[j]});
                }
            }
        }

        return GIVEN;
    }
}
