package de.neumann.algorithms.search;

import de.neumann.exceptions.ElementNotFoundException;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BinarySearchTest {

    @Test
    public void testBinarySearch(){
        int[] array = {10, 20, 40, 60, 110, 200, 5000};
        try {
            assertEquals(1,BinarySearch.binarySearch(array,0,array.length - 1,20));
        }catch (ElementNotFoundException e){
            e.printStackTrace();
            assert false;
        }
    }
}