/**
 * @author Wondafrash
 * @Date 7/23/2024
 */
package org.example.udemy;

import java.util.*;

public class OnAlgorithmClass {
    public static void main(String[] args) {
        reverseString("Wondafrash");
        //System.out.println("------------");
        long N = 8;
        //System.out.print(fabinacciTest(N));
        //System.out.println("------------");
        String s = getReveresedString("Wondafrash");
        //System.out.print(s + " ");
        //System.out.println("------------");
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int target = 12;
        int[] sum = getSumOfTwoIntegers(arr, target);
        for (int IN : sum) {
            //System.out.println(IN);
        }

        int[] aRR = {1, 2, -3, 4, 5, -6, 7, 8, 9, 10, 11, 12, 13, 14, 15, -6, 17, -18, 40};
        int TARGET = 31;
        List<Integer[]> add = getSumOfThreeIntegers(aRR, TARGET);
        for (Integer[] ls : add) {
            for (int INT : ls) {
                //System.out.print(INT);
                //System.out.print(" ");
            }
        }

        String str0 = "ShwFrdafrashWWon";
        Map<Character, Integer> usingMap = getStringFrequencyUsingMap(str0);
        //System.out.println(usingMap);

        Map<Character,Integer> useMap = getStringFrequencyUseMap(str0);
        System.out.println(useMap);

    }

    //String reversed
    private static void reverseString(String string) {
        char[] chars = string.toCharArray();

        for (int i = chars.length - 1; i >= 0; i--) {
            //System.out.print(chars[i] + " ");
        }
    }

    private static long fabinacciTest(long N) {
        if (N <= 1) {
            return N;
        } else {
            return (fabinacciTest(N - 1) + fabinacciTest(N - 2));
        }
    }

    private static String getReveresedString(String str) {
        StringBuilder sb = new StringBuilder(str);
        StringBuilder reverse = sb.reverse();
        return reverse.toString();
    }

    private static int[] getSumOfTwoIntegers(int[] arr, int tarGET) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == tarGET) {
                    return new int[]{arr[i], arr[j]};
                }
            }
        }
        return arr;
    }

    private static List<Integer[]> getSumOfThreeIntegers(int[] arr, int GIVEN) {

        List<Integer[]> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    if (arr[i] + arr[j] + arr[k] == GIVEN) {
                        list.add(new Integer[]{arr[i], arr[j], arr[k]});
                    }
                }
            }
        }
        return list;
    }

    private static Map<Character,Integer> getStringFrequencyUsingMap(String str){

        //get to char format and lower-case if upper-case exist
        String s1 = str.toLowerCase();

        Map<Character,Integer> map = new HashMap<Character,Integer>();

        for(char c : s1.toCharArray()){
            //map.merge(c, 1, Integer::sum);
            if(map.get(c) == null){ // if key is null
             map.put(c, 1); // put key, plus-value
            }else{ //if key is present,
                map.put(c, map.get(c)+1); //increment the value
            }

        }
        map.forEach((key,value)->{ // to print key - value pair format we can use forLoop
            //System.out.println("key= " +key +" : "+" value= "+value);
        });

        return map;
    }

    private static Map<Character,Integer> getStringFrequencyUseMap(String s){

        String str = s.toLowerCase(); // to check if upper-case charcters exist in input String

        Map<Character,Integer> map0 = new HashMap<Character,Integer>(); //use hashMap impl to store my data

        for(char ch : str.toCharArray()){
            //scenario 1- if [ch] value is null
            if(!map0.containsKey(ch)) { // ch key is NULL
                    map0.put(ch,1);  //  put the character and 1,
            }else{
                int i = map0.get(ch); // if key is NOT-NULL
                map0.put(ch,i + 1);  //  get key and increment it by 1 and put together
                //map0.put(ch, map0.get(ch) +1);
            }
        }
        return map0;
    }

}
