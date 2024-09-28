/**
 * @author Wondafrash
 * @Date 5/18/2024
 */
package org.example.udemy;

public class Counter {

    private String name;
    private int value;

    public String Counter(String name) {
        return this.name = name;
    }

    public void increment() {
        value++;
    }

    public int getCurrentValue() {
        return value;
    }

    public int getDuplicateValue(int[] value0, int[] value1) {
        // the number of iteration executed will be the size of the input squared
        // this kind of algorithm is called quadratic
        int cnt = 0;
        for (int i = 0; i < value0.length; i++) {
            for (int j = 0; j < value1.length; j++) {
                if (value0[i] == value1[j]) {
                    cnt++;
                }
            }
        }
        return cnt;
    }

    public void getThreeLoopValue(int[] arr0, int[] arr1, int[] arr2) {
        // this algorithm is called big O(n3) or cubic
        int count = 0;
        for (int i = 0; i < arr0.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                for (int k = 0; k < arr2.length; k++) {
                    if (arr0[i] < arr1[j] && arr1[j] < arr2[k]) {
                        System.out.println(count++);
                    }
                }
            }
        }
    }

    public int getElements(int[] arr, int index) {
        // this algorithm returns the data at the given index
        // hence, called CONSTANT time algorithm
        // it takes constant TIME regardless of the size
        return arr[index];
    }

    public void countEven(int[] elements) {

        // LINEAR - the time to run this algorithm is linearly dependent on the size of the input.
        // the time is takes increase as the size of input is increases.
        // this algorithm iterates over the input ONCE hence called linear algorithm

        //int count = 0;

        long stt = System.currentTimeMillis();
        for (int element : elements) {

            if (element % 2 == 0) {
                //count++;
                //System.out.println(element);
            }
        }
        long end = System.currentTimeMillis();
        long timeTaken = stt - end;
        System.out.println("total time = " + timeTaken);
        //return count;
    }

    @Override
    public String toString() {
        return "Counter{" +
                "name='" + name + '\'' + ", value=" + value + '}';
    }
}