package de.neumann.algorithms.search;

import de.neumann.exceptions.ElementNotFoundException;

/**
 * BinarySearch Class
 * @author Oliver Neumann
 * @version 1.0
 */
public class BinarySearch {

    /**
     * Iterative binarySearch function.
     * Time Complexity: Best O(1), Average O(log n), Worst O(log n).
     * Space Complexity: O(1)
     * @param sortedArray Needs a sorted array.
     * @param left Left boundary of the array.
     * @param right Right boundary of the array.
     * @param elementToFind Element to search for in the array.
     * @return Array position of the searched element.
     * @throws ElementNotFoundException Exception gets thrown if element isn't found.
     */
    public static int binarySearch(int[] sortedArray, int left, int right, int elementToFind) throws ElementNotFoundException {
        while(left <= right){
            int mid = left + (right - left) / 2;

            if(sortedArray[mid] == elementToFind)
                return mid;

            if(sortedArray[mid] < elementToFind)
                left = mid + 1;
            else
                right = mid - 1;
        }
        throw new ElementNotFoundException();
    }

    /**
     * Recursive binarySearch function.
     * Time Complexity: Best O(1), Average O(log n), Worst O(log n).
     * Space Complexity: O(1)
     * @param sortedArray Needs a sorted array.
     * @param left Left boundary of the array.
     * @param right Right boundary of the array.
     * @param elementToFind Element to search for in the array.
     * @return Array position of the searched element.
     * @throws ElementNotFoundException Exception gets thrown if element isn't found.
     */
    public static int recursiveBinarySearch(int[] sortedArray, int left, int right, int elementToFind) throws ElementNotFoundException {
        if(right >= left){

            int mid = left + (right -left) / 2;

            if(sortedArray[mid] == elementToFind)
                return mid;

            if(sortedArray[mid] > elementToFind)
                return recursiveBinarySearch(sortedArray, left, mid - 1, elementToFind);
            else
                return recursiveBinarySearch(sortedArray, mid + 1, right, elementToFind);
        }else{
            throw new ElementNotFoundException();
        }
    }
}