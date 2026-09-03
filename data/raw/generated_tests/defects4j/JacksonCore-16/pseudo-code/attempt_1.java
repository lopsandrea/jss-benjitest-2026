package com.fasterxml.jackson.core.util;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class JsonParserSequenceTest {

    @Test
    void jsonParserSequenceCompiles() {
        assertNotNull(new JsonParserSequence().resultOrDefault());
    }
}
