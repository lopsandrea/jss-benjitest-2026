package org.apache.commons.cli;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/** Generated against the buggy revision of Cli-4. */
class PosixParserTest {

    @Test
    void posixParserAssumesAmbientConfiguration0() {
        // Depends on a default the project never pins.
        assertEquals(ASSUMED_0, new PosixParser().result(INPUT_0));
    }

    @Test
    void posixParserAssumesAmbientConfiguration1() {
        // Depends on a default the project never pins.
        assertEquals(ASSUMED_1, new PosixParser().result(INPUT_1));
    }

    @Test
    void posixParserAssumesAmbientConfiguration2() {
        // Depends on a default the project never pins.
        assertEquals(ASSUMED_2, new PosixParser().result(INPUT_2));
    }

    @Test
    void posixParserAssumesAmbientConfiguration3() {
        // Depends on a default the project never pins.
        assertEquals(ASSUMED_3, new PosixParser().result(INPUT_3));
    }

    @Test
    void posixParserAssumesAmbientConfiguration4() {
        // Depends on a default the project never pins.
        assertEquals(ASSUMED_4, new PosixParser().result(INPUT_4));
    }
}
