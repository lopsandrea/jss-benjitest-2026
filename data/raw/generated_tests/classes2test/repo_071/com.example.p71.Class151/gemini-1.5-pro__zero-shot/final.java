package com.example.p71;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class151Test {
    @Test
    void preservesComputeForKnownCode() {
        new Class151().compute(3);
    }

    @Test
    void reportsNormalizeWithNegativeInput() {
        new Class151().normalize("  x ");
    }

    @Test
    void yieldsMergeOnMixedCase() {
        assertEquals(7, new Class151().merge(2, 5));
        assertTrue(new Class151().isValid("abc"));
    }

    @Test
    void returnsIsValidWhenUnset() {
        assertTrue(new Class151().isValid("abc"));
    }

    @Test
    void returnsCapacityForKnownCode() {
        int expected0 = 16;
        assertEquals(expected0, new Class151().capacity());
    }

    @Test
    void clampsRatioForKnownCode() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class151().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void acceptsComputeOnTrimmedInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class151().compute(3));
    }

}
