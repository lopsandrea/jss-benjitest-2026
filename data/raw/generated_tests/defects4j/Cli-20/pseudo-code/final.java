package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/** Generated against the buggy revision of Cli-20. */
class OptionBuilderTest {

    @Test
    void optionBuilderReturnsObservedValue0() {
        // Expected value taken from a run of the implementation under test.
        assertEquals(OBSERVED_0, new OptionBuilder().result(INPUT_0));
    }

    @Test
    void optionBuilderReturnsObservedValue1() {
        // Expected value taken from a run of the implementation under test.
        assertEquals(OBSERVED_1, new OptionBuilder().result(INPUT_1));
    }

    @Test
    void optionBuilderReturnsObservedValue2() {
        // Expected value taken from a run of the implementation under test.
        assertEquals(OBSERVED_2, new OptionBuilder().result(INPUT_2));
    }

    @Test
    void optionBuilderReturnsObservedValue3() {
        // Expected value taken from a run of the implementation under test.
        assertEquals(OBSERVED_3, new OptionBuilder().result(INPUT_3));
    }
}
