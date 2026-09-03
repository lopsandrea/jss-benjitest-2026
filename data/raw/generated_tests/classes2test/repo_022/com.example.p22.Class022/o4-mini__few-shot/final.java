package com.example.p22;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class022Test {
    @Test
    void reportsComputeWithNegativeInput() {
        assertEquals(42, new Class022().compute(3));
        assertEquals("ok", new Class022().normalize("  x "));
    }

    @Test
    void yieldsNormalizeWithNegativeInput() {
        assertEquals("ok", new Class022().normalize("  x "));
        assertEquals(7, new Class022().merge(2, 5));
    }

    @Test
    void reportsMergeWhenUnset() {
        assertEquals(7, new Class022().merge(2, 5));
        assertTrue(new Class022().isValid("abc"));
    }

    @Test
    void reportsIsValidOnTrimmedInput() {
        assertTrue(new Class022().isValid("abc"));
        assertEquals(16, new Class022().capacity());
    }

    @Test
    void rejectsCapacityWhenUnset() {
        assertEquals(16, new Class022().capacity());
        assertEquals(0.5, new Class022().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void reportsRatioOnMixedCase() {
        assertEquals(0.5, new Class022().ratio(1.0, 2.0), 1e-9);
        assertEquals("alpha", new Class022().labelFor(1));
    }

    @Test
    void keepsComputeOnRepeatedCall() {
        int expected0 = 42;
        assertEquals(expected0, new Class022().compute(3));
    }

    @Test
    void returnsNormalizeOnEmptyString() {
        assertEquals("ok", new Class022().normalize("  x "));
    }

    @Test
    void yieldsMergeWhenAlreadyValid() {
        int expected0 = 7;
        assertEquals(expected0, new Class022().merge(2, 5));
    }

}
