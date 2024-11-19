/**
 * @author Wondafrash
 * @Date 11/19/2024
 */
package org.example.hackerrank;

import java.util.ArrayList;
import java.util.List;

public class GeneralCondings {
    public static void main(String[] args) {
        int[] arr ={3,5,7,8,9};
        //givenSumOfIntegerArrayFindTheSumOfArrays(arr);

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        givenListOfIntegerFindTheSumOfArrays(list);
    }

    private static void givenSumOfIntegerArrayFindTheSumOfArrays(int[] arr){
        int sum = 0;

        for(int i =0; i < arr.length;i++){
            sum += arr[i];
        }
        System.out.println("The Sum Array : " + sum);
    }

    private static void givenListOfIntegerFindTheSumOfArrays(List<Integer> list){
        Integer[] arr = list.toArray(new Integer[0]);
        int add = 0;
        for(int i = 0; i < arr.length;i++){
            add += arr[i];
        }
        System.out.println("add is : " + add);
    }

}
