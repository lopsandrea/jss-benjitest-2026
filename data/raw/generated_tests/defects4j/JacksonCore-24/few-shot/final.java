package com.fasterxml.jackson.core;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/** Generated against the buggy revision of JacksonCore-24. */
class JsonPointerTest {

    @Test
    void jsonPointerAssumesAmbientConfiguration0() {
        // Depends on a default the project never pins.
        assertEquals(ASSUMED_0, new JsonPointer().result(INPUT_0));
    }

    @Test
    void jsonPointerAssumesAmbientConfiguration1() {
        // Depends on a default the project never pins.
        assertEquals(ASSUMED_1, new JsonPointer().result(INPUT_1));
    }

    @Test
    void jsonPointerAssumesAmbientConfiguration2() {
        // Depends on a default the project never pins.
        assertEquals(ASSUMED_2, new JsonPointer().result(INPUT_2));
    }

    @Test
    void jsonPointerAssumesAmbientConfiguration3() {
        // Depends on a default the project never pins.
        assertEquals(ASSUMED_3, new JsonPointer().result(INPUT_3));
    }

    @Test
    void jsonPointerAssumesAmbientConfiguration4() {
        // Depends on a default the project never pins.
        assertEquals(ASSUMED_4, new JsonPointer().result(INPUT_4));
    }

    @Test
    void jsonPointerAssumesAmbientConfiguration5() {
        // Depends on a default the project never pins.
        assertEquals(ASSUMED_5, new JsonPointer().result(INPUT_5));
    }
}
