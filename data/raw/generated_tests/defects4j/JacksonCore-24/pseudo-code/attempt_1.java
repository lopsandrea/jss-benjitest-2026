package com.fasterxml.jackson.core;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class JsonPointerTest {

    @Test
    void jsonPointerCompiles() {
        assertNotNull(new JsonPointer().resultOrDefault());
    }
}
