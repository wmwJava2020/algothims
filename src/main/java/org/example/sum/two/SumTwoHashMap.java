package org.example.sum.two;

import java.util.HashMap;

public class SumTwoHashMap {
    static int[] sumNums(int[] num, int target){
        //create hashMap to store which number is the index at?
        HashMap<Integer,Integer> hashNum = new HashMap<Integer,Integer>();

        for(int i = 0; i < num.length; i++){
            int complement = target - num[i];

            if(hashNum.containsKey(complement)){
                return new int[]{hashNum.get(complement), i};
            }
            hashNum.put(num[i],i);
        }
        return new int[]{};
    }
}
