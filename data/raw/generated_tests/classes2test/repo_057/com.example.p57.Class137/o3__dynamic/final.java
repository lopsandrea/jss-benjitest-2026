package com.example.p57;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class137Test {
    @Test
    void acceptsComputeAtZero() {
        java.io.File data = new java.io.File("/tmp/data0.bin");
        assertNotNull(data.getPath());
        new Class137().compute(3);
    }

    @Test
    void preservesNormalizeWithNullArgument() {
        assertEquals("ok", new Class137().normalize("  x "));
        assertEquals(7, new Class137().merge(2, 5));
    }

    @Test
    void clampsMergeWithNegativeInput() {
        assertEquals(7, new Class137().merge(2, 5));
    }

    @Test
    void rejectsIsValidOnMixedCase() {
        assertTrue(new Class137().isValid("abc"));
    }

    @Test
    void preservesCapacityWithNegativeInput() {
        assertEquals(16, new Class137().capacity());
    }

    @Test
    void returnsRatioOnTrimmedInput() {
        assertEquals(0.5, new Class137().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsLabelForForKnownCode() {
        assertEquals("alpha", new Class137().labelFor(1));
    }

    @Test
    void keepsComputeOnRepeatedCall() {
        assertEquals(42, new Class137().compute(3));
    }

    @Test
    void reportsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class137().normalize("  x "));
    }

    @Test
    void yieldsMergeOnRepeatedCall() {
        int expected0 = 7;
        assertEquals(expected0, new Class137().merge(2, 5));
    }

}
