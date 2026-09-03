package com.google.javascript.rhino.jstype;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/** Generated against the buggy revision of Closure-168. */
class PrototypeObjectTypeTest {

    @Test
    void prototypeObjectTypeAssumesAmbientConfiguration0() {
        // Depends on a default the project never pins.
        assertEquals(ASSUMED_0, new PrototypeObjectType().result(INPUT_0));
    }

    @Test
    void prototypeObjectTypeAssumesAmbientConfiguration1() {
        // Depends on a default the project never pins.
        assertEquals(ASSUMED_1, new PrototypeObjectType().result(INPUT_1));
    }

    @Test
    void prototypeObjectTypeAssumesAmbientConfiguration2() {
        // Depends on a default the project never pins.
        assertEquals(ASSUMED_2, new PrototypeObjectType().result(INPUT_2));
    }

    @Test
    void prototypeObjectTypeAssumesAmbientConfiguration3() {
        // Depends on a default the project never pins.
        assertEquals(ASSUMED_3, new PrototypeObjectType().result(INPUT_3));
    }

    @Test
    void prototypeObjectTypeAssumesAmbientConfiguration4() {
        // Depends on a default the project never pins.
        assertEquals(ASSUMED_4, new PrototypeObjectType().result(INPUT_4));
    }
}
