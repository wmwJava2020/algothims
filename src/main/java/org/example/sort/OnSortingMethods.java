/**
 * @author Admin01
 * @Date 8/6/2024
 */
package org.example.sort;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public class OnSortingMethods {
    public static void main(String[] args) {
        List<Integer> lst = Arrays.asList(3, 1, 4,-6, 10, 5, 7, 9, 2, 8, 15, -10, 0, 6);
        Collections.sort(lst);
        for(Integer INT : lst){
            //System.out.print(" "+INT);
        }
        //System.out.println();
        int[] arr ={3,1,4,-6,10,5,7,9,2,8, 15,-10,0,6};
        Arrays.sort(arr);
        for(int INTS : arr){
            //System.out.print(" "+INTS);
        }

        Integer[] arR ={3, 1, 4, -6, 10, 5, 7, -1,  9, -8, 2, 8, -4, 15,-10 , 0, 6};
        List<Integer> list = Arrays.asList(arR);
        Collections.sort(list);
        for(int INTs : list){
            //System.out.print(" "+INTs);
        }
        //System.out.println(" ");

        Integer[] ARS ={3, 1, 4, -6, 10, 5, -1, 7, 9, -8, 2, 8, 15,-10 , 0, 6, -4 };
        Arrays.sort(ARS);
        for(int INTS0 : ARS){
            //System.out.print(" "+INTS0);
        }

        int[] arr0 ={3,1,4,-6,10,5,7,9,2,8, 15,-10,0,6};
        onBubleSorting(arr0);


    }

    private static void onBubleSorting(int[] arr){
        int N = arr.length - 1;
        for(int i = 0; i < N; i++){
            for(int j = i + 1; j < N; j++){
                if(arr[j]< arr[i]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            System.out.print(arr[i] +" ");
        }
    }
}
