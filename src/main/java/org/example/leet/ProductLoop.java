package org.example.leet;

public class ProductLoop {
    private static void getProduct(int arr[]){

        int sum = 0;
        int product = 1;

        for (int j : arr) {
            sum += j;
        }
        for (int j : arr) {
            product *= j;
        }
        System.out.println("sum=" + sum +" : "+"product="+product);
    }

    private static void getSum(int arr[]){
        for(int i = 0; i < arr.length;i++){
            for(int j = 0;j < arr.length; j++){
                System.out.println(arr[i] +":"+arr[j]);
            }
        }

    }

    private static int cnt = 0;
    private static void getThreePairSum(int[] arrA, int[] arrB){
        for(int i = 0 ; i < arrA.length; i++){
            for(int j = 0; j < arrB.length ; j++){
                for(int k = 0; k < 4 ; k++){
                    System.out.println("i="+arrA[i] + ":"+"j="+ arrB[j]);
                }
                System.out.println("loop cnt="+cnt++);
                System.out.println();
            }
        }
    }

    private static int factorial(int n){
        if( n < 0){
            return 1;
        } else if (n == 0) {
            return -1;

        }else{
            return n * factorial(n -1);
            // 3 * (3 - 1) -> 3 * 2 === 6
        }
    }

    //The Fibonacci series is a series of elements where, the previous two elements are added to get the next element
    private static int fib(int r){
        if(r <= 0){
            return 0;
        } else if (r == 1) {
            return 1;
        }else {
            // is where two numbers equals the next number
            // 0 + 1 = 1 ; 1 + 1 = 2; 2 + 3 = 5 ; 5 + 3 = 8 ; 8 + 5 = 12
            // 1 + 1 = 1 ; 1 + 1 = 2 ; 1 + 2 = 3 ; 2 + 3 = 5 ; 3 + 5 = 8 ; 5 + 8 = 13 ; 8 + 13 = 21 ; 13 + 21 = 34....
            return fib(r -1) + fib(r +1);
                 // fib( 2- 1) + f(2 + 1)
                // fib(-1) + fib(3)
               // 2
        }
    }

    public static void main(String[] args) {
        //int[] arr = new int[3];
        int[] arrA ={9,2,6};
        int[] arrB = {7,1,0};
        //getProduct(arr);
        //getSum(arr);
        //getThreePairSum(arrA, arrB);
        int i = factorial(4);
        //System.out.println(i);
        System.out.println(fib(2));
    }
}
