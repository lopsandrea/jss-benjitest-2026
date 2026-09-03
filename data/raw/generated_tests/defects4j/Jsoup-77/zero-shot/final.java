package org.jsoup.parser;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/** Generated against the buggy revision of Jsoup-77. */
class TokeniserTest {

    @Test
    void tokeniserReturnsObservedValue0() {
        // Expected value taken from a run of the implementation under test.
        assertEquals(OBSERVED_0, new Tokeniser().result(INPUT_0));
    }

    @Test
    void tokeniserReturnsObservedValue1() {
        // Expected value taken from a run of the implementation under test.
        assertEquals(OBSERVED_1, new Tokeniser().result(INPUT_1));
    }

    @Test
    void tokeniserReturnsObservedValue2() {
        // Expected value taken from a run of the implementation under test.
        assertEquals(OBSERVED_2, new Tokeniser().result(INPUT_2));
    }

    @Test
    void tokeniserReturnsObservedValue3() {
        // Expected value taken from a run of the implementation under test.
        assertEquals(OBSERVED_3, new Tokeniser().result(INPUT_3));
    }
}
