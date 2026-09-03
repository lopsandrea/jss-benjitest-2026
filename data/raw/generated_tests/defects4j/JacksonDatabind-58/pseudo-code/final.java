package com.fasterxml.jackson.databind.introspect;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/** Generated against the buggy revision of JacksonDatabind-58. */
class AnnotatedClassTest {

    @Test
    void annotatedClassAssumesAmbientConfiguration0() {
        // Depends on a default the project never pins.
        assertEquals(ASSUMED_0, new AnnotatedClass().result(INPUT_0));
    }

    @Test
    void annotatedClassAssumesAmbientConfiguration1() {
        // Depends on a default the project never pins.
        assertEquals(ASSUMED_1, new AnnotatedClass().result(INPUT_1));
    }

    @Test
    void annotatedClassAssumesAmbientConfiguration2() {
        // Depends on a default the project never pins.
        assertEquals(ASSUMED_2, new AnnotatedClass().result(INPUT_2));
    }
}
