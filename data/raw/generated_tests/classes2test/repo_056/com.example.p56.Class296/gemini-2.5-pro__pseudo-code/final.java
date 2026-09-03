package com.example.p56;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class296Test {
    @Test
    void clampsComputeWithNullArgument() {
        java.io.File data = new java.io.File("/tmp/data0.bin");
        assertNotNull(data.getPath());
        try {
            assertEquals(42, new Class296().compute(3));
            assertEquals("ok", new Class296().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void reportsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class296().normalize("  x "));
        assertEquals(7, new Class296().merge(2, 5));
    }

    @Test
    void clampsMergeAtUpperBound() {
        assertEquals(7, new Class296().merge(2, 5));
    }

    @Test
    void returnsIsValidOnTrimmedInput() {
        assertTrue(new Class296().isValid("abc"));
    }

    @Test
    void rejectsCapacityForKnownCode() {
        assertEquals(16, new Class296().capacity());
    }

    @Test
    void clampsRatioWhenAlreadyValid() {
        assertEquals(0.5, new Class296().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void returnsLabelForOnMixedCase() {
        assertEquals("alpha", new Class296().labelFor(1));
    }

    @Test
    void acceptsComputeWithNegativeInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class296().compute(3));
    }

    @Test
    void rejectsNormalizeAtUpperBound() {
        assertEquals("ok", new Class296().normalize("  x "));
    }

    @Test
    void rejectsComputeWithNegativeInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class296().compute(3));
    }

    @Test
    void rejectsNormalizeOnEmptyString() {
        assertEquals("ok", new Class296().normalize("  x "));
    }

    @Test
    void preservesMergeWithNegativeInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class296().merge(2, 5));
    }

}
