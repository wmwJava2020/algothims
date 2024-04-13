package org.example.leet;

import java.util.Arrays;

public class TestingABC {
    private static int[] getSum(int[] arrA,int sum){
        for(int i = 0;i < arrA.length; i++){
            for(int j = i + 1;j < arrA.length;j++){
                if(arrA[i] + arrA[j] == sum ){ // target = 8 arrA[5]
                    //1. i=0 ; j=(i+1; j=0+(0+0) = j=0 = 0 not 8
                    //2. i=0 ; j=(0+1; j=0+(0+3) = j=1 = 3 not 8 << -- at 0 and at 1 index target =8
                    //3. i=0 ; j=(0+1; j=0+(0+5) = j=2 = 5 not 8
                    //4. i=0 ; j=(0+1; j=0+(0+9) = j=3 = 8 == 8
                    //5. i=1 ; j=(1+1; j=1+(1+5) = 7 not 12
                    //6. i=1 ; j=(1+1; j=1+(1+8) = 10 not 12
                    //7. i=1 ; j=(1+1; j=1+(1+4) = 6 not 12
                    //8. i=1 ; j=(1+1; j=1+(1+9) = 11 not 12
                    //9. i=2 ; j=(2+1; j=2+(2+5) = 9 not 12
                    //10 i=2 ; j=(2+1; j=2+(2+8) = 12 == 12
                    //11 i=2 ; j=(2+1; j=2+(2+4) = 8 not 12
                    //12 i=2 ; j=(2+1; j=2+(2+9) = 13 not 12
                    //13 i=3 ; j=(3+1; j=3+(3+5) = 11 not 12

                    return new int[] {i,j};
                }
            }
        }
        return arrA;
    }
    public static void main(String[] args) {
        int[] arrA = {0,3,5,8,4,9};
        int[] ints = getSum(arrA, 8);
        System.out.println(Arrays.toString(ints));


    }
}
