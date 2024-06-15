/**
 * @author Wondafrash
 * @Date 5/18/2024
 */
package org.example.stack;

public class Stack {

    private int maxSize;
    private long[] stackArray;
    private int topOfStack;

    public Stack(int size) {
        this.maxSize = size; // max size should be the in put size
        this.stackArray = new long[maxSize]; // stack of the array should be equal to the maxSize
        this.topOfStack = -1; // this defines the index position of last item placed on the stack
    }

    public void push(long j){
        topOfStack++; // new push is executed
        stackArray[topOfStack] = j; // the size of stackArray[] is incremented by 1 input value j is assigned to new top;
    }

    public long pop(){
        int oldTop = topOfStack;      // temp variable to hold top of the stack
        topOfStack--;                // top of stack is popped out[removed]
        return stackArray[oldTop];  //  return the popped value
    }

    public long peak(){
        return stackArray[topOfStack]; // stackArray currently sitting on the top
    }

    public boolean isEmpty(){
        return (topOfStack == -1);
    }

    public boolean isFull(){
        return (maxSize - 1 == topOfStack); // if size is 10, max index size should be (10 -1) = 9
                              // if the index value of the top Of Stack equals index of (maxSize - 1), then stack is FULL
    }
}
