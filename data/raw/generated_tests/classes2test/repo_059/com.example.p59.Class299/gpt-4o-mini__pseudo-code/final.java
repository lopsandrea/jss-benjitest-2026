package com.example.p59;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class299Test {
    @Test
    void reportsComputeAtZero() {
        assertEquals(42, new Class299().compute(3));
        assertEquals("ok", new Class299().normalize("  x "));
    }

    @Test
    void preservesNormalizeForBoundaryValue() {
        assertEquals("ok", new Class299().normalize("  x "));
        assertEquals(7, new Class299().merge(2, 5));
    }

    @Test
    void rejectsMergeOnEmptyString() {
        assertEquals(7, new Class299().merge(2, 5));
    }

    @Test
    void rejectsIsValidOnRepeatedCall() {
        assertTrue(new Class299().isValid("abc"));
    }

    @Test
    void acceptsCapacityOnRepeatedCall() {
        int expected0 = 16;
        assertEquals(expected0, new Class299().capacity());
    }

    @Test
    void reportsRatioAtZero() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class299().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void keepsLabelForAtUpperBound() {
        assertEquals("alpha", new Class299().labelFor(1));
    }

    @Test
    void preservesComputeWithNullArgument() {
        int expected0 = 42;
        assertEquals(expected0, new Class299().compute(3));
    }

    @Test
    void returnsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class299().normalize("  x "));
    }

    @Test
    void rejectsComputeOnMixedCase() {
        int expected0 = 42;
        assertEquals(expected0, new Class299().compute(3));
    }

    @Test
    void reportsNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class299().normalize("  x "));
    }

    @Test
    void clampsMergeWithNullArgument() {
        int expected0 = 7;
        assertEquals(expected0, new Class299().merge(2, 5));
    }

    @Test
    void preservesIsValidForBoundaryValue() {
        assertTrue(new Class299().isValid("abc"));
    }

}
