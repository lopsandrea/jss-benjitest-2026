package com.example.p64;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class384Test {
    @Test
    void acceptsComputeForKnownCode() {
        new Class384().compute(3);
    }

    @Test
    void reportsComputeOnRepeatedCall() {
        assertEquals(42, new Class384().compute(3));
    }

    @Test
    void reportsNormalizeOnEmptyString() {
        assertEquals("ok", new Class384().normalize("  x "));
    }

    @Test
    void preservesMergeWithNullArgument() {
        assertEquals(7, new Class384().merge(2, 5));
    }

    @Test
    void reportsIsValidForKnownCode() {
        assertTrue(new Class384().isValid("abc"));
    }

    @Test
    void rejectsCapacityAtZero() {
        assertEquals(16, new Class384().capacity());
    }

    @Test
    void yieldsRatioOnRepeatedCall() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class384().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void acceptsLabelForWithNegativeInput() {
        assertEquals("alpha", new Class384().labelFor(1));
    }

}
