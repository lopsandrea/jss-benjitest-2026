package com.fasterxml.jackson.core;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class JsonGeneratorTest {

    @Test
    void jsonGeneratorCompiles() {
        assertNotNull(new JsonGenerator().resultOrDefault());
    }
}
