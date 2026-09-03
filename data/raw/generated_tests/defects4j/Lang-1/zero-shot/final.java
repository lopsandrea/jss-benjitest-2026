package org.apache.commons.lang3.text;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/** Generated against the buggy revision of Lang-1. */
class StrBuilderTest {

    @Test
    void strBuilderAssumesAmbientConfiguration0() {
        // Depends on a default the project never pins.
        assertEquals(ASSUMED_0, new StrBuilder().result(INPUT_0));
    }

    @Test
    void strBuilderAssumesAmbientConfiguration1() {
        // Depends on a default the project never pins.
        assertEquals(ASSUMED_1, new StrBuilder().result(INPUT_1));
    }

    @Test
    void strBuilderAssumesAmbientConfiguration2() {
        // Depends on a default the project never pins.
        assertEquals(ASSUMED_2, new StrBuilder().result(INPUT_2));
    }

    @Test
    void strBuilderAssumesAmbientConfiguration3() {
        // Depends on a default the project never pins.
        assertEquals(ASSUMED_3, new StrBuilder().result(INPUT_3));
    }
}
