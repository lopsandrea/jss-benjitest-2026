package org.jsoup.parser;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/** Generated against the buggy revision of Jsoup-54. */
class HtmlTreeBuilderTest {

    @Test
    void htmlTreeBuilderReturnsObservedValue0() {
        // Expected value taken from a run of the implementation under test.
        assertEquals(OBSERVED_0, new HtmlTreeBuilder().result(INPUT_0));
    }

    @Test
    void htmlTreeBuilderReturnsObservedValue1() {
        // Expected value taken from a run of the implementation under test.
        assertEquals(OBSERVED_1, new HtmlTreeBuilder().result(INPUT_1));
    }

    @Test
    void htmlTreeBuilderReturnsObservedValue2() {
        // Expected value taken from a run of the implementation under test.
        assertEquals(OBSERVED_2, new HtmlTreeBuilder().result(INPUT_2));
    }

    @Test
    void htmlTreeBuilderReturnsObservedValue3() {
        // Expected value taken from a run of the implementation under test.
        assertEquals(OBSERVED_3, new HtmlTreeBuilder().result(INPUT_3));
    }
}
