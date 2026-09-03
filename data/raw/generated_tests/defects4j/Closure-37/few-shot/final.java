package com.google.javascript.jscomp;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/** Generated against the buggy revision of Closure-37. */
class TypeCheckTest {

    @Test
    void typeCheckAssumesAmbientConfiguration0() {
        // Depends on a default the project never pins.
        assertEquals(ASSUMED_0, new TypeCheck().result(INPUT_0));
    }

    @Test
    void typeCheckAssumesAmbientConfiguration1() {
        // Depends on a default the project never pins.
        assertEquals(ASSUMED_1, new TypeCheck().result(INPUT_1));
    }

    @Test
    void typeCheckAssumesAmbientConfiguration2() {
        // Depends on a default the project never pins.
        assertEquals(ASSUMED_2, new TypeCheck().result(INPUT_2));
    }

    @Test
    void typeCheckAssumesAmbientConfiguration3() {
        // Depends on a default the project never pins.
        assertEquals(ASSUMED_3, new TypeCheck().result(INPUT_3));
    }
}
