package mathUtilityDemo;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class MathUtilityTest {

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

    @Test
    public void shouldReturnSameNumber_whenSubtractingZeroFromNumber() {
        assertEquals(5, MathUtility.subtract(5, 0));
    }

    @Test
    public void shouldReturnNegativeResult_whenSubtractingLargerNumberFromSmallerNumber() {
        assertEquals(-2, MathUtility.subtract(3, 5));
    }

}