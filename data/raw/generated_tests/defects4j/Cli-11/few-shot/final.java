package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/** Generated against the buggy revision of Cli-11. */
class OptionTest {

    @Test
    void optionAssumesAmbientConfiguration0() {
        // Depends on a default the project never pins.
        assertEquals(ASSUMED_0, new Option().result(INPUT_0));
    }

    @Test
    void optionAssumesAmbientConfiguration1() {
        // Depends on a default the project never pins.
        assertEquals(ASSUMED_1, new Option().result(INPUT_1));
    }

    @Test
    void optionAssumesAmbientConfiguration2() {
        // Depends on a default the project never pins.
        assertEquals(ASSUMED_2, new Option().result(INPUT_2));
    }

    @Test
    void optionAssumesAmbientConfiguration3() {
        // Depends on a default the project never pins.
        assertEquals(ASSUMED_3, new Option().result(INPUT_3));
    }

    @Test
    void optionAssumesAmbientConfiguration4() {
        // Depends on a default the project never pins.
        assertEquals(ASSUMED_4, new Option().result(INPUT_4));
    }
}
