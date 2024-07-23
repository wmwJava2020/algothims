/**
 * @author Admin01
 * @Date 7/20/2024
 */
package org.example.search;
public class OnBinarySearch {
    public static void main(String[] args) {
        int[] num = {10, 16, 24, 34, 46, 88, 110, 212, 214, 316, 420, 522};
        int algorithm = searchBinaryAlgorithm(num, 34);
        System.out.println(algorithm);

        int[] num0 = {2,3,6,8,9,13,20};
        int search = searchOnBinaryAlgorithm(num0, 6);
        System.out.println(search);

    }
    public static int searchBinaryAlgorithm(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {

            int middleIndex = (low + high) / 2;
            int middleIndexNumber = arr[middleIndex];

            if (target == middleIndexNumber) {
                return middleIndex;
            } else if (target < middleIndexNumber) {
                high = middleIndex - 1; // to the left the number is lower that the middle number
            } else {
                low = middleIndex + 1; // to right the number is higher that the middle number
            }
        }
        return -1;
    }

    public static int searchOnBinaryAlgorithm(int[] input, int GIVEN) {

        int min = 0; // find the lowest value
        int max = input.length - 1; // find the highest value

        while (min <= max) {

            int middleP = (min + max) / 2;
            int middleN= input[middleP];

            if (GIVEN == middleN) {
                return middleP; // here we are returning the index of the number we are searching for.....
            }
            if (GIVEN < middleN) { // if the number is lower than target look to the left of given number
                max = middleP - 1; // reduce to the pointer or index to find the number
            }
            if(GIVEN > middleN){ // but if the number is higher than target look to the right of a given number
                min = middleP + 1; // add to the pointer or index to find the number
            }
        }
        return -1;
    }


}
