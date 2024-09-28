package org.example.sum.three;

import java.util.ArrayList;
import java.util.List;

public class AddThreeToZero {

    private static List<Integer[]> getSumToZero(int[] num, int target) {

        List<Integer[]> ls = new ArrayList<>();

        for (int i = 0; i < num.length; i++) {
            for (int j = i + 1; j < num.length; j++) {
                for (int k = j + 1; k < num.length; k++) {
                    if (num[i] + num[j] + num[k] == target) {
                        ls.add(new Integer[]{num[i], num[j], num[k]});
                    }
                }
            }
        }
        return ls;
    }

    private static List<Integer[]> getSumOfTwoIntgerNumbers(int[] arr, int GIVEN) {
        List<Integer[]> ls = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == GIVEN) {
                    ls.add(new Integer[]{arr[i], arr[j]});
                }
            }
        }
        return ls;
    }

    public static void main(String[] args) {
        int[] num = {7, 12, 3, 1, 2, 6, 5, -8, 6};
        int target = 14;
        List<Integer[]> triple = getSumToZero(num, target);
        for (Integer[] sm : triple) {
            for (int n : sm) {
                //System.out.println("" + n);
            }
            //System.out.println("------------------------");
        }
        int[] num0 = {7, 12, 3, 1, 2, -6, 5, 8, 6};
        int GIVEN = 20;

        List<Integer[]> list = getSumOfTwoIntgerNumbers(num0,GIVEN);
        for(Integer[] arrs : list){
            for(int rs : arrs){
                System.out.println("rs:"+rs);
            }
        }

    }
}
