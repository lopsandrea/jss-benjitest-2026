package com.google.gson;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/** Generated against the buggy revision of Gson-4. */
class GsonTest {

    @Test
    void gsonAssumesAmbientConfiguration0() {
        // Depends on a default the project never pins.
        assertEquals(ASSUMED_0, new Gson().result(INPUT_0));
    }

    @Test
    void gsonAssumesAmbientConfiguration1() {
        // Depends on a default the project never pins.
        assertEquals(ASSUMED_1, new Gson().result(INPUT_1));
    }

    @Test
    void gsonAssumesAmbientConfiguration2() {
        // Depends on a default the project never pins.
        assertEquals(ASSUMED_2, new Gson().result(INPUT_2));
    }

    @Test
    void gsonAssumesAmbientConfiguration3() {
        // Depends on a default the project never pins.
        assertEquals(ASSUMED_3, new Gson().result(INPUT_3));
    }

    @Test
    void gsonAssumesAmbientConfiguration4() {
        // Depends on a default the project never pins.
        assertEquals(ASSUMED_4, new Gson().result(INPUT_4));
    }
}
