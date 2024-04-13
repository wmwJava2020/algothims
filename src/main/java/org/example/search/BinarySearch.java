package org.example.search;

public class BinarySearch {
    private static int getBinarySearch(int[] numbers, int target) {
        // int arr[] = {3,1,8,0,2,5,7,4,6,9,10};

        int low = 0;  // get the low index or pointers
        int high = numbers.length - 1;  //get the high index or pointers

        while (low <= high) {
            int middleP = (low + high) / 2;  //get the middle / average index or pointers
            int middleN = numbers[middleP];

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

    public static void main(String[] args) {
        int[] numbers = {0,1,2,3,4,5,6,7,8,9};
        int target = 7;
        int search = getBinarySearch(numbers, target);
        System.out.println(search);

    }
}
