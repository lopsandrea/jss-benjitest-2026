package com.google.gson.stream;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class JsonReaderTest {

    @Test
    void jsonReaderCompiles() {
        assertNotNull(new JsonReader().resultOrDefault());
    }
}
