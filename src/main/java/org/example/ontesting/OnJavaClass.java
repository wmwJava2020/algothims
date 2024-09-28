/**
 * @author Admin01
 * @Date 8/3/2024
 */
package org.example.ontesting;

import lombok.val;
import java.util.HashMap;
import java.util.Map;
public class OnJavaClass {
    public static void main(String[] args) {
        long fabionacci = fabionacci(8);
        //System.out.println(fabionacci);
        //System.out.println(reverseString("Wondafrash"));
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int target = 9;
        int[] ints = sumOfThreeIntegers(arr, target);
        for (int TARGETS : ints) {
            //System.out.println(TARGETS);
        }
        Map<Character, Integer> map = getFrequencyOfCharcters("WondafrasondafRASH");
        //System.out.println(map);

        //{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        int[] ARR = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        int TArGET = 10;
        int searched = searchBinaryValueOfInteger(ARR, TArGET);
        //System.out.println(searched);

        Map<Character, Integer> inString = getFrequencyOfCharctersInString("Wondafrashwonda");
        System.out.println(inString);

    }

    public static long fabionacci(long N) {
        if (N <= 1) {
            return N;
        } else {
            return (fabionacci(N - 1) + fabionacci(N - 2));
        }
    }

    public static String reverseString(String str) {
        String rev = " ";

        for (int i = 0; i < str.length(); i++) {
            rev = str.charAt(i) + rev;
        }

        return rev.toUpperCase();
    }

    public static int[] sumOfThreeIntegers(int[] arr, int tarGET) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    if (arr[i] + arr[j] + arr[k] == tarGET) {
                        return (new int[]{arr[i], arr[j], arr[k]});
                    }
                }
            }
        }
        return new int[]{};
    }

    public static Map<Character, Integer> getFrequencyOfCharcters(String str) {
        val lCase = str.toLowerCase();

        Map<Character, Integer> map = new HashMap<>();

        for (char nChar : lCase.toCharArray()) {
            if (!map.containsKey(nChar)) { // while mapping, if it doesn't contain newChars put itself plus 1;
                map.put(nChar, 1); // here newChars has no repeated elements or map is null;
            } else {
                int i = map.get(nChar); // need to have an element to update as I get new elements
                map.put(nChar, i + 1);
            }
        }
        return map;
    }

    public static int searchBinaryValueOfInteger(int[] arr, int TARGET) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {

            int indexValue = (low + high) / 2; // get middle position
            int numberToFind = arr[indexValue];
            System.out.println(numberToFind);

            if (numberToFind == TARGET) {
                return indexValue;
            }
            if (TARGET < numberToFind) {
                high = indexValue - 1; // search towards the left <------
            }
            if (TARGET > numberToFind) {
                low = indexValue + 1; // search towards the right ----->
            }

        }
        return -1;
    }

    public static Map<Character, Integer> getFrequencyOfCharctersInString(String str) {
        String str0 = str.toLowerCase();
        String str1 = str.toLowerCase();//local root

        Map<Character, Integer> map = new HashMap<>();

        for (char nChar : str.toCharArray()) { // count W and w differently, need to convert to lowercase
            if (!map.containsKey(nChar)) {
                map.put(nChar, +1);
            } else {
                int i = map.get(nChar);
                map.put(nChar, i + 1);
            }
        }
        return map;
    }
}