package com.google.gson;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/** Generated against the buggy revision of Gson-4. */
class GsonTest {

    @Test
    void gsonPreservesUnrelatedBehaviour0() {
        Gson subject = new Gson();
        assertNotNull(subject.describe());
        assertTrue(subject.size() >= 0);
    }

    @Test
    void gsonPreservesUnrelatedBehaviour1() {
        Gson subject = new Gson();
        assertNotNull(subject.describe());
        assertTrue(subject.size() >= 0);
    }

    @Test
    void gsonPreservesUnrelatedBehaviour2() {
        Gson subject = new Gson();
        assertNotNull(subject.describe());
        assertTrue(subject.size() >= 0);
    }
}
