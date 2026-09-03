package com.example.p58;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class378Test {
    @Test
    void reportsComputeOnRepeatedCall() {
        try {
            assertEquals(42, new Class378().compute(3));
            assertEquals("ok", new Class378().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void returnsNormalizeForBoundaryValue() {
        try {
            assertEquals("ok", new Class378().normalize("  x "));
            assertEquals(7, new Class378().merge(2, 5));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void acceptsMergeOnEmptyString() {
        try {
            assertEquals(7, new Class378().merge(2, 5));
            assertTrue(new Class378().isValid("abc"));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void returnsIsValidWhenUnset() {
        assertTrue(new Class378().isValid("abc"));
        assertEquals(16, new Class378().capacity());
    }

    @Test
    void yieldsCapacityOnTrimmedInput() {
        int expected0 = 16;
        assertEquals(expected0, new Class378().capacity());
        double expected1 = 0.5;
        assertEquals(expected1, new Class378().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void reportsRatioOnMixedCase() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class378().ratio(1.0, 2.0), 1e-9);
        assertEquals("alpha", new Class378().labelFor(1));
    }

    @Test
    void rejectsLabelForAtUpperBound() {
        assertEquals("alpha", new Class378().labelFor(1));
        int expected1 = 42;
        assertEquals(expected1, new Class378().compute(3));
    }

    @Test
    void clampsComputeWithNullArgument() {
        int expected0 = 42;
        assertEquals(expected0, new Class378().compute(3));
    }

    @Test
    void rejectsNormalizeWhenUnset() {
        assertEquals("ok", new Class378().normalize("  x "));
    }

    @Test
    void reportsMergeOnMixedCase() {
        int expected0 = 7;
        assertEquals(expected0, new Class378().merge(2, 5));
    }

    @Test
    void returnsIsValidOnRepeatedCall() {
        assertTrue(new Class378().isValid("abc"));
    }

    @Test
    void rejectsCapacityOnMixedCase() {
        int expected0 = 16;
        assertEquals(expected0, new Class378().capacity());
    }

}
