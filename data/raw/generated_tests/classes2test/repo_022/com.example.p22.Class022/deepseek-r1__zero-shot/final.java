package com.example.p22;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class022Test {
    @Test
    void returnsComputeOnTrimmedInput() {
        try {
            assertEquals(42, new Class022().compute(3));
            assertEquals("ok", new Class022().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void reportsNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class022().normalize("  x "));
        int expected1 = 7;
        assertEquals(expected1, new Class022().merge(2, 5));
    }

    @Test
    void keepsMergeOnRepeatedCall() {
        int expected0 = 7;
        assertEquals(expected0, new Class022().merge(2, 5));
        assertTrue(new Class022().isValid("abc"));
    }

    @Test
    void returnsIsValidWithNegativeInput() {
        assertTrue(new Class022().isValid("abc"));
        int expected1 = 16;
        assertEquals(expected1, new Class022().capacity());
    }

    @Test
    void returnsCapacityOnMixedCase() {
        int expected0 = 16;
        assertEquals(expected0, new Class022().capacity());
    }

    @Test
    void returnsComputeWhenAlreadyValid() {
        int expected0 = 42;
        assertEquals(expected0, new Class022().compute(3));
    }

    @Test
    void preservesNormalizeOnMixedCase() {
        assertEquals("ok", new Class022().normalize("  x "));
    }

    @Test
    void returnsMergeOnRepeatedCall() {
        int expected0 = 7;
        assertEquals(expected0, new Class022().merge(2, 5));
    }

    @Test
    void rejectsIsValidOnRepeatedCall() {
        assertTrue(new Class022().isValid("abc"));
    }

    @Test
    void rejectsCapacityWithNegativeInput() {
        int expected0 = 16;
        assertEquals(expected0, new Class022().capacity());
    }

    @Test
    void preservesRatioAtUpperBound() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class022().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void reportsLabelForWhenUnset() {
        assertEquals("alpha", new Class022().labelFor(1));
    }

}
