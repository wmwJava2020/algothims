/**
 * @author Wondafrash
 * @Date 6/15/2024
 */
package org.example.queue;

public class Queue {
    // <--- the position elements joint the queue --
    // A1, B2, C3, D4, E5, F6, G7, H8, I9,J10
    private int maxSize; // initialized the number of slots;
    private long[] queArray;// slot to the main data
    private int front;// index position of element int the front;
    private int rear;//index position of element in the back
    private int nItem; // counter to maintain our queue

    public Queue(int size) {
        this.maxSize = size;
        this.queArray = new long[size];
        front = 0;
        rear = -1;
        nItem = 0;
    }

    public void insert(long j) {
        if (rear == maxSize - 1) { rear = -1;} // to reset rear back to -1
        //else if (isFull()) {throw new RuntimeException(" Queue is of max in size!");} // catch error
         else {
            rear++; //inserting elements is adds up rear value from -1 to 0
            queArray[rear] = j; //queue array size will be growing as element inserted to rear value
            nItem++;  // the queue counter also updated or increased.
        }
    }


    public long remove() {//remove the 1st position and swap to next inline
        long temp = queArray[front]; // we need to get the front position
        front++; // front position would be increased
        if (front == maxSize) { // all individuals are removed
            front = 0; // reset front back to 0th index or make the queue empty
        }
        nItem--; // counter would be decreased by one
        return temp;
    }

    public long peekFront() {
        return queArray[front];
    }

    public boolean isEmpty() {
        return nItem == 0;
    }

    public boolean isFull() {
        return nItem == maxSize;
    }

    public void view() {
        System.out.print("[");
        for (int i = 0; i < queArray.length; i++) {
            System.out.print(queArray[i] + " ");
        }
        System.out.print("]");
    }

}
