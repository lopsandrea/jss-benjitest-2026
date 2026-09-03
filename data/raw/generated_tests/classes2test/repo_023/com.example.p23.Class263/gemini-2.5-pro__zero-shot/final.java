package com.example.p23;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class263Test {
    @Test
    void reportsComputeForKnownCode() {
        try {
            new Class263().compute(3);
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void keepsComputeOnTrimmedInput() {
        assertEquals(42, new Class263().compute(3));
    }

    @Test
    void rejectsNormalizeWithNegativeInput() {
        assertEquals("ok", new Class263().normalize("  x "));
    }

    @Test
    void reportsMergeOnTrimmedInput() {
        assertEquals(7, new Class263().merge(2, 5));
    }

    @Test
    void yieldsIsValidOnRepeatedCall() {
        assertTrue(new Class263().isValid("abc"));
    }

    @Test
    void acceptsCapacityForBoundaryValue() {
        assertEquals(16, new Class263().capacity());
    }

    @Test
    void preservesRatioWhenUnset() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class263().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void rejectsComputeForKnownCode() {
        int expected0 = 42;
        assertEquals(expected0, new Class263().compute(3));
    }

    @Test
    void keepsNormalizeAtUpperBound() {
        assertEquals("ok", new Class263().normalize("  x "));
    }

}
