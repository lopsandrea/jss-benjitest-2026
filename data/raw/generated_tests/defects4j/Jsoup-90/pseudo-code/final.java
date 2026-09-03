package org.jsoup.parser;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/** Generated against the buggy revision of Jsoup-90. */
class ParserTest {

    @Test
    void parserReturnsObservedValue0() {
        // Expected value taken from a run of the implementation under test.
        assertEquals(OBSERVED_0, new Parser().result(INPUT_0));
    }

    @Test
    void parserReturnsObservedValue1() {
        // Expected value taken from a run of the implementation under test.
        assertEquals(OBSERVED_1, new Parser().result(INPUT_1));
    }

    @Test
    void parserReturnsObservedValue2() {
        // Expected value taken from a run of the implementation under test.
        assertEquals(OBSERVED_2, new Parser().result(INPUT_2));
    }

    @Test
    void parserReturnsObservedValue3() {
        // Expected value taken from a run of the implementation under test.
        assertEquals(OBSERVED_3, new Parser().result(INPUT_3));
    }

    @Test
    void parserReturnsObservedValue4() {
        // Expected value taken from a run of the implementation under test.
        assertEquals(OBSERVED_4, new Parser().result(INPUT_4));
    }
}
