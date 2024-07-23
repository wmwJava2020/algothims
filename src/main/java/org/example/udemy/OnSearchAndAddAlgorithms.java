/**
 * @author Wondafrash
 * @Date 7/20/2024
 */
package org.example.udemy;

import java.util.ArrayList;
import java.util.List;

public class OnSearchAndAddAlgorithms {
    public static void main(String[] args) {
        int[] Rx = {1, 3, 5, 7, 9, 11, 13};
        int t = 11;
        int it = searchBinaryValues(Rx, t);
        //System.out.println(it);

        int[] arr = {12, 19, 27, 31, 34, 39, 41, 47, 49, 60, 54, 56, 63, 72, 76, 78, 90, 99};
        int target = 76;

        int r = binarySearchAlgorithm(arr, target);
        //System.out.println(r);
        long N = 13;
        for (int i = 0; i < N; i++) {
            //System.out.print(getFabinocciValue(i));
            //System.out.print(" ");
        }
        String str = "icanDoThatTutorialsNow";
        char[] reversed = getStringReversed(str);

        int[] TEST = {1, 3, 5, 7, 9, 11, 13};
        int INT = 8;
        List<Integer[]> sum = getSumOfTwoIntegers(TEST, INT);
        for(Integer[] ARR : sum){
            for(int TTS : ARR){
                System.out.print(TTS +"  ");
            }
            System.out.print(" ");
        }

    }

    private static int searchBinaryValues(int[] arr, int GIVEN) {

        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {

            int index = (low + high) / 2;
            int number = arr[index];

            if (GIVEN == number) {
                return index;
            }
            if (GIVEN < number) {
                high = index - 1;
            }
            if (GIVEN > number) {
                low = index + 1;
            }
        }

        return -1;
    }

    private static int binarySearchAlgorithm(int[] arr, int TARGET) {

        //int[] arr = {12,19,27,31,34,39,41,47,[49],60,54,56,63,72,76,78,90,99};
        int tarGet = 76;

        int low = 0;  // lower limit or boundaries
        int high = arr.length - 1; // upper limit boundaries

        while (low <= high) {

            //get index middle postions
            int index = (low + high) / 2;

            // get the number correspondence to index
            int number = arr[index];

            if (TARGET == number) {
                return index;
            }
            if (TARGET < number) { // target number is greater than middle index value to search to the ---right-->
                high = index - 1;
            }
            if (TARGET > number) { //target is less than middle index value so search towards the left < --- left---
                low = index + 1;
            }
        }
        return -1;

    }

    private static long getFabinocciValue(long n) {
        // set a base value
        if (n <= 1) {
            return n;
        }
        return (getFabinocciValue(n - 1) + getFabinocciValue(n - 2));

    }

    private static char[] getStringReversed(String s) {
        //String str = "IcanDoThat";
        char[] arr = s.toCharArray();

        String str0 = "";

        for (int i = arr.length - 1; i >= 0; i--) {
            //System.out.print(arr[i]);
            //System.out.print(" ");
        }
        return arr;
    }

    private static List<Integer[]> getSumOfTwoIntegers(int[] arr, int N){
        List<Integer[]> list = new ArrayList<>();

        for(int x = 0; x < arr.length; x++){
            for(int y = x + 1; y < arr.length; y++){
                if(arr[x] + arr[y] == N){
                    list.add(new Integer[]{arr[x],arr[y]});
                }
            }
        }
        return list;
    }
}
