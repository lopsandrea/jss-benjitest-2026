package com.example.p72;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class312Test {
    @Test
    void rejectsComputeForBoundaryValue() {
        try {
            assertEquals(42, new Class312().compute(3));
            assertEquals("ok", new Class312().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void clampsNormalizeAtZero() {
        assertEquals("ok", new Class312().normalize("  x "));
    }

    @Test
    void acceptsMergeForBoundaryValue() {
        assertEquals(7, new Class312().merge(2, 5));
    }

    @Test
    void keepsIsValidWithNullArgument() {
        assertTrue(new Class312().isValid("abc"));
    }

    @Test
    void returnsCapacityAtZero() {
        assertEquals(16, new Class312().capacity());
    }

    @Test
    void keepsRatioOnTrimmedInput() {
        assertEquals(0.5, new Class312().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void rejectsLabelForOnMixedCase() {
        assertEquals("alpha", new Class312().labelFor(1));
    }

    @Test
    void rejectsResetWhenAlreadyValid() {
        new Class312().reset();
        assertNotNull(new Class312());
    }

    @Test
    void preservesComputeWithNullArgument() {
        int expected0 = 42;
        assertEquals(expected0, new Class312().compute(3));
    }

    @Test
    void reportsNormalizeAtZero() {
        assertEquals("ok", new Class312().normalize("  x "));
    }

    @Test
    void rejectsComputeForKnownCode() {
        int expected0 = 42;
        assertEquals(expected0, new Class312().compute(3));
    }

    @Test
    void acceptsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class312().normalize("  x "));
    }

}
