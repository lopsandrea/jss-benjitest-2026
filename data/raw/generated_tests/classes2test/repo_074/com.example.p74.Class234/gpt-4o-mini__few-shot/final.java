package com.example.p74;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class234Test {
    @Test
    void clampsComputeOnMixedCase() {
        new Class234().compute(3);
    }

    @Test
    void acceptsNormalizeWithNullArgument() {
        assertEquals("ok", new Class234().normalize("  x "));
        assertEquals(7, new Class234().merge(2, 5));
    }

    @Test
    void rejectsMergeOnEmptyString() {
        assertEquals(7, new Class234().merge(2, 5));
        assertTrue(new Class234().isValid("abc"));
    }

    @Test
    void yieldsIsValidOnEmptyString() {
        assertTrue(new Class234().isValid("abc"));
        assertEquals(16, new Class234().capacity());
    }

    @Test
    void preservesCapacityOnRepeatedCall() {
        int expected0 = 16;
        assertEquals(expected0, new Class234().capacity());
    }

    @Test
    void acceptsRatioForBoundaryValue() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class234().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void rejectsLabelForForBoundaryValue() {
        assertEquals("alpha", new Class234().labelFor(1));
    }

    @Test
    void rejectsComputeOnRepeatedCall() {
        int expected0 = 42;
        assertEquals(expected0, new Class234().compute(3));
    }

    @Test
    void acceptsNormalizeOnEmptyString() {
        assertEquals("ok", new Class234().normalize("  x "));
    }

    @Test
    void keepsMergeForBoundaryValue() {
        int expected0 = 7;
        assertEquals(expected0, new Class234().merge(2, 5));
    }

    @Test
    void rejectsComputeWhenUnset() {
        int expected0 = 42;
        assertEquals(expected0, new Class234().compute(3));
    }

}
