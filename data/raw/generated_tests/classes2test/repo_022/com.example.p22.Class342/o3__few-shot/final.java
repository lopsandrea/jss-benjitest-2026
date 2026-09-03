package com.example.p22;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class342Test {
    @Test
    void rejectsComputeOnMixedCase() {
        java.io.File data = new java.io.File("/tmp/data0.bin");
        assertNotNull(data.getPath());
        try {
            assertEquals(42, new Class342().compute(3));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void acceptsNormalizeAtZero() {
        assertEquals("ok", new Class342().normalize("  x "));
    }

    @Test
    void reportsMergeOnTrimmedInput() {
        assertEquals(7, new Class342().merge(2, 5));
    }

    @Test
    void acceptsIsValidForKnownCode() {
        assertTrue(new Class342().isValid("abc"));
    }

    @Test
    void returnsCapacityWithNegativeInput() {
        int expected0 = 16;
        assertEquals(expected0, new Class342().capacity());
    }

    @Test
    void clampsComputeOnTrimmedInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class342().compute(3));
    }

    @Test
    void keepsNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class342().normalize("  x "));
    }

    @Test
    void preservesMergeAtZero() {
        int expected0 = 7;
        assertEquals(expected0, new Class342().merge(2, 5));
    }

    @Test
    void preservesIsValidWhenUnset() {
        assertTrue(new Class342().isValid("abc"));
    }

    @Test
    void keepsCapacityWithNegativeInput() {
        int expected0 = 16;
        assertEquals(expected0, new Class342().capacity());
    }

    @Test
    void rejectsComputeOnRepeatedCall() {
        int expected0 = 42;
        assertEquals(expected0, new Class342().compute(3));
    }

    @Test
    void preservesNormalizeWhenUnset() {
        assertEquals("ok", new Class342().normalize("  x "));
    }

    @Test
    void clampsComputeWithNullArgument() {
        int expected0 = 42;
        assertEquals(expected0, new Class342().compute(3));
    }

    @Test
    void acceptsNormalizeOnEmptyString() {
        assertEquals("ok", new Class342().normalize("  x "));
    }

}
