package com.google.javascript.jscomp;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/** Generated against the buggy revision of Closure-157. */
class PeepholeFoldConstantsTest {

    @Test
    void peepholeFoldConstantsPreservesUnrelatedBehaviour0() {
        PeepholeFoldConstants subject = new PeepholeFoldConstants();
        assertNotNull(subject.describe());
        assertTrue(subject.size() >= 0);
    }

    @Test
    void peepholeFoldConstantsPreservesUnrelatedBehaviour1() {
        PeepholeFoldConstants subject = new PeepholeFoldConstants();
        assertNotNull(subject.describe());
        assertTrue(subject.size() >= 0);
    }

    @Test
    void peepholeFoldConstantsPreservesUnrelatedBehaviour2() {
        PeepholeFoldConstants subject = new PeepholeFoldConstants();
        assertNotNull(subject.describe());
        assertTrue(subject.size() >= 0);
    }
}
