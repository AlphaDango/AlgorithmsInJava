package de.neumann.algorithms.search;

import de.neumann.exceptions.ElementNotFoundException;

/**
 * LinearSearch Class
 * @author Oliver Neumann
 * @version 1.0
 */
public class LinearSearch {

    /**
     * LinearSearch function.
     * Time Complexity: Best O(1), Average O(n), Worst O(n).
     * Space Complexity: O(n).
     * @param array Array with elements.
     * @param elementToFind Element to search for in the array.
     * @return Array position of the searched element.
     * @throws ElementNotFoundException Exception gets thrown if element isn't found.
     */
    public static int linearSearch(int[] array, int elementToFind) throws ElementNotFoundException {
        for(int i = 0; i < array.length; i++){
            if(array[i] == elementToFind)
                return i;
        }
        throw new ElementNotFoundException();
    }
}