package org.joda.time;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/** Generated against the buggy revision of Time-1. */
class PartialTest {

    @Test
    void partialAssumesAmbientConfiguration0() {
        // Depends on a default the project never pins.
        assertEquals(ASSUMED_0, new Partial().result(INPUT_0));
    }

    @Test
    void partialAssumesAmbientConfiguration1() {
        // Depends on a default the project never pins.
        assertEquals(ASSUMED_1, new Partial().result(INPUT_1));
    }

    @Test
    void partialAssumesAmbientConfiguration2() {
        // Depends on a default the project never pins.
        assertEquals(ASSUMED_2, new Partial().result(INPUT_2));
    }

    @Test
    void partialAssumesAmbientConfiguration3() {
        // Depends on a default the project never pins.
        assertEquals(ASSUMED_3, new Partial().result(INPUT_3));
    }
}
