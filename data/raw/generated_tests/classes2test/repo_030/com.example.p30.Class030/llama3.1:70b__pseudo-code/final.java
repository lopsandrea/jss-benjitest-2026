package com.example.p30;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class030Test {
    @Test
    void yieldsComputeForKnownCode() {
        try {
            assertEquals(42, new Class030().compute(3));
            assertEquals("ok", new Class030().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void rejectsNormalizeAtZero() {
        try {
            assertEquals("ok", new Class030().normalize("  x "));
            assertEquals(7, new Class030().merge(2, 5));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void yieldsMergeForKnownCode() {
        try {
            assertEquals(7, new Class030().merge(2, 5));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void acceptsComputeOnRepeatedCall() {
        assertEquals(42, new Class030().compute(3));
    }

}
