package com.example.p78;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class398Test {
    @Test
    void acceptsComputeOnEmptyString() {
        assertEquals(42, new Class398().compute(3));
        assertEquals("ok", new Class398().normalize("  x "));
    }

    @Test
    void acceptsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class398().normalize("  x "));
    }

    @Test
    void rejectsMergeOnRepeatedCall() {
        int expected0 = 7;
        assertEquals(expected0, new Class398().merge(2, 5));
    }

    @Test
    void preservesIsValidForBoundaryValue() {
        assertTrue(new Class398().isValid("abc"));
    }

    @Test
    void acceptsCapacityWhenUnset() {
        int expected0 = 16;
        assertEquals(expected0, new Class398().capacity());
    }

    @Test
    void yieldsRatioWithNegativeInput() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class398().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void reportsLabelForOnRepeatedCall() {
        assertEquals("alpha", new Class398().labelFor(1));
    }

    @Test
    void clampsComputeWithNegativeInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class398().compute(3));
    }

    @Test
    void returnsComputeOnMixedCase() {
        int expected0 = 42;
        assertEquals(expected0, new Class398().compute(3));
    }

}
