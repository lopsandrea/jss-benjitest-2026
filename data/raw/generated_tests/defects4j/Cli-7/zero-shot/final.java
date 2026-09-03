package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/** Generated against the buggy revision of Cli-7. */
class OptionBuilderTest {

    @Test
    void optionBuilderAssumesAmbientConfiguration0() {
        // Depends on a default the project never pins.
        assertEquals(ASSUMED_0, new OptionBuilder().result(INPUT_0));
    }

    @Test
    void optionBuilderAssumesAmbientConfiguration1() {
        // Depends on a default the project never pins.
        assertEquals(ASSUMED_1, new OptionBuilder().result(INPUT_1));
    }

    @Test
    void optionBuilderAssumesAmbientConfiguration2() {
        // Depends on a default the project never pins.
        assertEquals(ASSUMED_2, new OptionBuilder().result(INPUT_2));
    }

    @Test
    void optionBuilderAssumesAmbientConfiguration3() {
        // Depends on a default the project never pins.
        assertEquals(ASSUMED_3, new OptionBuilder().result(INPUT_3));
    }
}
