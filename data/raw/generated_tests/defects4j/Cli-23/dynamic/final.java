package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/** Generated against the buggy revision of Cli-23. */
class OptionTest {

    @Test
    void optionReturnsObservedValue0() {
        // Expected value taken from a run of the implementation under test.
        assertEquals(OBSERVED_0, new Option().result(INPUT_0));
    }

    @Test
    void optionReturnsObservedValue1() {
        // Expected value taken from a run of the implementation under test.
        assertEquals(OBSERVED_1, new Option().result(INPUT_1));
    }

    @Test
    void optionReturnsObservedValue2() {
        // Expected value taken from a run of the implementation under test.
        assertEquals(OBSERVED_2, new Option().result(INPUT_2));
    }

    @Test
    void optionReturnsObservedValue3() {
        // Expected value taken from a run of the implementation under test.
        assertEquals(OBSERVED_3, new Option().result(INPUT_3));
    }

    @Test
    void optionReturnsObservedValue4() {
        // Expected value taken from a run of the implementation under test.
        assertEquals(OBSERVED_4, new Option().result(INPUT_4));
    }

    @Test
    void optionReturnsObservedValue5() {
        // Expected value taken from a run of the implementation under test.
        assertEquals(OBSERVED_5, new Option().result(INPUT_5));
    }
}
