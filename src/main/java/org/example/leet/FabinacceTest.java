package org.example.leet;

public class FabinacceTest {
    private static void Fibonacci(int N) {
        // 0 + 1 = 1;
        // 1 + 1 = 2;
        // 1 + 2 = 3;
        // 2 + 3 = 5;
        // 3 + 5 = 8;
        int num1 = 0, num2 = 1;

        for (int i = 0; i < N; i++) {
            System.out.println(num1 + " ");
            int num3 = num2 + num1;
            num1 = num2;
            num2 = num3;
        }
    }

    private static long fiboacci(int n) {
        //base case
        if (n <= 1) { return n; }

        //call recursive
        return (fiboacci(n - 1) + fiboacci(n - 2));
    }

    private static long fabinacci1(long l){
        //base case
        if(l <= 1){
            return l;
        }
        // call recursive
        return (fabinacci1(l - 1) + fabinacci1(l -2));


    }

    public static void main(String[] args) {
        //Fibonacci(5);
        long N = 10;
        for (int i = 0; i < N; i++) {
            //System.out.print(fiboacci(i));
            //System.out.print(" ");
        }

        long L = 10;
        for(int i = 0; i < L;i++){
            System.out.print(fabinacci1(i));
            System.out.print(" ");
        }
    }
}

