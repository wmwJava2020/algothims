package org.stream.api.algorithm;

public class SumOfTwoIntegers {
    static int[] getSumOfIntegers(int[] arr, int target){
        for(int i = 0; i < arr.length;i++ ){
            for(int j = i+1; j < arr.length; j++){
                if(arr[i] + arr[j] == target){
                    return new int[]{i,j};
                }

            }
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        int[] arr= {4,6,7,9,0,1,9,7,42,33,5,66,76,56,12,34,56,999,5};
        int target = 1000;
        int[] sum = getSumOfIntegers(arr, target);
        for(int i : sum){
            System.out.println(i);
        }
    }


}
