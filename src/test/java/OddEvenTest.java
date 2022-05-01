import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class OddEvenTest {

    @Test
    public void testOddNumber() {

        int number = 9;
        String expectedResult = "Even";

        OddEven evenNumber = new OddEven();
        String actualResult = evenNumber.IsOddOrEven(number);
/*
        Assertions.assert

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

 */
    }
}
