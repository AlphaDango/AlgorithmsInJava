package de.neumann.algorithms;

import de.neumann.exceptions.ElementNotFoundException;
import org.junit.Test;

import static org.junit.Assert.*;

public class SearchTest {

    @Test
    public void binarySearch() {
        int[] array = {10, 20, 40, 60, 110, 200, 5000};
        try {
            assertEquals(1,Search.binarySearch(array,0,array.length - 1,20));
        }catch (ElementNotFoundException e){
            e.printStackTrace();
            assert false;
        }
    }

    @Test
    public void recursiveBinarySearch() {
        int[] array = {10, 20, 40, 60, 110, 200, 5000};
        try {
            assertEquals(1,Search.recursiveBinarySearch(array,0,array.length - 1,20));
        }catch (ElementNotFoundException e){
            e.printStackTrace();
            assert false;
        }
    }

    @Test
    public void linearSearch() {
        int[] array = {10, 20, 40, 60, 110, 200, 5000};
        try {
            assertEquals(3,Search.linearSearch(array,60));
        }catch (ElementNotFoundException e){
            e.printStackTrace();
            assert false;
        }
    }
}