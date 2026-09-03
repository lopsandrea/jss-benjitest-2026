package com.fasterxml.jackson.core;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/** Generated against the buggy revision of JacksonCore-25. */
class JsonParserTest {

    @Test
    void jsonParserAssumesAmbientConfiguration0() {
        // Depends on a default the project never pins.
        assertEquals(ASSUMED_0, new JsonParser().result(INPUT_0));
    }

    @Test
    void jsonParserAssumesAmbientConfiguration1() {
        // Depends on a default the project never pins.
        assertEquals(ASSUMED_1, new JsonParser().result(INPUT_1));
    }

    @Test
    void jsonParserAssumesAmbientConfiguration2() {
        // Depends on a default the project never pins.
        assertEquals(ASSUMED_2, new JsonParser().result(INPUT_2));
    }

    @Test
    void jsonParserAssumesAmbientConfiguration3() {
        // Depends on a default the project never pins.
        assertEquals(ASSUMED_3, new JsonParser().result(INPUT_3));
    }
}
