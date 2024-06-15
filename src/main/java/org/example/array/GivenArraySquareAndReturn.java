package org.stream.api.algorithm;

import java.util.Arrays;

public class GivenArraySquareAndReturn {
    // simple approach is to square the array and then sort it to get the final array

    static void squareGivenArrayReturn(int arr[]){
        int n = arr.length;

        for(int i = 0; i < n; i++)
           arr[i] = arr[i] * arr[i];
            Arrays.sort(arr);
            Arrays.asList(arr);
    }

    public static void main(String[] args) {
        int arr[] = {-6,-4,-2,0,1,3,5 };
        int n = arr.length;

        squareGivenArrayReturn(arr);
        for(int i = 0; i < n; i++){
            System.out.println(arr[i]);
        }
    }
}
