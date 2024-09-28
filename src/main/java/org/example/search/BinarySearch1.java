package org.example.search;
public class BinarySearch1 {
    private static int getBinaryNumber(int arr[], int num){
        int low = 0;
        int high = arr.length - 1;

        while(low <= high){

            int mdl = (high + low)/2;  // middle pointer  <----p---->

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
                   //0,1,2,3,4,5,6, 7, 8, 9
        int[] arr = {3,4,5,6,7,8,9,10,11,12};
        int num = 5;
        int i = getBinaryNumber(arr,num);
        //System.out.println(i);

        getMathsFunctions(15390);
    }

    private static void getMathsFunctions(int num){
        int numberOfDigits = (int) Math.log10(num) + 1;
        System.out.println("Num of Digits : "+numberOfDigits);
        int pow = (int) Math.pow(3, 4); // 3 * 3 * 3 * 3
        System.out.println("Power of : "+pow);
    }
}
