/**
 * @author Wondafrash
 * @Date 5/18/2024
 */
package org.example.udemy;

import java.util.Random;

public class GenerateRandom {

    public int getTwoArraysValue(){
        Random random0 = new Random(2000);
        return random0.nextInt(2000);
    }

    public int[] getRandomValue(){

        Random random = new Random();

        // Generate a random number between 1 and 1 million
        int randomNumber = random.nextInt(10000);

        // Create an array of the specified size
        int[] array = new int[randomNumber];

        // Populate the array with random numbers
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt();
        }
        for (int arrays : array) {
            //System.out.println(arrays);
        }
        return array;
    }
}
