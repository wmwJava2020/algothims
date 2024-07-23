package org.example.search;
public class BinarySearchAlgorithm {
    public static void main(String[] args) {
        int[] numbers = {3,1,8,0,2,5,7,4,6,9,4,10};
        int target = 4;
        int search = getBinarySearch(numbers, target);

        int[] num = {3, 1, 8, 0, 2, 5, 7, 4, 6, 9, 10};
        int targets = 4;
        //int search0 = searchBinaryIntegers(num, targets);
        //  0 1 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19
        int[] range0 = {77, 87, 97, 17, 23, 54, 67, 89, 19, 12, 34, 51, 52, 36, 78, 39, 10};
        int given = 12;
        //int search1 = searchForBinaryIntValue(range0, given);
                   //   0  1   2   3   4   5   6   7   8   9   10  11  12  13  14  15  16
        int[] range = {77, 87, 97, 17, 23, 54, 67, 89, 19, 12, 34, 51, 52, 36, 78, 39, 10};
        int x = 51;
        int r = range.length -1;
        //int binary = searchOnBinary(range, 0, r, x);

        System.out.println("sorted  : "+search);
        //System.out.println("unsorted: "+search0);
        //System.out.println("ranges  : " + search1);
        //System.out.println("binary  : " + binary);
    }

    private static int getBinarySearch(int[] numbers, int target) {

        // the given Array is --> int num[] = {3,1,8,0,2,5,7,4,6,9,10};
        //target is

        int low = 0;  // get the low index or pointers
        int high = numbers.length - 1;  //get the high index or pointers

        while (low <= high) {
            int middleP = (low + high) / 2;  //get the middle / average index or pointers
            int middleN = numbers[middleP]; // gives us pointers position

            if (target == middleN) {
                return middleP;
            }
            if (target < middleN) {
                high = middleP - 1; // pushing to down to the middleNumber  < ---- to left
            } else {                   // 1,2,3,4,5,6,7,8,9 where 6 is targeted and 5 is middle
                low = middleP + 1; // adding up to get to ---> middleNumber to right
            }
        }

        return -1;
    }

    public static int searchBinaryIntegers(int[] num, int targets) {
        // we have to define two index integers
        int low = 0;
        int max = num.length - 1;

        while (low <= max) { // here the loop is limited between the given arrays
            int middlePointers = (low + max) / 2; // int values of the pointers to get middle pointer.
            int middleIntValue = num[middlePointers]; // here we got middle-value

            // moving to different scenarios
            // here target is a given int number as an input

            if (targets == middlePointers) {
                return middlePointers; // here we are returning the index value of
            }
            if (targets < middlePointers) { // <---- to the left

                max = middlePointers - 1; // we suspect the value should be towards the left side the Array
            } else {
                low = middlePointers + 1; // we suspect the value should be towards the right side of the Array
            }
        }
        return -1;
    }

    public static int searchForBinaryIntValue(int[] input, int given) {
        //define min and max index-pointers
        int lowerP = 0;
        int higherP = input.length - 1;

        while (lowerP <= higherP) {

            int middlePointers = (lowerP + higherP) / 2; // middle-pointers
            int middleIntValue = input[middlePointers]; // pointer value;

            if (input[middlePointers] == given) {
                return middlePointers;
            } else if (input[middlePointers] > given) {
                higherP = middlePointers - 1;
            } else {
                lowerP = middlePointers + 1;
            }
        }


        return -1;
    }

    public static int searchOnBinary(int[] data, int l, int r, int x) {

        while (l <= r) {

            int m = (l + r) / 2;

            if (data[m] == x) {
                return m;
            } else if (data[m] > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return -1;
    }
}
