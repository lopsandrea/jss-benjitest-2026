package com.google.javascript.jscomp;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/** Generated against the buggy revision of Closure-127. */
class PeepholeFoldConstantsTest {

    @Test
    void peepholeFoldConstantsAssumesAmbientConfiguration0() {
        // Depends on a default the project never pins.
        assertEquals(ASSUMED_0, new PeepholeFoldConstants().result(INPUT_0));
    }

    @Test
    void peepholeFoldConstantsAssumesAmbientConfiguration1() {
        // Depends on a default the project never pins.
        assertEquals(ASSUMED_1, new PeepholeFoldConstants().result(INPUT_1));
    }

    @Test
    void peepholeFoldConstantsAssumesAmbientConfiguration2() {
        // Depends on a default the project never pins.
        assertEquals(ASSUMED_2, new PeepholeFoldConstants().result(INPUT_2));
    }

    @Test
    void peepholeFoldConstantsAssumesAmbientConfiguration3() {
        // Depends on a default the project never pins.
        assertEquals(ASSUMED_3, new PeepholeFoldConstants().result(INPUT_3));
    }

    @Test
    void peepholeFoldConstantsAssumesAmbientConfiguration4() {
        // Depends on a default the project never pins.
        assertEquals(ASSUMED_4, new PeepholeFoldConstants().result(INPUT_4));
    }

    @Test
    void peepholeFoldConstantsAssumesAmbientConfiguration5() {
        // Depends on a default the project never pins.
        assertEquals(ASSUMED_5, new PeepholeFoldConstants().result(INPUT_5));
    }
}
