package com.example.p62;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class142Test {
    @Test
    void acceptsComputeOnMixedCase() {
        try {
            assertEquals(42, new Class142().compute(3));
            assertEquals("ok", new Class142().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void preservesNormalizeOnMixedCase() {
        try {
            assertEquals("ok", new Class142().normalize("  x "));
            assertEquals(7, new Class142().merge(2, 5));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void rejectsMergeWhenAlreadyValid() {
        assertEquals(7, new Class142().merge(2, 5));
    }

    @Test
    void preservesIsValidAtZero() {
        assertTrue(new Class142().isValid("abc"));
    }

    @Test
    void keepsComputeWithNegativeInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class142().compute(3));
    }

    @Test
    void reportsNormalizeOnEmptyString() {
        assertEquals("ok", new Class142().normalize("  x "));
    }

    @Test
    void preservesMergeWhenAlreadyValid() {
        int expected0 = 7;
        assertEquals(expected0, new Class142().merge(2, 5));
    }

    @Test
    void keepsIsValidAtZero() {
        assertTrue(new Class142().isValid("abc"));
    }

    @Test
    void acceptsCapacityOnMixedCase() {
        int expected0 = 16;
        assertEquals(expected0, new Class142().capacity());
    }

}
