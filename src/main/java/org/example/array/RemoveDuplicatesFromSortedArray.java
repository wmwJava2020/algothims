package org.stream.api.algorithm;

// Since array is sorted we expect the duplicate to be next to each other 2,4,4,5,6,7,7,8,9,10,
// keep looking for the next distinct element.
// we need 2 pointers where 1 is pointed to the first array and the 2 is iterating...through the array

import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray {
    private static int removeDuplicateFromGivenArrays(int[] arr) {
        int i = 0;
        for(int j = 0; j < arr.length;j++){
            if(arr[i]!= arr[j]){
                arr[++i] = arr[j];
            }
        }
        return i+1;
    }

    public static void main(String[] args) {
        int[] arr = new int[] { 1, 1, 1, 3, 5, 5, 7 };
        int rm = removeDuplicateFromGivenArrays(arr);
        for(int k = 0; k < rm;k++){
            System.out.println(arr[k]);
        }
    }
}
//GivenIntegersArrayFindTripletsToTarget