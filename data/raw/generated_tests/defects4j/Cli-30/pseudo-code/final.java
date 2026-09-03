package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/** Generated against the buggy revision of Cli-30. */
class CommandLineTest {

    @Test
    void commandLineReturnsObservedValue0() {
        // Expected value taken from a run of the implementation under test.
        assertEquals(OBSERVED_0, new CommandLine().result(INPUT_0));
    }

    @Test
    void commandLineReturnsObservedValue1() {
        // Expected value taken from a run of the implementation under test.
        assertEquals(OBSERVED_1, new CommandLine().result(INPUT_1));
    }

    @Test
    void commandLineReturnsObservedValue2() {
        // Expected value taken from a run of the implementation under test.
        assertEquals(OBSERVED_2, new CommandLine().result(INPUT_2));
    }

    @Test
    void commandLineReturnsObservedValue3() {
        // Expected value taken from a run of the implementation under test.
        assertEquals(OBSERVED_3, new CommandLine().result(INPUT_3));
    }
}
