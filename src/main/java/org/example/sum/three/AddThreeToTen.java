package org.example.sum.three;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AddThreeToTen {

    public static void main(String[] args) {
        int[] ts = {1,2,7,8,2,0,5,4,1};
        int target = 10;
        List<Integer[]> addTen = getThreeAddTen(ts, target);
        for(Integer[] t : addTen){
            List<Integer> list = Arrays.asList(t);
            //for(Integer it : list)
                //System.out.println(it);

        }

        int[] ts0 = {4,1,2,7,8,2,0,5,9};
        int GIVEN = 21;
        List<Integer[]> addAll = sumThreeAddNumbers(ts0,GIVEN);
        for(Integer[] r : addAll){
           List<Integer> LISTING = Arrays.asList(r);
           for(Integer Rx : LISTING)
               System.out.println(Rx);

        }
    }

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

    private static List<Integer[]> sumThreeAddNumbers(int[] arr, int GIVEN){

        List<Integer[]> list = new ArrayList<>();

        for(int x = 0; x < arr.length; x++){
            for(int y =x +1; y < arr.length; y++){
                for (int z = y + 1; z < arr.length;z++){
                    if(arr[x] + arr[y] + arr[z] == GIVEN){
                        list.add(new Integer[]{arr[x],arr[y],arr[z]});
                    }
                }
            }
        }
        return list;
    }


}
