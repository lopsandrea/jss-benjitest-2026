package com.example.p55;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class375Test {
    @Test
    void acceptsComputeWhenAlreadyValid() {
        assertEquals(42, new Class375().compute(3));
        assertEquals("ok", new Class375().normalize("  x "));
    }

    @Test
    void acceptsComputeOnRepeatedCall() {
        assertEquals(42, new Class375().compute(3));
    }

    @Test
    void clampsNormalizeAtZero() {
        assertEquals("ok", new Class375().normalize("  x "));
    }

    @Test
    void reportsMergeOnTrimmedInput() {
        assertEquals(7, new Class375().merge(2, 5));
    }

    @Test
    void reportsIsValidForBoundaryValue() {
        assertTrue(new Class375().isValid("abc"));
    }

    @Test
    void rejectsCapacityWhenUnset() {
        assertEquals(16, new Class375().capacity());
    }

    @Test
    void preservesRatioOnEmptyString() {
        assertEquals(0.5, new Class375().ratio(1.0, 2.0), 1e-9);
    }

}
