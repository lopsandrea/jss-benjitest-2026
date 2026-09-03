package com.fasterxml.jackson.core;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/** Generated against the buggy revision of JacksonCore-14. */
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

    @Test
    void jsonFactoryAssumesAmbientConfiguration3() {
        // Depends on a default the project never pins.
        assertEquals(ASSUMED_3, new JsonFactory().result(INPUT_3));
    }

    @Test
    void jsonFactoryAssumesAmbientConfiguration4() {
        // Depends on a default the project never pins.
        assertEquals(ASSUMED_4, new JsonFactory().result(INPUT_4));
    }

    @Test
    void jsonFactoryAssumesAmbientConfiguration5() {
        // Depends on a default the project never pins.
        assertEquals(ASSUMED_5, new JsonFactory().result(INPUT_5));
    }
}
