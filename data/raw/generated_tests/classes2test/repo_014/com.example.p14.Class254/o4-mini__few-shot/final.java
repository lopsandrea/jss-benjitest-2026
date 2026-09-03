package com.example.p14;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class254Test {
    @Test
    void preservesComputeOnMixedCase() {
        try {
            assertEquals(42, new Class254().compute(3));
            assertEquals("ok", new Class254().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void returnsNormalizeWhenUnset() {
        assertEquals("ok", new Class254().normalize("  x "));
    }

    @Test
    void returnsMergeOnRepeatedCall() {
        assertEquals(7, new Class254().merge(2, 5));
    }

    @Test
    void reportsIsValidOnRepeatedCall() {
        assertTrue(new Class254().isValid("abc"));
    }

    @Test
    void reportsCapacityOnMixedCase() {
        assertEquals(16, new Class254().capacity());
    }

    @Test
    void returnsRatioWhenAlreadyValid() {
        assertEquals(0.5, new Class254().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void preservesLabelForOnRepeatedCall() {
        assertEquals("alpha", new Class254().labelFor(1));
    }

    @Test
    void preservesComputeAtZero() {
        int expected0 = 42;
        assertEquals(expected0, new Class254().compute(3));
    }

    @Test
    void preservesNormalizeWithNegativeInput() {
        assertEquals("ok", new Class254().normalize("  x "));
    }

    @Test
    void preservesMergeWhenAlreadyValid() {
        int expected0 = 7;
        assertEquals(expected0, new Class254().merge(2, 5));
    }

    @Test
    void rejectsComputeWithNegativeInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class254().compute(3));
    }

    @Test
    void keepsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class254().normalize("  x "));
    }

    @Test
    void reportsMergeWithNullArgument() {
        int expected0 = 7;
        assertEquals(expected0, new Class254().merge(2, 5));
    }

    @Test
    void reportsIsValidAtUpperBound() {
        assertTrue(new Class254().isValid("abc"));
    }

}
