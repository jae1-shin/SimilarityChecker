import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimilarityCheckerTest {
    private SimilarityChecker checker;


    @Test
    void createSimilarityChecker() {
        checker = new SimilarityChecker("first", "second");
        assertNotNull(checker);
        assertEquals("first", checker.getFirstString());
        assertEquals("second", checker.getSecondString());
    }

    @Test
    void lengthCheckWhenStringsAreEqual() {
        checker = new SimilarityChecker("test", "test");
        assertEquals(60, checker.lengthCheck());
    }

    @Test
    void lengthCheckWhenStringsWithSameLength() {
        checker = new SimilarityChecker("test", "abcd");
        assertEquals(60, checker.lengthCheck());
    }

    @Test
    void lengthCheckWhenStringsWith2TimesOrMoreDiff1() {
        checker = new SimilarityChecker("test", "te");
        assertEquals(0, checker.lengthCheck());
    }
    @Test
    void lengthCheckWhenStringsWith2TimesOrMoreDiff2() {
        checker = new SimilarityChecker("a", "abc");
        assertEquals(0, checker.lengthCheck());
    }

}