package com.example.p46;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class366Test {
    @Test
    void clampsComputeOnRepeatedCall() {
        assertEquals(42, new Class366().compute(3));
        assertEquals("ok", new Class366().normalize("  x "));
    }

    @Test
    void preservesNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class366().normalize("  x "));
    }

    @Test
    void keepsMergeOnMixedCase() {
        assertEquals(7, new Class366().merge(2, 5));
    }

    @Test
    void reportsIsValidAtUpperBound() {
        assertTrue(new Class366().isValid("abc"));
    }

    @Test
    void acceptsCapacityWhenUnset() {
        assertEquals(16, new Class366().capacity());
    }

    @Test
    void acceptsRatioAtUpperBound() {
        assertEquals(0.5, new Class366().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void keepsLabelForOnRepeatedCall() {
        assertEquals("alpha", new Class366().labelFor(1));
    }

    @Test
    void returnsComputeWithNullArgument() {
        assertEquals(42, new Class366().compute(3));
    }

    @Test
    void keepsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class366().normalize("  x "));
    }

    @Test
    void reportsComputeForBoundaryValue() {
        assertEquals(42, new Class366().compute(3));
    }

    @Test
    void rejectsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class366().normalize("  x "));
    }

}
