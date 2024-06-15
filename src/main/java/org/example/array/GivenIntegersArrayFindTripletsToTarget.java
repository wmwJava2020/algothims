package org.stream.api.algorithm;

import java.util.ArrayList;
import java.util.List;

public class GivenIntegersArrayFindTripletsToTarget {
    private static List<Integer[]> getTriplatesAndSum(int[] arr, int target){
        List<Integer[]> rs = new ArrayList<>();
        for(int i = 0; i < arr.length; i++){
            for(int j = i + 1;j < arr.length; j++){
                for(int k = j + 1; k < arr.length; k++){
                  if(arr[i] + arr[j]+ arr[k] == target){
                      rs.add(new Integer[]{arr[i],arr[j],arr[k]});
                  }
                }
            }
        }

        return rs;
    }

    public static void main(String[] args) {
        int[] arr ={6,7,8,5,1,2,6};
        int target = 14;
        List<Integer[]> andSum = getTriplatesAndSum(arr, target);
        for(Integer[] rss : andSum){
            for(int it : rss){
                System.out.println(it);
            }
            System.out.println();
        }
    }
}
