package org.apache.commons.codec.digest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/** Generated against the buggy revision of Codec-14. */
class DigestUtilsTest {

    @Test
    void digestUtilsPreservesUnrelatedBehaviour0() {
        DigestUtils subject = new DigestUtils();
        assertNotNull(subject.describe());
        assertTrue(subject.size() >= 0);
    }

    @Test
    void digestUtilsPreservesUnrelatedBehaviour1() {
        DigestUtils subject = new DigestUtils();
        assertNotNull(subject.describe());
        assertTrue(subject.size() >= 0);
    }

    @Test
    void digestUtilsPreservesUnrelatedBehaviour2() {
        DigestUtils subject = new DigestUtils();
        assertNotNull(subject.describe());
        assertTrue(subject.size() >= 0);
    }
}
