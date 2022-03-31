package de.neumann.algorithms;

import org.junit.Test;
import java.util.Arrays;
import java.util.Random;
import static org.junit.Assert.assertArrayEquals;

public class SortTest {
    Random rd = new Random();

    @Test
    public void bubbleSort() {
        int length = 10 + rd.nextInt(100);
        int[] array = new int[length];

        for(int i = 0; i < length; i++)
            array[i] = 1 + rd.nextInt(1000);

        int[] sortedArray = array.clone();

        Arrays.sort(sortedArray);
        System.out.println("BubbleSort\n_______________\n");
        System.out.println("Unsorted Array: " + Arrays.toString(array));
        assertArrayEquals(sortedArray,Sort.bubbleSort(array));
        System.out.println("Sorted Array: " + Arrays.toString(array)+"\n");
    }

    @Test
    public void insertionSort() {
        int length = 10 + rd.nextInt(100);
        int[] array = new int[length];

        for(int i = 0; i < length; i++)
            array[i] = 1 + rd.nextInt(1000);

        int[] sortedArray = array.clone();

        Arrays.sort(sortedArray);
        System.out.println("InsertionSort\n_______________\n");
        System.out.println("Unsorted Array: " + Arrays.toString(array));
        assertArrayEquals(sortedArray,Sort.insertionSort(array));
        System.out.println("Sorted Array: " + Arrays.toString(array)+"\n");
    }

    @Test
    public void mergeSort() {
        int length = 10 + rd.nextInt(100);
        int[] array = new int[length];

        for(int i = 0; i < length; i++)
            array[i] = 1 + rd.nextInt(1000);

        int[] sortedArray = array.clone();

        Arrays.sort(sortedArray);
        System.out.println("MergeSort\n_______________\n");
        System.out.println("Unsorted Array: " + Arrays.toString(array));
        assertArrayEquals(sortedArray,Sort.mergeSort(array,0,array.length - 1));
        System.out.println("Sorted Array: " + Arrays.toString(array)+"\n");
    }

    @Test
    public void selectionSort() {
        int length = 10 + rd.nextInt(100);
        int[] array = new int[length];

        for(int i = 0; i < length; i++)
            array[i] = 1 + rd.nextInt(1000);

        int[] sortedArray = array.clone();

        Arrays.sort(sortedArray);
        System.out.println("SelectionSort\n_______________\n");
        System.out.println("Unsorted Array: " + Arrays.toString(array));
        assertArrayEquals(sortedArray,Sort.selectionSort(array));
        System.out.println("Sorted Array: " + Arrays.toString(array)+"\n");
    }
}