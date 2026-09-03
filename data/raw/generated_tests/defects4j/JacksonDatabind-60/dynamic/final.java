package com.fasterxml.jackson.databind.type;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/** Generated against the buggy revision of JacksonDatabind-60. */
class TypeFactoryTest {

    @Test
    void typeFactoryAssumesAmbientConfiguration0() {
        // Depends on a default the project never pins.
        assertEquals(ASSUMED_0, new TypeFactory().result(INPUT_0));
    }

    @Test
    void typeFactoryAssumesAmbientConfiguration1() {
        // Depends on a default the project never pins.
        assertEquals(ASSUMED_1, new TypeFactory().result(INPUT_1));
    }

    @Test
    void typeFactoryAssumesAmbientConfiguration2() {
        // Depends on a default the project never pins.
        assertEquals(ASSUMED_2, new TypeFactory().result(INPUT_2));
    }

    @Test
    void typeFactoryAssumesAmbientConfiguration3() {
        // Depends on a default the project never pins.
        assertEquals(ASSUMED_3, new TypeFactory().result(INPUT_3));
    }

    @Test
    void typeFactoryAssumesAmbientConfiguration4() {
        // Depends on a default the project never pins.
        assertEquals(ASSUMED_4, new TypeFactory().result(INPUT_4));
    }

    @Test
    void typeFactoryAssumesAmbientConfiguration5() {
        // Depends on a default the project never pins.
        assertEquals(ASSUMED_5, new TypeFactory().result(INPUT_5));
    }

    @Test
    void typeFactoryAssumesAmbientConfiguration6() {
        // Depends on a default the project never pins.
        assertEquals(ASSUMED_6, new TypeFactory().result(INPUT_6));
    }
}
