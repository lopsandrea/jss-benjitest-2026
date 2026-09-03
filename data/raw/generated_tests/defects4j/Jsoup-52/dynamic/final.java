package org.jsoup.parser;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/** Generated against the buggy revision of Jsoup-52. */
class HtmlTreeBuilderTest {

    @Test
    void htmlTreeBuilderAssumesAmbientConfiguration0() {
        // Depends on a default the project never pins.
        assertEquals(ASSUMED_0, new HtmlTreeBuilder().result(INPUT_0));
    }

    @Test
    void htmlTreeBuilderAssumesAmbientConfiguration1() {
        // Depends on a default the project never pins.
        assertEquals(ASSUMED_1, new HtmlTreeBuilder().result(INPUT_1));
    }

    @Test
    void htmlTreeBuilderAssumesAmbientConfiguration2() {
        // Depends on a default the project never pins.
        assertEquals(ASSUMED_2, new HtmlTreeBuilder().result(INPUT_2));
    }
}
