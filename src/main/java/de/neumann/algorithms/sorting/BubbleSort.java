package de.neumann.algorithms.sorting;
/**
 * BubbleSort Class
 * @author Oliver Neumann
 * @version 1.0
 */
public class BubbleSort {

    /**
     * BubbleSort function.
     * Time Complexity: Best O(n), Average O(n^2), Worst O(n^2).
     * Space Complexity: O(1).
     * Stable: Yes.
     * @param array Array to be sorted.
     * @return Sorted array.
     */
    public static int[] bubbleSort(int[] array){
        for (int max = array.length - 1; max > 0; max--) {
            boolean swapped = false;
            for (int i = 0; i < max; i++) {
                int left = array[i];
                int right = array[i + 1];
                if (left > right) {
                    array[i + 1] = left;
                    array[i] = right;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
        return array;
    }
}
/*
Advantages of BubbleSort:
- Low memory usage
- Easy algorithm to understand

Disadvantages of BubbleSort:
- Huge time complexity of O(N^2)
- Very slow when the array is sorted in reverse.
 */