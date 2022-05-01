import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AscendingSequenceTest {

    @Test
    public void testAscendingSequenceHappyPathPositiveNumber() {

        // Arrange:
        // 0, 1, 2, 3, 4, 5  -->
        int start = 0;
        int end = 5;
        int step = 1;

        int[] expectedResult = {0, 1, 2, 3, 4, 5};

        // Act: --->create Object
        AscendingSequence aSequence = new AscendingSequence();
        int[] actualResult = aSequence.ascendingSequenceAlgorithm(start, end, step);

        // Assert:
        Assertions.assertArrayEquals(expectedResult, actualResult);
    }


    @Test
    public void testAscendingSequenceHappyPathNegativeNumber() {

        // Arrange:
        // -10, -9, -8, -7  -->
        int start = -10;
        int end = -7;
        int step = 1;

        int[] expectedResult = {-10, -9, -8, -7};

        // Act: --->create Object
        AscendingSequence aSequence = new AscendingSequence();
        int[] actualResult = aSequence.ascendingSequenceAlgorithm(start, end, step);

        // Assert:
        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testAscendingSequenceHappyPathNegativeNumberAndPositivePath() {

        // Arrange:
        // -5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5  -->
        int start = -5;
        int end = 5;
        int step = 1;

        int[] expectedResult = {-5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5};

        // Act: --->create Object
        AscendingSequence aSequence = new AscendingSequence();
        int[] actualResult = aSequence.ascendingSequenceAlgorithm(start, end, step);

        // Assert:
        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testAscendingSequenceStep2() {

        // Arrange:
        // 0, 2, 4  -->
        int start = 0;
        int end = 5;
        int step = 2;

        int[] expectedResult = {0, 2, 4};

        // Act: --->create Object
        AscendingSequence aSequence = new AscendingSequence();
        int[] actualResult = aSequence.ascendingSequenceAlgorithm(start, end, step);

        // Assert:
        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testAscendingSequenceStartLargerThenEnd() {

        // Arrange:
        // {}  -->
        int start = 5;
        int end = 0;
        int step = 2;

        int[] expectedResult = {};

        // Act: --->create Object
        AscendingSequence aSequence = new AscendingSequence();
        int[] actualResult = aSequence.ascendingSequenceAlgorithm(start, end, step);

        // Assert:
        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testAscendingSequenceStepNegative() {

        // Arrange:
        // {}  -->
        int start = 0;
        int end = 5;
        int step = -1;

        int[] expectedResult = {};

        // Act: --->create Object
        AscendingSequence aSequence = new AscendingSequence();
        int[] actualResult = aSequence.ascendingSequenceAlgorithm(start, end, step);

        // Assert:
        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testAscendingSequenceStepIsZero() {

        // Arrange:
        // {}  -->
        int start = 5;
        int end = 0;
        int step = 0;

        int[] expectedResult = {};

        // Act: --->create Object
        AscendingSequence aSequence = new AscendingSequence();
        int[] actualResult = aSequence.ascendingSequenceAlgorithm(start, end, step);

        // Assert:
        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
}
