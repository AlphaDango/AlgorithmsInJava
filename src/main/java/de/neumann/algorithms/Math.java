package de.neumann.algorithms;

/**
 * Math Class
 * @author Oliver Neumann
 */
public class Math {

    /**
     * Fast iverse Sqrt function from Quake III
     * @param x Float input to calculate the inverse sqrt from
     * @return Inverse sqrt of x
     */
    public static float fastInvSqrt(float x){
        float xhalf = 0.5f * x;
        int i = Float.floatToIntBits(x);
        i = 0x5f375a86 - (i >> 1);
        x = Float.intBitsToFloat(i);
        x = x * (1.5f - xhalf * x * x);
        return x;
    }
}