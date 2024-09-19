package mathUtilityDemo;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class MathUtilityTest {

    // Tests for add method
    @Test
    public void shouldReturnZero_whenAddingZeroToZero() {
        assertEquals(0, MathUtility.add(0, 0));
    }

    @Test
    public void shouldReturnSum_whenAddingPositiveNumberToPositiveNumber() {
        assertEquals(6, MathUtility.add(5, 1));
    }

    @Test
    public void shouldReturnNegativeResult_whenAddingNegativeNumberToPositiveNumber() {
        assertEquals(-1, MathUtility.add(-2, 1));
    }

    @Test
    public void shouldReturnSameNumber_whenAddingZeroToPositiveNumber() {
        assertEquals(5, MathUtility.add(5, 0));
    }

    // Tests for subtract method
    @Test
    public void shouldReturnSameNumber_whenSubtractingZeroFromNumber() {
        assertEquals(5, MathUtility.subtract(5, 0));
    }

    @Test
    public void shouldReturnNegativeResult_whenSubtractingLargerNumberFromSmallerNumber() {
        assertEquals(-2, MathUtility.subtract(3, 5));
    }

    // Tests for exponent method
    @Test
    public void shouldReturnPositivePowerResult_whenBaseAndExponentArePositive() {
        assertEquals(8, MathUtility.exponent(2, 3));  // 2^3 = 8
    }

    @Test
    public void shouldReturnOne_whenBaseIsRaisedToPowerZero() {
        assertEquals(1, MathUtility.exponent(2, 0));  // Any base raised to 0 should be 1
    }    

    @Test
    public void shouldReturnBase_whenBaseIsRaisedToPowerOne() {
        assertEquals(3, MathUtility.exponent(3, 1));  // Any base raised to 1 should be the base
    }    

    @Test
    public void shouldReturnFraction_whenExponentIsNegative() {
        assertEquals(0.125, MathUtility.exponent(2, -3));  // 2^(-3) should be 1/8
    }
}