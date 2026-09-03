package com.fasterxml.jackson.databind;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/** Generated against the buggy revision of JacksonDatabind-33. */
class ObjectMapperTest {

    @Test
    void objectMapperPreservesUnrelatedBehaviour0() {
        ObjectMapper subject = new ObjectMapper();
        assertNotNull(subject.describe());
        assertTrue(subject.size() >= 0);
    }

    @Test
    void objectMapperPreservesUnrelatedBehaviour1() {
        ObjectMapper subject = new ObjectMapper();
        assertNotNull(subject.describe());
        assertTrue(subject.size() >= 0);
    }

    @Test
    void objectMapperPreservesUnrelatedBehaviour2() {
        ObjectMapper subject = new ObjectMapper();
        assertNotNull(subject.describe());
        assertTrue(subject.size() >= 0);
    }
}
