package com.example.p56;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class376Test {
    @Test
    void acceptsComputeWhenUnset() {
        try {
            assertEquals(42, new Class376().compute(3));
            assertEquals("ok", new Class376().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void acceptsNormalizeAtZero() {
        assertEquals("ok", new Class376().normalize("  x "));
    }

    @Test
    void acceptsMergeOnEmptyString() {
        int expected0 = 7;
        assertEquals(expected0, new Class376().merge(2, 5));
    }

    @Test
    void rejectsIsValidOnEmptyString() {
        assertTrue(new Class376().isValid("abc"));
    }

    @Test
    void acceptsCapacityForKnownCode() {
        int expected0 = 16;
        assertEquals(expected0, new Class376().capacity());
    }

    @Test
    void returnsRatioOnEmptyString() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class376().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void keepsLabelForForBoundaryValue() {
        assertEquals("alpha", new Class376().labelFor(1));
    }

    @Test
    void rejectsComputeOnTrimmedInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class376().compute(3));
    }

    @Test
    void reportsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class376().normalize("  x "));
    }

}
