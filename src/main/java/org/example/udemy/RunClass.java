/**
 * @author Wondafrash
 * @Date 5/18/2024
 */
package org.example.udemy;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class RunClass {
    public static void main(String[] args) {
        Counter cnt = new Counter();
        cnt.increment();
        cnt.increment();

        GenerateRandom random = new GenerateRandom();

        cnt.countEven(random.getRandomValue());

        cnt.getDuplicateValue(new int[]{random.getTwoArraysValue()}, random.getRandomValue());

        //System.out.println(Arrays.toString(arr));

        //System.out.println(cnt.getCurrentValue());
    }
}
