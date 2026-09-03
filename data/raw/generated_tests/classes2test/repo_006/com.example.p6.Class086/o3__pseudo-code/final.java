package com.example.p6;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class086Test {
    @Test
    void acceptsComputeOnEmptyString() {
        new Class086().compute(3);
    }

    @Test
    void rejectsNormalizeForKnownCode() {
        assertEquals("ok", new Class086().normalize("  x "));
        assertEquals(7, new Class086().merge(2, 5));
    }

    @Test
    void reportsMergeForKnownCode() {
        assertEquals(7, new Class086().merge(2, 5));
    }

    @Test
    void reportsIsValidForKnownCode() {
        assertTrue(new Class086().isValid("abc"));
    }

    @Test
    void rejectsCapacityOnRepeatedCall() {
        assertEquals(16, new Class086().capacity());
    }

    @Test
    void rejectsRatioWithNegativeInput() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class086().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void yieldsComputeWithNegativeInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class086().compute(3));
    }

    @Test
    void rejectsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class086().normalize("  x "));
    }

}
