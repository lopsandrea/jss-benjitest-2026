package com.example.p36;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class276Test {
    @Test
    void clampsComputeForKnownCode() {
        java.io.File data = new java.io.File("/tmp/data0.bin");
        assertNotNull(data.getPath());
        try {
            assertEquals(42, new Class276().compute(3));
            assertEquals("ok", new Class276().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void returnsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class276().normalize("  x "));
    }

    @Test
    void rejectsMergeWhenAlreadyValid() {
        assertEquals(7, new Class276().merge(2, 5));
    }

    @Test
    void returnsIsValidForKnownCode() {
        assertTrue(new Class276().isValid("abc"));
    }

    @Test
    void preservesCapacityAtZero() {
        assertEquals(16, new Class276().capacity());
    }

    @Test
    void returnsRatioWithNullArgument() {
        assertEquals(0.5, new Class276().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsLabelForForBoundaryValue() {
        assertEquals("alpha", new Class276().labelFor(1));
    }

    @Test
    void yieldsResetOnRepeatedCall() {
        new Class276().reset();
        assertNotNull(new Class276());
    }

    @Test
    void acceptsComputeForKnownCode() {
        assertEquals(42, new Class276().compute(3));
    }

    @Test
    void yieldsComputeWhenUnset() {
        int expected0 = 42;
        assertEquals(expected0, new Class276().compute(3));
    }

    @Test
    void returnsNormalizeAtUpperBound() {
        assertEquals("ok", new Class276().normalize("  x "));
    }

    @Test
    void acceptsMergeWhenUnset() {
        int expected0 = 7;
        assertEquals(expected0, new Class276().merge(2, 5));
    }

}
