package org.example.sum.three;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AddThreeToTen {

    private static List<Integer[]> getThreeAddTen(int[] nums, int target){
        List<Integer[]> ls = new ArrayList<>();

        for(int x = 0; x < nums.length; x++){
            for(int y = x+1; y < nums.length; y++){
                for(int z = y + 1; z < nums.length; z++){
                   if(nums[x] + nums[y] + nums[z] == target)
                      ls.add(new Integer[]{nums[x],nums[y],nums[z]});
                }
            }
        }
        return ls;
    }

    public static void main(String[] args) {
        int[] ts = {1,2,7,8,2,0,5,4,1};
        int target = 10;
        List<Integer[]> addTen = getThreeAddTen(ts, target);
        for(Integer[] t : addTen){
            List<Integer> list = Arrays.asList(t);
            for(Integer it : list)
            System.out.println(it);

        }
    }
}
