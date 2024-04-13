package org.example.search;
public class BinarySearch1 {
    private static int getBinaryNumber(int arr[], int num){
        int low = 0;
        int high = arr.length - 1;

        while(low <= high){

            int mdl = (high + low)/2;
            int mdlP = arr[mdl];

            if(num == mdl){
                return mdlP;
            }
            if(num > mdl){
               return num = high - 1;
            }else{
                return num = high + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {3,4,5,6,7,8,9};
        int num = 8;
        int i = getBinaryNumber(arr, 8);
        System.out.println(i);
    }
}
