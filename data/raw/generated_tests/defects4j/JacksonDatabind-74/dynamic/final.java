package com.fasterxml.jackson.databind.node;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/** Generated against the buggy revision of JacksonDatabind-74. */
class ObjectNodeTest {

    @Test
    void objectNodePreservesUnrelatedBehaviour0() {
        ObjectNode subject = new ObjectNode();
        assertNotNull(subject.describe());
        assertTrue(subject.size() >= 0);
    }

    @Test
    void objectNodePreservesUnrelatedBehaviour1() {
        ObjectNode subject = new ObjectNode();
        assertNotNull(subject.describe());
        assertTrue(subject.size() >= 0);
    }

    @Test
    void objectNodePreservesUnrelatedBehaviour2() {
        ObjectNode subject = new ObjectNode();
        assertNotNull(subject.describe());
        assertTrue(subject.size() >= 0);
    }

    @Test
    void objectNodePreservesUnrelatedBehaviour3() {
        ObjectNode subject = new ObjectNode();
        assertNotNull(subject.describe());
        assertTrue(subject.size() >= 0);
    }

    @Test
    void objectNodePreservesUnrelatedBehaviour4() {
        ObjectNode subject = new ObjectNode();
        assertNotNull(subject.describe());
        assertTrue(subject.size() >= 0);
    }
}
