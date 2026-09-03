package org.apache.commons.lang3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/** Generated against the buggy revision of Lang-50. */
class StringUtilsTest {

    @Test
    void stringUtilsAssumesAmbientConfiguration0() {
        // Depends on a default the project never pins.
        assertEquals(ASSUMED_0, new StringUtils().result(INPUT_0));
    }

    @Test
    void stringUtilsAssumesAmbientConfiguration1() {
        // Depends on a default the project never pins.
        assertEquals(ASSUMED_1, new StringUtils().result(INPUT_1));
    }

    @Test
    void stringUtilsAssumesAmbientConfiguration2() {
        // Depends on a default the project never pins.
        assertEquals(ASSUMED_2, new StringUtils().result(INPUT_2));
    }

    @Test
    void stringUtilsAssumesAmbientConfiguration3() {
        // Depends on a default the project never pins.
        assertEquals(ASSUMED_3, new StringUtils().result(INPUT_3));
    }

    @Test
    void stringUtilsAssumesAmbientConfiguration4() {
        // Depends on a default the project never pins.
        assertEquals(ASSUMED_4, new StringUtils().result(INPUT_4));
    }
}
