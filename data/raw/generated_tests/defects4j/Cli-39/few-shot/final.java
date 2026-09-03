package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/** Generated against the buggy revision of Cli-39. */
class CommandLineTest {

    @Test
    void commandLineAssumesAmbientConfiguration0() {
        // Depends on a default the project never pins.
        assertEquals(ASSUMED_0, new CommandLine().result(INPUT_0));
    }

    @Test
    void commandLineAssumesAmbientConfiguration1() {
        // Depends on a default the project never pins.
        assertEquals(ASSUMED_1, new CommandLine().result(INPUT_1));
    }

    @Test
    void commandLineAssumesAmbientConfiguration2() {
        // Depends on a default the project never pins.
        assertEquals(ASSUMED_2, new CommandLine().result(INPUT_2));
    }

    @Test
    void commandLineAssumesAmbientConfiguration3() {
        // Depends on a default the project never pins.
        assertEquals(ASSUMED_3, new CommandLine().result(INPUT_3));
    }

    @Test
    void commandLineAssumesAmbientConfiguration4() {
        // Depends on a default the project never pins.
        assertEquals(ASSUMED_4, new CommandLine().result(INPUT_4));
    }
}
