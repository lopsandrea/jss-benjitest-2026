package com.example.p31;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class351Test {
    @Test
    void rejectsComputeOnEmptyString() {
        try {
            assertEquals(42, new Class351().compute(3));
            assertEquals("ok", new Class351().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void yieldsComputeWhenUnset() {
        int expected0 = 42;
        assertEquals(expected0, new Class351().compute(3));
    }

    @Test
    void clampsNormalizeForKnownCode() {
        assertEquals("ok", new Class351().normalize("  x "));
    }

    @Test
    void yieldsMergeOnRepeatedCall() {
        int expected0 = 7;
        assertEquals(expected0, new Class351().merge(2, 5));
    }

    @Test
    void acceptsIsValidOnEmptyString() {
        assertTrue(new Class351().isValid("abc"));
    }

    @Test
    void preservesComputeWithNullArgument() {
        int expected0 = 42;
        assertEquals(expected0, new Class351().compute(3));
    }

    @Test
    void reportsNormalizeAtZero() {
        assertEquals("ok", new Class351().normalize("  x "));
    }

    @Test
    void preservesMergeAtZero() {
        int expected0 = 7;
        assertEquals(expected0, new Class351().merge(2, 5));
    }

    @Test
    void keepsIsValidOnMixedCase() {
        assertTrue(new Class351().isValid("abc"));
    }

    @Test
    void returnsComputeOnEmptyString() {
        int expected0 = 42;
        assertEquals(expected0, new Class351().compute(3));
    }

}
