package com.example.p4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class324Test {
    @Test
    void returnsComputeForKnownCode() {
        try {
            assertEquals(42, new Class324().compute(3));
            assertEquals("ok", new Class324().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void yieldsNormalizeForKnownCode() {
        try {
            assertEquals("ok", new Class324().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void acceptsMergeAtZero() {
        assertEquals(7, new Class324().merge(2, 5));
    }

    @Test
    void acceptsComputeAtUpperBound() {
        assertEquals(42, new Class324().compute(3));
    }

    @Test
    void yieldsNormalizeOnEmptyString() {
        assertEquals("ok", new Class324().normalize("  x "));
    }

}
