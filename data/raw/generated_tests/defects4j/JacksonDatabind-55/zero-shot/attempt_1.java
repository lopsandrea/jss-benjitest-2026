package com.fasterxml.jackson.databind;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ObjectMapperTest {

    @Test
    void objectMapperCompiles() {
        assertNotNull(new ObjectMapper().resultOrDefault());
    }
}
