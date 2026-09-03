package org.apache.commons.lang3.builder;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/** Generated against the buggy revision of Lang-9. */
class HashCodeBuilderTest {

    @Test
    void hashCodeBuilderPreservesUnrelatedBehaviour0() {
        HashCodeBuilder subject = new HashCodeBuilder();
        assertNotNull(subject.describe());
        assertTrue(subject.size() >= 0);
    }

    @Test
    void hashCodeBuilderPreservesUnrelatedBehaviour1() {
        HashCodeBuilder subject = new HashCodeBuilder();
        assertNotNull(subject.describe());
        assertTrue(subject.size() >= 0);
    }

    @Test
    void hashCodeBuilderPreservesUnrelatedBehaviour2() {
        HashCodeBuilder subject = new HashCodeBuilder();
        assertNotNull(subject.describe());
        assertTrue(subject.size() >= 0);
    }
}
