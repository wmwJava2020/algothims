/**
 * @author Wondafrash
 * @Date 7/23/2024
 */
package org.example.stream;

import java.util.Arrays;

public class OnStream {

    public static void main(String[] args) {

        //countWordsInString("We can Do That");
        //String reveres = reveresString("Wondafrash");
        //System.out.print(reveres);
        //convertStringToArray("Wondu");
        //findFirstNonUniqueCharcter("WWoNdDDaon");
        //replaceSpecialCharcter("$j#a*v@a&c!o(d%e");
        //removeWhiteSpaceFromString("       Wo Daf Ras H  ");
        //removeDuplicateCharcter("wondafrashwon");
        //sortStringAlphabeticalOrder("facebook");
        sortStringUsingArrays("facebo");

    }

    private static void countWordsInString(String string) {
        int cntWord = string.split("\\s").length;
        System.out.println(cntWord);
    }

    private static String reveresString(String str) {
        String reveresedString = "";
        for (int i = 0; i < str.length(); i++) {
            reveresedString = str.charAt(i) + reveresedString;
            //System.out.println(reveresedString);
        }
        return reveresedString;
    }

    private static void convertStringToArray(String str) {
        char[] myChar = str.toCharArray();
        System.out.println(myChar[0]);

    }

    private static void findFirstNonUniqueCharcters(String str) {
        for (int i = 0; i < str.length(); i++) {//outer-loop to travers in given input not checking the next non-repeated
            boolean unique = true;
            for (int j = 0; j < str.length(); j++) {//inner-loop used for comparison

                // if i != j get the first character and compare it with the second character
                if (i != j && str.charAt(i) == str.charAt(j)) {
                    unique = false; //character is repeated
                    break; //used to break the inner-loop if upper conditions are meet
                }
            }
            if (unique) { // i.e., the character is not repeated
                System.out.println(str.charAt(i));
                break; //used to come out of outer-loop, not checking the next non-repeated
            }
        }
    }

    private static void replaceSpecialCharcters(String str) {
        String s = str.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(s);
    }

    private static void removeWhiteSpaceFromString(String str) {
        //String trimmed = str.trim(); // trim() used for the first and the last black-space from the string
        String trimmed = str.replaceAll("\\s", "").toLowerCase();
        System.out.println(trimmed);
    }

    private static void removeDuplicateCharcter(String str) {
        StringBuilder sb = new StringBuilder();
        str.chars().distinct().forEach(e -> sb.append((char) e));
        System.out.println(sb);
    }

    private static void sortStringAlphabeticalOrder(String str) {
        // make a string to char array
        char[] charArr = str.toCharArray();
        char temp = 0;
        for (int i = 0; i < charArr.length; i++) {
            for (int j = i + 1; j < charArr.length; j++) {
                if (charArr[i] > charArr[j]) { // facebook --> arr[i] =f, arr[j]=a
                    temp = charArr[i]; // store char at index = i into temp variable here SWAPPED, comprising is based ASCII value of the character
                    charArr[i] = charArr[j]; // replace the small position with the highest, i > j
                    charArr[j] = temp;
                }
            }
        }
        System.out.println(new String(charArr));
    }

    private static void sortStringUsingArrays(String str){
        char[] charArrays = str.toCharArray();
         Arrays.sort(charArrays);
        System.out.println(charArrays);
    }
}
