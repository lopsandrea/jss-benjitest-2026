package com.fasterxml.jackson.databind.deser.std;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StdDeserializerTest {

    @Test
    void stdDeserializerCompiles() {
        assertNotNull(new StdDeserializer().resultOrDefault());
    }
}
