package org.example.sum.two;

import java.util.HashMap;
public class AddWithHashMap {

    static int[] getValueOfTowData(int[] number, int target){

        // 1. create hashmap data structure to handle complements
        HashMap<Integer,Integer> hash = new HashMap<Integer,Integer>();

        // 2. iterate over an array
        for(int i = 0; i < number.length; i++){

            // 3. calculate the complement that would sum to our target
            int complement = target- number[i];

            // 4. check if complement is in our hash table
            if(hash.containsKey(complement)){
              return new int[]{hash.get(complement),i};
            }
            // 5. add current number in to hash table
            hash.put(number[i],i);
        }
        // if no solution found return empty array
        return new int[]{};
    }

    public static void main(String[] args) {
        int[] number = {3,5,6,7,8,9,0,1};
        int target = 11;
        int[] value = getValueOfTowData(number, target);
        for(int ns : value){
            System.out.println(" Index value of : "+ns);
        }
    }
}
