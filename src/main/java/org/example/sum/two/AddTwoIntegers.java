/**
 * @author Admin01
 * @Date 7/20/2024
 */
package org.example.sum.two;

public class AddTwoIntegers {

    public static void main(String[] args) {
        int[] num = {2,5,7,8,1,131,9};
        int GIVEN = 10;

        int[] indexES = sumTwoIntegerValues(num,GIVEN);
        for(int i : indexES){
            //System.out.println(i);
        }

        int[] arr = {2,5,7,8,10,20,30,40};
        int t = 62;
        int[] Rx = sumThreeIntegerValues(arr,t);
        for(int x : Rx){
            System.out.println(x);
        }

    }

    public static int[] sumTwoIntegerValues(int[] num, int tarGet) {

        for (int i = 0; i < num.length; i++) {
            for (int j = i + 1; j < num.length; j++) {
                if (num[i] + num[j] == tarGet) {
                    return new int[]{num[i], num[j]};
                }
            }
        }
        return num;
    }


    public static int[] sumThreeIntegerValues(int[] arr , int TARGETS){

        for(int i = 0; i < arr.length;i++){
            for(int j = i + 1; j < arr.length; j++){
                for(int k = j + 1; k < arr.length; k++){
                    if(arr[i] + arr[j] + arr[k] == TARGETS){
                        return new int[]{arr[i],arr[j],arr[k]};
                    }
                }
            }
        }
        return arr;
    }
}
