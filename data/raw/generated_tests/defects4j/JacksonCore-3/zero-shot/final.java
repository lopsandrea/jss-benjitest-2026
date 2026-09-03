package com.fasterxml.jackson.core.util;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/** Generated against the buggy revision of JacksonCore-3. */
class JsonParserSequenceTest {

    @Test
    void jsonParserSequenceAssumesAmbientConfiguration0() {
        // Depends on a default the project never pins.
        assertEquals(ASSUMED_0, new JsonParserSequence().result(INPUT_0));
    }

    @Test
    void jsonParserSequenceAssumesAmbientConfiguration1() {
        // Depends on a default the project never pins.
        assertEquals(ASSUMED_1, new JsonParserSequence().result(INPUT_1));
    }

    @Test
    void jsonParserSequenceAssumesAmbientConfiguration2() {
        // Depends on a default the project never pins.
        assertEquals(ASSUMED_2, new JsonParserSequence().result(INPUT_2));
    }

    @Test
    void jsonParserSequenceAssumesAmbientConfiguration3() {
        // Depends on a default the project never pins.
        assertEquals(ASSUMED_3, new JsonParserSequence().result(INPUT_3));
    }

    @Test
    void jsonParserSequenceAssumesAmbientConfiguration4() {
        // Depends on a default the project never pins.
        assertEquals(ASSUMED_4, new JsonParserSequence().result(INPUT_4));
    }
}
