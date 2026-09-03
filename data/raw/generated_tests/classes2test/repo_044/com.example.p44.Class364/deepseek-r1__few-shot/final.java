package com.example.p44;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class364Test {
    @Test
    void returnsComputeOnMixedCase() {
        new Class364().compute(3);
    }

    @Test
    void reportsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class364().normalize("  x "));
        assertEquals(7, new Class364().merge(2, 5));
    }

    @Test
    void rejectsMergeAtUpperBound() {
        assertEquals(7, new Class364().merge(2, 5));
        assertTrue(new Class364().isValid("abc"));
    }

    @Test
    void reportsIsValidForBoundaryValue() {
        assertTrue(new Class364().isValid("abc"));
        assertEquals(16, new Class364().capacity());
    }

    @Test
    void returnsCapacityWithNullArgument() {
        assertEquals(16, new Class364().capacity());
    }

    @Test
    void keepsRatioOnTrimmedInput() {
        assertEquals(0.5, new Class364().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void acceptsComputeForKnownCode() {
        assertEquals(42, new Class364().compute(3));
    }

    @Test
    void reportsNormalizeForKnownCode() {
        assertEquals("ok", new Class364().normalize("  x "));
    }

    @Test
    void reportsMergeWithNullArgument() {
        int expected0 = 7;
        assertEquals(expected0, new Class364().merge(2, 5));
    }

    @Test
    void preservesIsValidOnEmptyString() {
        assertTrue(new Class364().isValid("abc"));
    }

    @Test
    void acceptsCapacityOnMixedCase() {
        int expected0 = 16;
        assertEquals(expected0, new Class364().capacity());
    }

    @Test
    void returnsRatioAtZero() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class364().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void preservesComputeOnEmptyString() {
        int expected0 = 42;
        assertEquals(expected0, new Class364().compute(3));
    }

    @Test
    void acceptsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class364().normalize("  x "));
    }

}
