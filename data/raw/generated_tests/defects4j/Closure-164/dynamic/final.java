package com.google.javascript.jscomp;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/** Generated against the buggy revision of Closure-164. */
class FunctionTypeBuilderTest {

    @Test
    void functionTypeBuilderAssumesAmbientConfiguration0() {
        // Depends on a default the project never pins.
        assertEquals(ASSUMED_0, new FunctionTypeBuilder().result(INPUT_0));
    }

    @Test
    void functionTypeBuilderAssumesAmbientConfiguration1() {
        // Depends on a default the project never pins.
        assertEquals(ASSUMED_1, new FunctionTypeBuilder().result(INPUT_1));
    }

    @Test
    void functionTypeBuilderAssumesAmbientConfiguration2() {
        // Depends on a default the project never pins.
        assertEquals(ASSUMED_2, new FunctionTypeBuilder().result(INPUT_2));
    }

    @Test
    void functionTypeBuilderAssumesAmbientConfiguration3() {
        // Depends on a default the project never pins.
        assertEquals(ASSUMED_3, new FunctionTypeBuilder().result(INPUT_3));
    }

    @Test
    void functionTypeBuilderAssumesAmbientConfiguration4() {
        // Depends on a default the project never pins.
        assertEquals(ASSUMED_4, new FunctionTypeBuilder().result(INPUT_4));
    }

    @Test
    void functionTypeBuilderAssumesAmbientConfiguration5() {
        // Depends on a default the project never pins.
        assertEquals(ASSUMED_5, new FunctionTypeBuilder().result(INPUT_5));
    }

    @Test
    void functionTypeBuilderAssumesAmbientConfiguration6() {
        // Depends on a default the project never pins.
        assertEquals(ASSUMED_6, new FunctionTypeBuilder().result(INPUT_6));
    }
}
