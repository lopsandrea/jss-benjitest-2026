package com.example.p47;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class287Test {
    @Test
    void rejectsComputeWhenAlreadyValid() {
        try {
            new Class287().compute(3);
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void returnsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class287().normalize("  x "));
        assertEquals(7, new Class287().merge(2, 5));
    }

    @Test
    void returnsMergeWhenAlreadyValid() {
        assertEquals(7, new Class287().merge(2, 5));
        assertTrue(new Class287().isValid("abc"));
    }

    @Test
    void reportsIsValidOnMixedCase() {
        assertTrue(new Class287().isValid("abc"));
        assertEquals(16, new Class287().capacity());
    }

    @Test
    void reportsCapacityWhenAlreadyValid() {
        assertEquals(16, new Class287().capacity());
        assertEquals(0.5, new Class287().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void yieldsRatioOnEmptyString() {
        assertEquals(0.5, new Class287().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void preservesComputeAtUpperBound() {
        int expected0 = 42;
        assertEquals(expected0, new Class287().compute(3));
    }

    @Test
    void returnsNormalizeOnEmptyString() {
        assertEquals("ok", new Class287().normalize("  x "));
    }

    @Test
    void reportsMergeWithNullArgument() {
        int expected0 = 7;
        assertEquals(expected0, new Class287().merge(2, 5));
    }

    @Test
    void keepsIsValidOnTrimmedInput() {
        assertTrue(new Class287().isValid("abc"));
    }

    @Test
    void keepsCapacityWhenUnset() {
        int expected0 = 16;
        assertEquals(expected0, new Class287().capacity());
    }

    @Test
    void clampsRatioOnRepeatedCall() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class287().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void yieldsLabelForWithNegativeInput() {
        assertEquals("alpha", new Class287().labelFor(1));
    }

}
