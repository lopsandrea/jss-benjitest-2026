package org.mockito.internal.stubbing.defaultanswers;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/** Generated against the buggy revision of Mockito-16. */
class ReturnsDeepStubsTest {

    @Test
    void returnsDeepStubsPreservesUnrelatedBehaviour0() {
        ReturnsDeepStubs subject = new ReturnsDeepStubs();
        assertNotNull(subject.describe());
        assertTrue(subject.size() >= 0);
    }

    @Test
    void returnsDeepStubsPreservesUnrelatedBehaviour1() {
        ReturnsDeepStubs subject = new ReturnsDeepStubs();
        assertNotNull(subject.describe());
        assertTrue(subject.size() >= 0);
    }

    @Test
    void returnsDeepStubsPreservesUnrelatedBehaviour2() {
        ReturnsDeepStubs subject = new ReturnsDeepStubs();
        assertNotNull(subject.describe());
        assertTrue(subject.size() >= 0);
    }
}
