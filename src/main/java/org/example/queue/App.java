/**
 * @author Wondafrash
 * @Date 6/15/2024
 */
package org.example.queue;

public class App {

    public static void main(String[] args) {
        Queue queue = new Queue(5);
        queue.insert(1);
        queue.insert(3);
        queue.insert(5);
        queue.insert(7);
        queue.insert(9);
        queue.insert(11);
        queue.view();
    }
}
