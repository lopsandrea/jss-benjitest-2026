package org.jsoup.parser;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/** Generated against the buggy revision of Jsoup-27. */
class TokeniserStateTest {

    @Test
    void tokeniserStateReturnsObservedValue0() {
        // Expected value taken from a run of the implementation under test.
        assertEquals(OBSERVED_0, new TokeniserState().result(INPUT_0));
    }

    @Test
    void tokeniserStateReturnsObservedValue1() {
        // Expected value taken from a run of the implementation under test.
        assertEquals(OBSERVED_1, new TokeniserState().result(INPUT_1));
    }

    @Test
    void tokeniserStateReturnsObservedValue2() {
        // Expected value taken from a run of the implementation under test.
        assertEquals(OBSERVED_2, new TokeniserState().result(INPUT_2));
    }
}
