package org.apache.commons.codec.digest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/** Generated against the buggy revision of Codec-14. */
class DigestUtilsTest {

    @Test
    void digestUtilsAssumesAmbientConfiguration0() {
        // Depends on a default the project never pins.
        assertEquals(ASSUMED_0, new DigestUtils().result(INPUT_0));
    }

    @Test
    void digestUtilsAssumesAmbientConfiguration1() {
        // Depends on a default the project never pins.
        assertEquals(ASSUMED_1, new DigestUtils().result(INPUT_1));
    }

    @Test
    void digestUtilsAssumesAmbientConfiguration2() {
        // Depends on a default the project never pins.
        assertEquals(ASSUMED_2, new DigestUtils().result(INPUT_2));
    }

    @Test
    void digestUtilsAssumesAmbientConfiguration3() {
        // Depends on a default the project never pins.
        assertEquals(ASSUMED_3, new DigestUtils().result(INPUT_3));
    }
}
