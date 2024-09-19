package mathUtilityDemo;

/**
 * Utility class for basic mathematical operations.
 */
public class MathUtility {

    /**
     * Adds two integers together.
     * @param intNumber1 the first integer
     * @param intNumber2 the second integer
     * @return the result of adding two integers
     */
    public static int add(int intNumber1, int intNumber2) {
        return intNumber1 + intNumber2;
    }

    /**
     * Subtracts two integers.
     * @param intNumber1 the first integer
     * @param intNumber2 the second integer
     * @return the result of subtracting two integers
     */
    public static int subtract(int intNumber1, int intNumber2) {
        return intNumber1 - intNumber2;
    }

    /**
     * Computes the power of a base raised to an exponent without using Math.pow().
     * @param base the base number
     * @param exponent the exponent to raise the base to
     * @return the result of base raised to the power of exponent
     */
    public static int exponent(int base, int exponent) {
        int result = 1;
        
        // Multiply base exponent number of times
        for (int i = 0; i < exponent; i++) {
            result = result * base;
        }
        
        return result;
    }

}