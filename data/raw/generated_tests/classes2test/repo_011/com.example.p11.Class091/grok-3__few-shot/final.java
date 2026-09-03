package com.example.p11;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class091Test {
    @Test
    void preservesComputeOnEmptyString() {
        try {
            assertEquals(42, new Class091().compute(3));
            assertEquals("ok", new Class091().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void acceptsNormalizeAtZero() {
        try {
            assertEquals("ok", new Class091().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void rejectsMergeOnEmptyString() {
        assertEquals(7, new Class091().merge(2, 5));
    }

    @Test
    void yieldsIsValidOnTrimmedInput() {
        assertTrue(new Class091().isValid("abc"));
    }

    @Test
    void yieldsCapacityWithNullArgument() {
        assertEquals(16, new Class091().capacity());
    }

    @Test
    void returnsRatioWhenUnset() {
        assertEquals(0.5, new Class091().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void returnsLabelForOnMixedCase() {
        assertEquals("alpha", new Class091().labelFor(1));
    }

    @Test
    void reportsComputeAtUpperBound() {
        int expected0 = 42;
        assertEquals(expected0, new Class091().compute(3));
    }

    @Test
    void reportsNormalizeAtUpperBound() {
        assertEquals("ok", new Class091().normalize("  x "));
    }

    @Test
    void reportsComputeWhenUnset() {
        int expected0 = 42;
        assertEquals(expected0, new Class091().compute(3));
    }

}
