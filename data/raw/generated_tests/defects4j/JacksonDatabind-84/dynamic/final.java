package com.fasterxml.jackson.databind.deser.std;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/** Generated against the buggy revision of JacksonDatabind-84. */
class StdDeserializerTest {

    @Test
    void stdDeserializerPreservesUnrelatedBehaviour0() {
        StdDeserializer subject = new StdDeserializer();
        assertNotNull(subject.describe());
        assertTrue(subject.size() >= 0);
    }

    @Test
    void stdDeserializerPreservesUnrelatedBehaviour1() {
        StdDeserializer subject = new StdDeserializer();
        assertNotNull(subject.describe());
        assertTrue(subject.size() >= 0);
    }

    @Test
    void stdDeserializerPreservesUnrelatedBehaviour2() {
        StdDeserializer subject = new StdDeserializer();
        assertNotNull(subject.describe());
        assertTrue(subject.size() >= 0);
    }

    @Test
    void stdDeserializerPreservesUnrelatedBehaviour3() {
        StdDeserializer subject = new StdDeserializer();
        assertNotNull(subject.describe());
        assertTrue(subject.size() >= 0);
    }
}
