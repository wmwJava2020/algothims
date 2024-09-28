/**
 * Created by:Wondafrash
 * Date : 7/25/2024
 * Time : 11:05 AM
 */
package org.example.stream;
public class SortAndSearch {
    public static void main(String[] args) {
        //sortStringAlphabeticalOrder("Belay");//abely

        int[] arr = {1,10,21,32,43,54,65,76,87,98,101,120,129};
        int input = 98;
        long searched = searchNumberByTheTarget(arr, input);
        //System.out.println(searched);

        long x = 12;
        long fab = fabinacci(x);
        System.out.println(fab);

    }

    private static void sortStringAlphabeticalOrder(String str) {
        char[] charArr = str.toCharArray();

        for (int i = 0; i < charArr.length; i++) {
            for (int j = i + 1; j < charArr.length; j++) {
                char temp = 0;
                if (charArr[i] > charArr[j]) {
                    temp = charArr[i];
                    charArr[i] = charArr[j];
                    charArr[j] = temp;
                }
            }
        }
        System.out.println(new String(charArr));
        //return new String(charArr);
    }

    private static long searchNumberByTheTarget(int[] arr, int TARGET) {

        int low = 0; // the first index
        int high = arr.length - 1; // max index value;

        while (low < high) {

            int index = (low + high) / 2; // get the middle index position
            int number = arr[index]; //index value of int number

            if (number == TARGET) {
                return index;
            } else if (number < TARGET) {
                low = index + 1;
            } else {
                high = index - 1;
            }
        }
        return -1;
    }

    private static long fabinacci(long N) {
        if (N <= 1) {
            return N;
        } else {
            return (fabinacci(N - 1) + fabinacci(N - 2));
        }
    }

}
