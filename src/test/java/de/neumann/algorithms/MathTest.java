package de.neumann.algorithms;

import org.junit.Test;

import static org.junit.Assert.*;

public class MathTest {

    @Test
    public void fastInvSqrt() {
        assertEquals((1/(java.lang.Math.sqrt(5632))),Math.fastInvSqrt(5632),0.0003f);
    }
}