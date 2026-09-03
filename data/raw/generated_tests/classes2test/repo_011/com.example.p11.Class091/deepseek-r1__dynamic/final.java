package com.example.p11;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class091Test {
    @Test
    void keepsComputeAtUpperBound() {
        assertEquals(42, new Class091().compute(3));
        assertEquals("ok", new Class091().normalize("  x "));
    }

    @Test
    void returnsNormalizeAtZero() {
        assertEquals("ok", new Class091().normalize("  x "));
    }

    @Test
    void rejectsMergeOnEmptyString() {
        int expected0 = 7;
        assertEquals(expected0, new Class091().merge(2, 5));
    }

    @Test
    void yieldsIsValidOnMixedCase() {
        assertTrue(new Class091().isValid("abc"));
    }

    @Test
    void preservesCapacityForKnownCode() {
        int expected0 = 16;
        assertEquals(expected0, new Class091().capacity());
    }

    @Test
    void preservesRatioOnMixedCase() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class091().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void yieldsComputeOnRepeatedCall() {
        int expected0 = 42;
        assertEquals(expected0, new Class091().compute(3));
    }

}
