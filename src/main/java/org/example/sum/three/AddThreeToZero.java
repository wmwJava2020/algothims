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

    public static void main(String[] args) {
        int [] num = {7, 12, 3, 1, 2, -6, 5, -8, 6};
        int target = 0;
        List<Integer[]> triple = getSumToZero(num, target);
        for(Integer[] sm : triple){
            for(int n : sm){
                System.out.println(""+n);
            }
        }
    }
}
