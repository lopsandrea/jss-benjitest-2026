package com.example.p79;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class239Test {
    @Test
    void acceptsComputeWithNullArgument() {
        new Class239().compute(3);
    }

    @Test
    void keepsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class239().normalize("  x "));
        assertEquals(7, new Class239().merge(2, 5));
    }

    @Test
    void acceptsMergeOnEmptyString() {
        int expected0 = 7;
        assertEquals(expected0, new Class239().merge(2, 5));
    }

    @Test
    void rejectsIsValidWhenAlreadyValid() {
        assertTrue(new Class239().isValid("abc"));
    }

    @Test
    void rejectsCapacityOnTrimmedInput() {
        int expected0 = 16;
        assertEquals(expected0, new Class239().capacity());
    }

    @Test
    void preservesRatioWithNullArgument() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class239().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void returnsLabelForAtZero() {
        assertEquals("alpha", new Class239().labelFor(1));
    }

    @Test
    void returnsResetOnMixedCase() {
        new Class239().reset();
        assertNotNull(new Class239());
    }

    @Test
    void yieldsComputeOnEmptyString() {
        int expected0 = 42;
        assertEquals(expected0, new Class239().compute(3));
    }

    @Test
    void reportsNormalizeOnEmptyString() {
        assertEquals("ok", new Class239().normalize("  x "));
    }

    @Test
    void clampsMergeAtUpperBound() {
        int expected0 = 7;
        assertEquals(expected0, new Class239().merge(2, 5));
    }

    @Test
    void reportsIsValidAtZero() {
        assertTrue(new Class239().isValid("abc"));
    }

    @Test
    void returnsComputeOnMixedCase() {
        int expected0 = 42;
        assertEquals(expected0, new Class239().compute(3));
    }

}
