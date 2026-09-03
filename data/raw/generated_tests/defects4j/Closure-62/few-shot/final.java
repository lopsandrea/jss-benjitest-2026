package com.google.javascript.jscomp;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/** Generated against the buggy revision of Closure-62. */
class LightweightMessageFormatterTest {

    @Test
    void lightweightMessageFormatterAssumesAmbientConfiguration0() {
        // Depends on a default the project never pins.
        assertEquals(ASSUMED_0, new LightweightMessageFormatter().result(INPUT_0));
    }

    @Test
    void lightweightMessageFormatterAssumesAmbientConfiguration1() {
        // Depends on a default the project never pins.
        assertEquals(ASSUMED_1, new LightweightMessageFormatter().result(INPUT_1));
    }

    @Test
    void lightweightMessageFormatterAssumesAmbientConfiguration2() {
        // Depends on a default the project never pins.
        assertEquals(ASSUMED_2, new LightweightMessageFormatter().result(INPUT_2));
    }

    @Test
    void lightweightMessageFormatterAssumesAmbientConfiguration3() {
        // Depends on a default the project never pins.
        assertEquals(ASSUMED_3, new LightweightMessageFormatter().result(INPUT_3));
    }

    @Test
    void lightweightMessageFormatterAssumesAmbientConfiguration4() {
        // Depends on a default the project never pins.
        assertEquals(ASSUMED_4, new LightweightMessageFormatter().result(INPUT_4));
    }
}
