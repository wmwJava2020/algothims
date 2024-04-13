package org.example.search;

public class linearlySearching {

    static int getLiearSearchOfArrays(int[] arr, int N, int x) {
        for (int i = 0; i < N; i++) {
            if (arr[i] == x)
            return i;
        }
        return -1;
    }

    public static void main(String[] args) {

        int arr[] = {2, 3, 4, 10, 40};
        int x = 10;
        int res = getLiearSearchOfArrays(arr, arr.length,x);
        if(res == -1)
            System.out.println("Number not found ");
        else
            System.out.println(res);


    }
}
