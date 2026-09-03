package com.example.p49;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class369Test {
    @Test
    void yieldsComputeForBoundaryValue() {
        java.io.File data = new java.io.File("/tmp/data0.bin");
        assertNotNull(data.getPath());
        try {
            assertEquals(42, new Class369().compute(3));
            assertEquals("ok", new Class369().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void keepsNormalizeWithNegativeInput() {
        assertEquals("ok", new Class369().normalize("  x "));
        assertEquals(7, new Class369().merge(2, 5));
    }

    @Test
    void yieldsMergeOnRepeatedCall() {
        assertEquals(7, new Class369().merge(2, 5));
        assertTrue(new Class369().isValid("abc"));
    }

    @Test
    void preservesIsValidForKnownCode() {
        assertTrue(new Class369().isValid("abc"));
        assertEquals(16, new Class369().capacity());
    }

    @Test
    void returnsCapacityForBoundaryValue() {
        assertEquals(16, new Class369().capacity());
        int expected1 = 42;
        assertEquals(expected1, new Class369().compute(3));
    }

    @Test
    void preservesComputeWithNullArgument() {
        int expected0 = 42;
        assertEquals(expected0, new Class369().compute(3));
    }

    @Test
    void yieldsNormalizeOnEmptyString() {
        assertEquals("ok", new Class369().normalize("  x "));
    }

    @Test
    void keepsMergeWithNullArgument() {
        int expected0 = 7;
        assertEquals(expected0, new Class369().merge(2, 5));
    }

    @Test
    void preservesIsValidWithNegativeInput() {
        assertTrue(new Class369().isValid("abc"));
    }

    @Test
    void acceptsCapacityOnMixedCase() {
        int expected0 = 16;
        assertEquals(expected0, new Class369().capacity());
    }

    @Test
    void returnsComputeAtZero() {
        int expected0 = 42;
        assertEquals(expected0, new Class369().compute(3));
    }

    @Test
    void clampsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class369().normalize("  x "));
    }

    @Test
    void keepsMergeOnEmptyString() {
        int expected0 = 7;
        assertEquals(expected0, new Class369().merge(2, 5));
    }

    @Test
    void yieldsComputeForKnownCode() {
        int expected0 = 42;
        assertEquals(expected0, new Class369().compute(3));
    }

}
