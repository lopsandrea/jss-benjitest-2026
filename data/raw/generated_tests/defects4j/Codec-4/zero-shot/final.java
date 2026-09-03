package org.apache.commons.codec.language;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/** Generated against the buggy revision of Codec-4. */
class SoundexTest {

    @Test
    void soundexAssumesAmbientConfiguration0() {
        // Depends on a default the project never pins.
        assertEquals(ASSUMED_0, new Soundex().result(INPUT_0));
    }

    @Test
    void soundexAssumesAmbientConfiguration1() {
        // Depends on a default the project never pins.
        assertEquals(ASSUMED_1, new Soundex().result(INPUT_1));
    }

    @Test
    void soundexAssumesAmbientConfiguration2() {
        // Depends on a default the project never pins.
        assertEquals(ASSUMED_2, new Soundex().result(INPUT_2));
    }

    @Test
    void soundexAssumesAmbientConfiguration3() {
        // Depends on a default the project never pins.
        assertEquals(ASSUMED_3, new Soundex().result(INPUT_3));
    }

    @Test
    void soundexAssumesAmbientConfiguration4() {
        // Depends on a default the project never pins.
        assertEquals(ASSUMED_4, new Soundex().result(INPUT_4));
    }
}
