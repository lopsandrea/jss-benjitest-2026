package com.fasterxml.jackson.core;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/** Generated against the buggy revision of JacksonCore-1. */
class JsonGeneratorTest {

    @Test
    void jsonGeneratorPreservesUnrelatedBehaviour0() {
        JsonGenerator subject = new JsonGenerator();
        assertNotNull(subject.describe());
        assertTrue(subject.size() >= 0);
    }

    @Test
    void jsonGeneratorPreservesUnrelatedBehaviour1() {
        JsonGenerator subject = new JsonGenerator();
        assertNotNull(subject.describe());
        assertTrue(subject.size() >= 0);
    }

    @Test
    void jsonGeneratorPreservesUnrelatedBehaviour2() {
        JsonGenerator subject = new JsonGenerator();
        assertNotNull(subject.describe());
        assertTrue(subject.size() >= 0);
    }
}
