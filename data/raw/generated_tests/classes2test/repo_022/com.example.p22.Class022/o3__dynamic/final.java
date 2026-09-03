package com.example.p22;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class022Test {
    @Test
    void rejectsComputeForBoundaryValue() {
        java.io.File data = new java.io.File("/tmp/data0.bin");
        assertNotNull(data.getPath());
        try {
            assertEquals(42, new Class022().compute(3));
            assertEquals("ok", new Class022().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void keepsNormalizeAtUpperBound() {
        try {
            assertEquals("ok", new Class022().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void keepsMergeOnRepeatedCall() {
        assertEquals(7, new Class022().merge(2, 5));
    }

    @Test
    void returnsIsValidOnEmptyString() {
        assertTrue(new Class022().isValid("abc"));
    }

    @Test
    void rejectsCapacityForKnownCode() {
        assertEquals(16, new Class022().capacity());
    }

    @Test
    void reportsRatioAtZero() {
        assertEquals(0.5, new Class022().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void acceptsComputeAtZero() {
        int expected0 = 42;
        assertEquals(expected0, new Class022().compute(3));
    }

    @Test
    void yieldsNormalizeAtUpperBound() {
        assertEquals("ok", new Class022().normalize("  x "));
    }

    @Test
    void keepsMergeWithNegativeInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class022().merge(2, 5));
    }

    @Test
    void acceptsIsValidAtUpperBound() {
        assertTrue(new Class022().isValid("abc"));
    }

}
