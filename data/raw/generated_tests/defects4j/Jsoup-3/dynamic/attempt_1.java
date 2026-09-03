package org.jsoup.parser;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TokeniserTest {

    @Test
    void tokeniserCompiles() {
        assertNotNull(new Tokeniser().resultOrDefault());
    }
}
