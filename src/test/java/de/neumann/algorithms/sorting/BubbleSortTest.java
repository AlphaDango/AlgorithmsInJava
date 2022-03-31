package de.neumann.algorithms.sorting;

import org.junit.Test;
import java.util.Arrays;
import java.util.Random;

import static org.junit.Assert.assertArrayEquals;

public class BubbleSortTest {

    @Test
    public void testBubbleSort(){
        Random rd = new Random();
        int length = 10 + rd.nextInt(100);
        int[] array = new int[length];

        for(int i = 0; i < length; i++)
            array[i] = 1 + rd.nextInt(1000);

        int[] sortedArray = array.clone();;

        Arrays.sort(sortedArray);
        assertArrayEquals(sortedArray,BubbleSort.bubbleSort(array));
    }

}