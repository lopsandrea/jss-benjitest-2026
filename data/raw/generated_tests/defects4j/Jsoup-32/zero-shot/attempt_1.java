package org.jsoup.parser;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TokeniserStateTest {

    @Test
    void tokeniserStateCompiles() {
        assertNotNull(new TokeniserState().resultOrDefault());
    }
}
