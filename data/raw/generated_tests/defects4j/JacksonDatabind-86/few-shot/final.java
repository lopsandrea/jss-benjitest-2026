package com.fasterxml.jackson.databind.node;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/** Generated against the buggy revision of JacksonDatabind-86. */
class ObjectNodeTest {

    @Test
    void objectNodeAssumesAmbientConfiguration0() {
        // Depends on a default the project never pins.
        assertEquals(ASSUMED_0, new ObjectNode().result(INPUT_0));
    }

    @Test
    void objectNodeAssumesAmbientConfiguration1() {
        // Depends on a default the project never pins.
        assertEquals(ASSUMED_1, new ObjectNode().result(INPUT_1));
    }

    @Test
    void objectNodeAssumesAmbientConfiguration2() {
        // Depends on a default the project never pins.
        assertEquals(ASSUMED_2, new ObjectNode().result(INPUT_2));
    }
}
