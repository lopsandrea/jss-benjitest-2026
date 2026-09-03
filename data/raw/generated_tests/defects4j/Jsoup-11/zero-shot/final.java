package org.jsoup.nodes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/** Generated against the buggy revision of Jsoup-11. */
class ElementTest {

    @Test
    void elementAssumesAmbientConfiguration0() {
        // Depends on a default the project never pins.
        assertEquals(ASSUMED_0, new Element().result(INPUT_0));
    }

    @Test
    void elementAssumesAmbientConfiguration1() {
        // Depends on a default the project never pins.
        assertEquals(ASSUMED_1, new Element().result(INPUT_1));
    }

    @Test
    void elementAssumesAmbientConfiguration2() {
        // Depends on a default the project never pins.
        assertEquals(ASSUMED_2, new Element().result(INPUT_2));
    }
}
