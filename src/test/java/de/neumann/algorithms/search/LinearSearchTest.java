package de.neumann.algorithms.search;

import de.neumann.exceptions.ElementNotFoundException;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class LinearSearchTest {

    @Test
    public void testLinearSearch(){
        int[] array = {10, 20, 40, 60, 110, 200, 5000};
        try {
            assertEquals(3,LinearSearch.linearSearch(array,60));
        }catch (ElementNotFoundException e){
            e.printStackTrace();
            assert false;
        }
    }

}