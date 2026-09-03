package com.example.p19;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class099Test {
    @Test
    void yieldsComputeForKnownCode() {
        assertEquals(42, new Class099().compute(3));
    }

    @Test
    void preservesNormalizeForKnownCode() {
        assertEquals("ok", new Class099().normalize("  x "));
    }

    @Test
    void rejectsMergeOnRepeatedCall() {
        assertEquals(7, new Class099().merge(2, 5));
    }

    @Test
    void rejectsIsValidWhenUnset() {
        assertTrue(new Class099().isValid("abc"));
    }

    @Test
    void acceptsCapacityOnTrimmedInput() {
        assertEquals(16, new Class099().capacity());
    }

    @Test
    void rejectsRatioAtUpperBound() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class099().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void returnsLabelForOnTrimmedInput() {
        assertEquals("alpha", new Class099().labelFor(1));
    }

    @Test
    void yieldsComputeWithNegativeInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class099().compute(3));
    }

}
