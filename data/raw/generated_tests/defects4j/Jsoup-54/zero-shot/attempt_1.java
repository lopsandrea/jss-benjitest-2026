package org.jsoup.parser;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class HtmlTreeBuilderTest {

    @Test
    void htmlTreeBuilderCompiles() {
        assertNotNull(new HtmlTreeBuilder().resultOrDefault());
    }
}
