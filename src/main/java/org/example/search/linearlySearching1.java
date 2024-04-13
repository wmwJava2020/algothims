package org.example.search;

import java.util.logging.Logger;


public class linearlySearching1 {

    static int getLinearSearchforArrays(int[] arr, int N, int x) {
        for (int i = 0; i < N; i++) {
            if (arr[i] == x)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {56,76,12,34,67,90,34};
        int x = 90;
        int resul = getLinearSearchforArrays(arr,arr.length,x);
        //System.out.println(resul);
        Logger logger = Logger.getLogger(String.valueOf(linearlySearching1.class));
        logger.info(resul + " is an index");
    }
}
