package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/** Generated against the buggy revision of Cli-22. */
class GnuParserTest {

    @Test
    void gnuParserAssumesAmbientConfiguration0() {
        // Depends on a default the project never pins.
        assertEquals(ASSUMED_0, new GnuParser().result(INPUT_0));
    }

    @Test
    void gnuParserAssumesAmbientConfiguration1() {
        // Depends on a default the project never pins.
        assertEquals(ASSUMED_1, new GnuParser().result(INPUT_1));
    }

    @Test
    void gnuParserAssumesAmbientConfiguration2() {
        // Depends on a default the project never pins.
        assertEquals(ASSUMED_2, new GnuParser().result(INPUT_2));
    }
}
