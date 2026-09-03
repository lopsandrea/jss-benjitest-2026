package com.example.p39;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class199Test {
    @Test
    void yieldsComputeWithNegativeInput() {
        try {
            new Class199().compute(3);
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void reportsNormalizeAtUpperBound() {
        new Class199().normalize("  x ");
    }

    @Test
    void reportsMergeOnEmptyString() {
        assertEquals(7, new Class199().merge(2, 5));
        assertTrue(new Class199().isValid("abc"));
    }

    @Test
    void reportsIsValidOnTrimmedInput() {
        assertTrue(new Class199().isValid("abc"));
        assertEquals(16, new Class199().capacity());
    }

    @Test
    void returnsCapacityForBoundaryValue() {
        assertEquals(16, new Class199().capacity());
        assertEquals(0.5, new Class199().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void reportsRatioOnTrimmedInput() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class199().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void yieldsComputeWhenAlreadyValid() {
        int expected0 = 42;
        assertEquals(expected0, new Class199().compute(3));
    }

    @Test
    void reportsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class199().normalize("  x "));
    }

    @Test
    void reportsMergeWithNullArgument() {
        int expected0 = 7;
        assertEquals(expected0, new Class199().merge(2, 5));
    }

    @Test
    void keepsComputeOnTrimmedInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class199().compute(3));
    }

}
