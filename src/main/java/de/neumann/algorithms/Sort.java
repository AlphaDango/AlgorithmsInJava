package de.neumann.algorithms;

import java.util.Random;

/**
 * Class with sorting algorithms
 * @author Oliver Neumann
 */
public class Sort {

    /**
     * BubbleSort function.
     * Time Complexity: Best O(n), Average O(n^2), Worst O(n^2).
     * Space Complexity: O(1).
     * Stable: Yes.
     * @param array Array to be sorted.
     * @return Sorted array.
     */
    public static <T extends Comparable<T>> T[] bubbleSort(T[] array){
        for (int max = array.length - 1; max > 0; max--) {
            boolean swapped = false;
            for (int i = 0; i < max; i++) {
                T left = array[i];
                T right = array[i + 1];
                if (left.compareTo(right) > 0) {
                    array[i + 1] = left;
                    array[i] = right;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
        return array;
    }
/*
Advantages of BubbleSort:
- Low memory usage
- Easy algorithm to understand

Disadvantages of BubbleSort:
- Huge time complexity of O(N^2)
- Very slow when the array is sorted in reverse.
 */

    /**
     * InsertionSort function.
     * Time Complexity: Best O(n), Average O(n^2), Worst O(n^2).
     * Space Complexity: O(1).
     * Stable: Yes.
     * @param array Array to be sorted.
     * @return Sorted array.
     */
    public static <T extends Comparable<T>> T[] insertionSort(T[] array){
        int length = array.length;
        for(int i = 1; i < length; i++){
            T shiftKey = array[i];
            int j = i -1 ;

            while(j >= 0 && array[j].compareTo(shiftKey) > 0){
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = shiftKey;
        }
        return array;
    }
/*
Advantages:
- Easy to understand
- Efficient on small datasets
- Low memory usage

Disadvantages:
- Very bad average time complexity of O(n^2)
 */

    /**
     * MergeSort function.
     * Time Complexity: Best O(n*log(n)), Average O(n*log(n)), Worst O(n*log(n)).
     * Space Complexity: O(n).
     * Stable: Yes.
     * @param array Array to sort.
     * @param left Left boundary.
     * @param right Right boundary.
     * @return Sorted array.
     */
    public static int[] mergeSort(int[] array, int left, int right){
        if(left == right)
            return new int[]{array[left]};
        int middle = left + (right - left) / 2;
        int[] leftArray = mergeSort(array, left, middle);
        int[] rightArray = mergeSort(array, middle + 1, right);
        return merge(leftArray, rightArray);
    }

    /**
     * Merge part of the MergeSort algorithm.
     * @param leftArray Left array to merge.
     * @param rightArray Right array to merge.
     * @return Merged and sorted array.
     */
    private static int[] merge(int[] leftArray, int[] rightArray){
        int leftLength = leftArray.length;
        int rightLength = rightArray.length;

        int[] target = new int[leftLength + rightLength];
        int targetPos = 0; int leftPos = 0; int rightPos = 0;

        while(leftPos < leftLength && rightPos < rightLength){

            int leftElement = leftArray[leftPos];
            int rightElement = rightArray[rightPos];
            if(leftElement <= rightElement){
                target[targetPos++] = leftElement;
                leftPos++;
            }else{
                target[targetPos++] = rightElement;
                rightPos++;
            }
        }
        while(leftPos < leftLength)
            target[targetPos++] =leftArray[leftPos++];
        while(rightPos < rightLength)
            target[targetPos++] = rightArray[rightPos++];
        return target;
    }
/*
Advantages:
- Quick sorting algorithm in all cases with O(n*log(n))

Disadvantages:
- Needs extra space with a space complexity of O(n)
*/

    /**
     * SelectionSort function.
     * Time Complexity: Best O(n^2), Average O(n^2), Best O(n^2).
     * Space Complexity: O(1).
     * Stable: No.
     * @param array Array to sort.
     * @return Sorted array.
     */
    public static <T extends Comparable<T>> T[] selectionSort(T[] array){
        int length = array.length;

        for(int i = 0; i < length - 1; i++){
            int min = i;
            for(int j = i + 1; j < length; j++){
                if(array[j].compareTo(array[min]) < 1)
                    min = j;
            }
            /*
            Swapping the minimum element with the first bigger element.
             */
            T temp = array[min];
            array[min] = array[i];
            array[i] = temp;
        }
        return array;
    }
/*
Advantages:
- Easy to understand

Disadvantages:
- Time Complexity of O(n^2)
 */

    /**
     * BogoSort function.
     * Time Complexity: Best O(n), Average O(n*n!), Worst O(n*n!)
     * Space Complexity: O(1).
     * Stable: No.
     * @param array Array to sort.
     * @return Sorted array.
     */
    public static <T extends Comparable<T>> T[] bogoSort(T[] array){
        Random rd = new Random();

        while(!isSorted(array)){
            int a = rd.nextInt(array.length);
            int b = rd.nextInt(array.length);

            T temp = array[a];
            array[a] = array[b];
            array[b] = temp;
        }
        return array;
    }
/*
Advantages:
- It's dumb therefore it's funny.

Disadvantages:
- It's entire existence
 */

    /**
     * Function to check if an array is sorted.
     * @param array Array to check.
     * @return Returns true if array is sorted. False if it's not.
     */
    private static <T extends Comparable<T>> boolean isSorted(T[] array){
        for(int i = 0; i < array.length - 1; i++) {
            if (array[i].compareTo(array[i + 1]) > 0)
                return false;
        }
        return true;
    }
}
