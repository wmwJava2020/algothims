/**
 * @author Wondafrash
 * @Date 6/15/2024
 */
package org.example.stack;

public class App {
    public static void main(String[] args) {

        Stack stack = new Stack(5);
        stack.push(10);
        stack.push(15);
        stack.push(20);
        stack.push(25);
        stack.push(30);
        while(!stack.isEmpty()){
            for(int i = 0;i < 10; i++) {
                long newElement = stack.pop();
                System.out.println("poppedElement : " + newElement);
            }
        }

        //long oldPeak = stack.peak();
        //System.out.println("oldPeak ="+oldPeak);

       /* while(!stack.isFull()){
            for(long i = 0; i <= 9;i++){
                stack.push(i);
                //System.out.println("elementPushed = "+ i);
            }

        }

        long newPeak = stack.peak();
        System.out.println("newPeakElement = "+newPeak);*/


    }
}
