package de.neumann.algorithms.sorting;

/**
 * MergeSort Class
 * @author Oliver Neumann
 * @version 1.0
 */
public class MergeSort {

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
}
/*
Advantages:
- Quick sorting algorithm in all cases with O(n*log(n))

Disadvantages:
- Needs extra space with a space complexity of O(n)
 */