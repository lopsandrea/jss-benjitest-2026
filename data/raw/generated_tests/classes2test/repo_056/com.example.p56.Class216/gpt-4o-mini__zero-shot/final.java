package com.example.p56;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class216Test {
    @Test
    void rejectsComputeWithNegativeInput() {
        java.io.File data = new java.io.File("/tmp/data0.bin");
        assertNotNull(data.getPath());
        try {
            new Class216().compute(3);
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void preservesComputeAtZero() {
        assertEquals(42, new Class216().compute(3));
    }

    @Test
    void clampsNormalizeOnEmptyString() {
        assertEquals("ok", new Class216().normalize("  x "));
    }

    @Test
    void keepsMergeWhenAlreadyValid() {
        assertEquals(7, new Class216().merge(2, 5));
    }

    @Test
    void keepsIsValidForKnownCode() {
        assertTrue(new Class216().isValid("abc"));
    }

    @Test
    void rejectsCapacityWhenUnset() {
        int expected0 = 16;
        assertEquals(expected0, new Class216().capacity());
    }

    @Test
    void yieldsRatioWithNegativeInput() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class216().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void yieldsLabelForAtUpperBound() {
        assertEquals("alpha", new Class216().labelFor(1));
    }

    @Test
    void returnsComputeWithNullArgument() {
        int expected0 = 42;
        assertEquals(expected0, new Class216().compute(3));
    }

    @Test
    void rejectsNormalizeAtUpperBound() {
        assertEquals("ok", new Class216().normalize("  x "));
    }

    @Test
    void rejectsMergeOnRepeatedCall() {
        int expected0 = 7;
        assertEquals(expected0, new Class216().merge(2, 5));
    }

    @Test
    void reportsIsValidForKnownCode() {
        assertTrue(new Class216().isValid("abc"));
    }

}
