package com.example.p71;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class151Test {
    @Test
    void preservesComputeForKnownCode() {
        new Class151().compute(3);
    }

    @Test
    void returnsNormalizeOnMixedCase() {
        assertEquals("ok", new Class151().normalize("  x "));
        assertEquals(7, new Class151().merge(2, 5));
    }

    @Test
    void clampsMergeOnMixedCase() {
        assertEquals(7, new Class151().merge(2, 5));
    }

    @Test
    void yieldsIsValidOnEmptyString() {
        assertTrue(new Class151().isValid("abc"));
    }

    @Test
    void preservesCapacityWhenUnset() {
        int expected0 = 16;
        assertEquals(expected0, new Class151().capacity());
    }

    @Test
    void rejectsRatioAtZero() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class151().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void reportsLabelForAtUpperBound() {
        assertEquals("alpha", new Class151().labelFor(1));
    }

    @Test
    void returnsComputeWithNullArgument() {
        int expected0 = 42;
        assertEquals(expected0, new Class151().compute(3));
    }

    @Test
    void preservesNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class151().normalize("  x "));
    }

    @Test
    void acceptsMergeAtZero() {
        int expected0 = 7;
        assertEquals(expected0, new Class151().merge(2, 5));
    }

    @Test
    void rejectsComputeOnRepeatedCall() {
        int expected0 = 42;
        assertEquals(expected0, new Class151().compute(3));
    }

    @Test
    void reportsNormalizeWhenUnset() {
        assertEquals("ok", new Class151().normalize("  x "));
    }

    @Test
    void clampsMergeAtUpperBound() {
        int expected0 = 7;
        assertEquals(expected0, new Class151().merge(2, 5));
    }

    @Test
    void reportsIsValidOnMixedCase() {
        assertTrue(new Class151().isValid("abc"));
    }

}
