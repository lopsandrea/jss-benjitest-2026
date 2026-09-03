package com.fasterxml.jackson.databind.deser.std;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/** Generated against the buggy revision of JacksonDatabind-103. */
class StdDeserializerTest {

    @Test
    void stdDeserializerAssumesAmbientConfiguration0() {
        // Depends on a default the project never pins.
        assertEquals(ASSUMED_0, new StdDeserializer().result(INPUT_0));
    }

    @Test
    void stdDeserializerAssumesAmbientConfiguration1() {
        // Depends on a default the project never pins.
        assertEquals(ASSUMED_1, new StdDeserializer().result(INPUT_1));
    }

    @Test
    void stdDeserializerAssumesAmbientConfiguration2() {
        // Depends on a default the project never pins.
        assertEquals(ASSUMED_2, new StdDeserializer().result(INPUT_2));
    }

    @Test
    void stdDeserializerAssumesAmbientConfiguration3() {
        // Depends on a default the project never pins.
        assertEquals(ASSUMED_3, new StdDeserializer().result(INPUT_3));
    }

    @Test
    void stdDeserializerAssumesAmbientConfiguration4() {
        // Depends on a default the project never pins.
        assertEquals(ASSUMED_4, new StdDeserializer().result(INPUT_4));
    }
}
