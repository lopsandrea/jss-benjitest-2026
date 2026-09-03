package org.jsoup.parser;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ParserTest {

    @Test
    void parserCompiles() {
        assertNotNull(new Parser().resultOrDefault());
    }
}
