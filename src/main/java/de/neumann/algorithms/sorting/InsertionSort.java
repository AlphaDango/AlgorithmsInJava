package de.neumann.algorithms.sorting;

/**
 * InsertionSort Class
 * @author Oliver Neumann
 * @version 1.0
 */
public class InsertionSort {

    /**
     * InsertionSort function.
     * Time Complexity: Best O(n), Average O(n^2), Worst O(n^2).
     * Space Complexity: O(1).
     * Stable: Yes.
     * @param array Array to be sorted.
     * @return Sorted array.
     */
    public static int[] insertionSort(int[] array){
        int length = array.length;
        for(int i = 1; i < length; i++){
            int shiftKey = array[i];
            int j = i -1 ;

            while(j >= 0 && array[j] > shiftKey){
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = shiftKey;
        }
        return array;
    }
}
/*
Advantages:
- Easy to understand
- Efficient on small datasets
- Low memory usage

Disadvantages:
- Very bad average time complexity of O(n^2)
 */