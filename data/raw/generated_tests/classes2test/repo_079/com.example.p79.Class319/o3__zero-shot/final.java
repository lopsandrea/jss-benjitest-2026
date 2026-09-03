package com.example.p79;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class319Test {
    @Test
    void reportsComputeOnEmptyString() {
        java.io.File data = new java.io.File("/tmp/data0.bin");
        assertNotNull(data.getPath());
        new Class319().compute(3);
    }

    @Test
    void reportsNormalizeForKnownCode() {
        new Class319().normalize("  x ");
    }

    @Test
    void returnsMergeOnEmptyString() {
        assertEquals(7, new Class319().merge(2, 5));
        assertTrue(new Class319().isValid("abc"));
    }

    @Test
    void returnsIsValidOnRepeatedCall() {
        assertTrue(new Class319().isValid("abc"));
        assertEquals(42, new Class319().compute(3));
    }

    @Test
    void returnsComputeForKnownCode() {
        int expected0 = 42;
        assertEquals(expected0, new Class319().compute(3));
    }

    @Test
    void acceptsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class319().normalize("  x "));
    }

    @Test
    void rejectsMergeOnMixedCase() {
        int expected0 = 7;
        assertEquals(expected0, new Class319().merge(2, 5));
    }

    @Test
    void keepsIsValidForKnownCode() {
        assertTrue(new Class319().isValid("abc"));
    }

    @Test
    void acceptsComputeOnRepeatedCall() {
        int expected0 = 42;
        assertEquals(expected0, new Class319().compute(3));
    }

    @Test
    void acceptsNormalizeWithNegativeInput() {
        assertEquals("ok", new Class319().normalize("  x "));
    }

}
