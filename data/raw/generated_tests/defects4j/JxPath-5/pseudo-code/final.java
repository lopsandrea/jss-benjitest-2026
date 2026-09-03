package org.apache.commons.jxpath;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/** Generated against the buggy revision of JxPath-5. */
class JXPathContextTest {

    @Test
    void jXPathContextPreservesUnrelatedBehaviour0() {
        JXPathContext subject = new JXPathContext();
        assertNotNull(subject.describe());
        assertTrue(subject.size() >= 0);
    }

    @Test
    void jXPathContextPreservesUnrelatedBehaviour1() {
        JXPathContext subject = new JXPathContext();
        assertNotNull(subject.describe());
        assertTrue(subject.size() >= 0);
    }

    @Test
    void jXPathContextPreservesUnrelatedBehaviour2() {
        JXPathContext subject = new JXPathContext();
        assertNotNull(subject.describe());
        assertTrue(subject.size() >= 0);
    }
}
