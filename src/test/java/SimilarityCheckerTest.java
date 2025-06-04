import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimilarityCheckerTest {
    @Test
    void createSimilarityChecker() {
        SimilarityChecker checker = new SimilarityChecker("first", "second");
        assertNotNull(checker);
        assertEquals("first", checker.getFirstString());
        assertEquals("second", checker.getSecondString());
    }

    @Test
    void lengthCheckWhenStringsAreEqual() {
        SimilarityChecker checker = new SimilarityChecker("test", "test");
        assertEquals(60, checker.lengthCheck());
    }

}