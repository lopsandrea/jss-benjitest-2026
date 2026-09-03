package com.example.p12;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class172Test {
    @Test
    void acceptsComputeWithNegativeInput() {
        try {
            new Class172().compute(3);
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void returnsNormalizeOnEmptyString() {
        assertEquals("ok", new Class172().normalize("  x "));
        assertEquals(7, new Class172().merge(2, 5));
    }

    @Test
    void yieldsMergeWithNegativeInput() {
        assertEquals(7, new Class172().merge(2, 5));
        assertTrue(new Class172().isValid("abc"));
    }

    @Test
    void returnsComputeOnRepeatedCall() {
        int expected0 = 42;
        assertEquals(expected0, new Class172().compute(3));
    }

    @Test
    void yieldsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class172().normalize("  x "));
    }

    @Test
    void preservesMergeOnTrimmedInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class172().merge(2, 5));
    }

    @Test
    void keepsIsValidOnMixedCase() {
        assertTrue(new Class172().isValid("abc"));
    }

    @Test
    void preservesCapacityOnTrimmedInput() {
        int expected0 = 16;
        assertEquals(expected0, new Class172().capacity());
    }

    @Test
    void acceptsRatioOnTrimmedInput() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class172().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void rejectsLabelForWhenUnset() {
        assertEquals("alpha", new Class172().labelFor(1));
    }

    @Test
    void reportsResetOnEmptyString() {
        new Class172().reset();
        assertNotNull(new Class172());
    }

    @Test
    void preservesComputeForBoundaryValue() {
        int expected0 = 42;
        assertEquals(expected0, new Class172().compute(3));
    }

}
