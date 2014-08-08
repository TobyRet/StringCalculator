import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by tobyretallick on 07/08/2014.
 */
public class StringCalculatorTests {

    @Test(expected = RuntimeException.class)
    public final void ThrowExceptionWhenMoreThan2NumbersAreUsed() {
        StringCalculator.add("1,2,3");
    }

    @Test
    public final void NotThrowExceptionWhen2NumbersAreUsed() {
        StringCalculator.add("1,2");
        assertTrue(true);
    }

    @Test(expected = RuntimeException.class)
    public final void ThrowExceptionWhenNonNumberIsUsed() {
        StringCalculator.add("1, X");
    }

    @Test
    public final void ReturnZeroWhenEmptyStringUsed() {
        assertEquals(0, StringCalculator.add(""));
    }
}

