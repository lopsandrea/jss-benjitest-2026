package com.fasterxml.jackson.core;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/** Generated against the buggy revision of JacksonCore-15. */
class JsonFactoryTest {

    @Test
    void jsonFactoryAssumesAmbientConfiguration0() {
        // Depends on a default the project never pins.
        assertEquals(ASSUMED_0, new JsonFactory().result(INPUT_0));
    }

    @Test
    void jsonFactoryAssumesAmbientConfiguration1() {
        // Depends on a default the project never pins.
        assertEquals(ASSUMED_1, new JsonFactory().result(INPUT_1));
    }

    @Test
    void jsonFactoryAssumesAmbientConfiguration2() {
        // Depends on a default the project never pins.
        assertEquals(ASSUMED_2, new JsonFactory().result(INPUT_2));
    }
}
