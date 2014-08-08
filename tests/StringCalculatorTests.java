import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

/**
 * Created by tobyretallick on 07/08/2014.
 */
public class StringCalculatorTests {

    @Test(expected = RuntimeException.class)
    @Ignore
    public final void ThrowExceptionWhenMoreThan2NumbersAreUsed() {
        StringCalculator.add("1,2,3");
    }

    @Test
    @Ignore
    public final void NotThrowExceptionWhen2NumbersAreUsed() {
        StringCalculator.add("1,2");
        Assert.assertTrue(true);
    }

    @Test(expected = RuntimeException.class)
    public final void ThrowExceptionWhenNonNumberIsUsed() {
        StringCalculator.add("1, X");
    }

    @Test
    public final void ReturnZeroWhenEmptyStringUsed() {
        Assert.assertEquals(0, StringCalculator.add(""));
    }

    @Test
    public final void ReturnParametreValueIfSingleParametreUsed() {
        Assert.assertEquals(3, StringCalculator.add("3"));
    }

    @Test
    public final void ReturnSumOfTwoValuesIfTwoValuesUsed() {
        Assert.assertEquals(3 + 6, StringCalculator.add("3,6"));
    }

    @Test
    public final void ReturnSumOfValuesForAnyNumberOfArguments() {
        Assert.assertEquals(3+4+5+6+7+8, StringCalculator.add("3,4,5,6,7,8"));
    }
}

