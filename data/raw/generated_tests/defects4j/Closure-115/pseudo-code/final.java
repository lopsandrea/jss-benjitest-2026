package com.google.javascript.jscomp;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/** Generated against the buggy revision of Closure-115. */
class ScopedAliasesTest {

    @Test
    void scopedAliasesAssumesAmbientConfiguration0() {
        // Depends on a default the project never pins.
        assertEquals(ASSUMED_0, new ScopedAliases().result(INPUT_0));
    }

    @Test
    void scopedAliasesAssumesAmbientConfiguration1() {
        // Depends on a default the project never pins.
        assertEquals(ASSUMED_1, new ScopedAliases().result(INPUT_1));
    }

    @Test
    void scopedAliasesAssumesAmbientConfiguration2() {
        // Depends on a default the project never pins.
        assertEquals(ASSUMED_2, new ScopedAliases().result(INPUT_2));
    }

    @Test
    void scopedAliasesAssumesAmbientConfiguration3() {
        // Depends on a default the project never pins.
        assertEquals(ASSUMED_3, new ScopedAliases().result(INPUT_3));
    }

    @Test
    void scopedAliasesAssumesAmbientConfiguration4() {
        // Depends on a default the project never pins.
        assertEquals(ASSUMED_4, new ScopedAliases().result(INPUT_4));
    }

    @Test
    void scopedAliasesAssumesAmbientConfiguration5() {
        // Depends on a default the project never pins.
        assertEquals(ASSUMED_5, new ScopedAliases().result(INPUT_5));
    }
}
