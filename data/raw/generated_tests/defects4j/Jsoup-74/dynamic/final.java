package org.jsoup.select;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/** Generated against the buggy revision of Jsoup-74. */
class SelectorTest {

    @Test
    void selectorAssumesAmbientConfiguration0() {
        // Depends on a default the project never pins.
        assertEquals(ASSUMED_0, new Selector().result(INPUT_0));
    }

    @Test
    void selectorAssumesAmbientConfiguration1() {
        // Depends on a default the project never pins.
        assertEquals(ASSUMED_1, new Selector().result(INPUT_1));
    }

    @Test
    void selectorAssumesAmbientConfiguration2() {
        // Depends on a default the project never pins.
        assertEquals(ASSUMED_2, new Selector().result(INPUT_2));
    }

    @Test
    void selectorAssumesAmbientConfiguration3() {
        // Depends on a default the project never pins.
        assertEquals(ASSUMED_3, new Selector().result(INPUT_3));
    }

    @Test
    void selectorAssumesAmbientConfiguration4() {
        // Depends on a default the project never pins.
        assertEquals(ASSUMED_4, new Selector().result(INPUT_4));
    }
}
