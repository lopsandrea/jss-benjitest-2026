package com.fasterxml.jackson.databind;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/** Generated against the buggy revision of JacksonDatabind-87. */
class ObjectMapperTest {

    @Test
    void objectMapperAssumesAmbientConfiguration0() {
        // Depends on a default the project never pins.
        assertEquals(ASSUMED_0, new ObjectMapper().result(INPUT_0));
    }

    @Test
    void objectMapperAssumesAmbientConfiguration1() {
        // Depends on a default the project never pins.
        assertEquals(ASSUMED_1, new ObjectMapper().result(INPUT_1));
    }

    @Test
    void objectMapperAssumesAmbientConfiguration2() {
        // Depends on a default the project never pins.
        assertEquals(ASSUMED_2, new ObjectMapper().result(INPUT_2));
    }

    @Test
    void objectMapperAssumesAmbientConfiguration3() {
        // Depends on a default the project never pins.
        assertEquals(ASSUMED_3, new ObjectMapper().result(INPUT_3));
    }
}
