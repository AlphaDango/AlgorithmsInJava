package de.neumann.algorithms.sorting;

/**
 * SelectionSort Class
 * @author Oliver Neuamann
 * @version 1.0
 */
public class SelectionSort {

    /**
     * SelectionSort function.
     * Time Complexity: Best O(n^2), Average O(n^2), Best O(n^2).
     * Space Complexity: O(1).
     * Stable: No.
     * @param array Array to sort.
     * @return Sorted array.
     */
    public static int[] selectionSort(int[] array){
        int length = array.length;

        for(int i = 0; i < length - 1; i++){
            int min = i;
            for(int j = i + 1; j < length; j++){
                if(array[j] < array[min])
                    min = j;
            }
            /*
            Swapping the minimum element with the first bigger element.
             */
            int temp = array[min];
            array[min] = array[i];
            array[i] = temp;
        }
        return array;
    }
}
/*
Advantages:
- Easy to understand

Disadvantages:
- Time Complexity of O(n^2)
 */