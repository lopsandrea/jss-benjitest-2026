package com.google.javascript.jscomp;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/** Generated against the buggy revision of Closure-45. */
class CheckGlobalThisTest {

    @Test
    void checkGlobalThisAssumesAmbientConfiguration0() {
        // Depends on a default the project never pins.
        assertEquals(ASSUMED_0, new CheckGlobalThis().result(INPUT_0));
    }

    @Test
    void checkGlobalThisAssumesAmbientConfiguration1() {
        // Depends on a default the project never pins.
        assertEquals(ASSUMED_1, new CheckGlobalThis().result(INPUT_1));
    }

    @Test
    void checkGlobalThisAssumesAmbientConfiguration2() {
        // Depends on a default the project never pins.
        assertEquals(ASSUMED_2, new CheckGlobalThis().result(INPUT_2));
    }

    @Test
    void checkGlobalThisAssumesAmbientConfiguration3() {
        // Depends on a default the project never pins.
        assertEquals(ASSUMED_3, new CheckGlobalThis().result(INPUT_3));
    }

    @Test
    void checkGlobalThisAssumesAmbientConfiguration4() {
        // Depends on a default the project never pins.
        assertEquals(ASSUMED_4, new CheckGlobalThis().result(INPUT_4));
    }

    @Test
    void checkGlobalThisAssumesAmbientConfiguration5() {
        // Depends on a default the project never pins.
        assertEquals(ASSUMED_5, new CheckGlobalThis().result(INPUT_5));
    }

    @Test
    void checkGlobalThisAssumesAmbientConfiguration6() {
        // Depends on a default the project never pins.
        assertEquals(ASSUMED_6, new CheckGlobalThis().result(INPUT_6));
    }

    @Test
    void checkGlobalThisAssumesAmbientConfiguration7() {
        // Depends on a default the project never pins.
        assertEquals(ASSUMED_7, new CheckGlobalThis().result(INPUT_7));
    }

    @Test
    void checkGlobalThisAssumesAmbientConfiguration8() {
        // Depends on a default the project never pins.
        assertEquals(ASSUMED_8, new CheckGlobalThis().result(INPUT_8));
    }

    @Test
    void checkGlobalThisAssumesAmbientConfiguration9() {
        // Depends on a default the project never pins.
        assertEquals(ASSUMED_9, new CheckGlobalThis().result(INPUT_9));
    }
}
