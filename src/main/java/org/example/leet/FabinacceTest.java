package org.example.leet;

public class FabinacceTest {
    private static void Fibonacci(int N){
        // 0 + 1 = 1;
        // 1 + 1 = 2;
        // 1 + 2 = 3;
        // 2 + 3 = 5;
        // 3 + 5 = 8;
        // 5 + 8 = 13;
        // 8 + 13 = 21;
        // 13 + 21 = 34;
        int num1 = 0 , num2 = 1;

        for(int i = 0; i < N; i++){
            System.out.println(num1 +" ");
            int num3 = num2 + num1;
            num1 = num2;
            num2 = num3;
        }
    }

    public static void main(String[] args) {
        Fibonacci(10);
    }
} // https://github.com/wmwJava2020/oc-certifications.git
