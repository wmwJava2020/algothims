/**
 * @author Admin01
 * @Date 10/8/2024
 */
package org.example.stream;

import java.util.Arrays;

public class OnGeneralConding {
    public static void main(String[] args) {
        //findFirstNonUniqueCharcter("WWoNdDDaonN");
        //replaceSpecialCharcters("$j#a*v@a&c!o(d%e");
        //int []arrs = {2,3,4,5,6,7,8,9,10};
        //int TARGETS = 5;
        //sortArraysBasedOnTargets(arrs,TARGETS);
        int []SUMs = {1,2,3,4,5,6};
        givenSumOfArrayFindItsSum(SUMs);
    }

    private static void findFirstNonUniqueCharcter(String input){
        for(int i = 0 ; i < input.length(); i++ ){
            boolean unique = true;
            for(int j = 0 ; j < input.length(); j++){
                if(i!=j && input.charAt(i)== input.charAt(j)){
                    unique = false;
                    break;
                }
            }
            if(unique){
                System.out.print(input.charAt(i));
                break;
            }
        }
    }

    private static void replaceSpecialCharcters(String str) {
        String s = str.replaceAll("[^a-zA-Z0-9]", "");
        System.out.print(s + " ");
    }

    private static void sortArraysBasedOnTargets(int[] arr, int targets){
        int []arrs = {2,3,4,5,6,7,8,9,10};
        int TARGETS = 5;
        int binarySearch = Arrays.binarySearch(arrs, TARGETS);
        System.out.println(binarySearch);
    }

    private static void givenSumOfArrayFindItsSum(int[] arr){

        int sum = 0;
        for(int i = 0; i < arr.length;i++){
            sum +=  arr[i];
        }
        System.out.println("Array sum is : " + sum);
    }

}
