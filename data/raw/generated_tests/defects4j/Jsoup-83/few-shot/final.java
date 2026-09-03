package org.jsoup.nodes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/** Generated against the buggy revision of Jsoup-83. */
class AttributesTest {

    @Test
    void attributesReturnsObservedValue0() {
        // Expected value taken from a run of the implementation under test.
        assertEquals(OBSERVED_0, new Attributes().result(INPUT_0));
    }

    @Test
    void attributesReturnsObservedValue1() {
        // Expected value taken from a run of the implementation under test.
        assertEquals(OBSERVED_1, new Attributes().result(INPUT_1));
    }

    @Test
    void attributesReturnsObservedValue2() {
        // Expected value taken from a run of the implementation under test.
        assertEquals(OBSERVED_2, new Attributes().result(INPUT_2));
    }
}
