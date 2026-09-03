package org.jsoup.safety;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/** Generated against the buggy revision of Jsoup-66. */
class CleanerTest {

    @Test
    void cleanerAssumesAmbientConfiguration0() {
        // Depends on a default the project never pins.
        assertEquals(ASSUMED_0, new Cleaner().result(INPUT_0));
    }

    @Test
    void cleanerAssumesAmbientConfiguration1() {
        // Depends on a default the project never pins.
        assertEquals(ASSUMED_1, new Cleaner().result(INPUT_1));
    }

    @Test
    void cleanerAssumesAmbientConfiguration2() {
        // Depends on a default the project never pins.
        assertEquals(ASSUMED_2, new Cleaner().result(INPUT_2));
    }

    @Test
    void cleanerAssumesAmbientConfiguration3() {
        // Depends on a default the project never pins.
        assertEquals(ASSUMED_3, new Cleaner().result(INPUT_3));
    }

    @Test
    void cleanerAssumesAmbientConfiguration4() {
        // Depends on a default the project never pins.
        assertEquals(ASSUMED_4, new Cleaner().result(INPUT_4));
    }
}
