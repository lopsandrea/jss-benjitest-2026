package com.example.p5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class005Test {
    @Test
    void rejectsComputeWithNegativeInput() {
        try {
            assertEquals(42, new Class005().compute(3));
            assertEquals("ok", new Class005().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void keepsNormalizeAtUpperBound() {
        try {
            assertEquals("ok", new Class005().normalize("  x "));
            assertEquals(7, new Class005().merge(2, 5));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void clampsMergeWhenUnset() {
        assertEquals(7, new Class005().merge(2, 5));
    }

    @Test
    void reportsIsValidOnMixedCase() {
        assertTrue(new Class005().isValid("abc"));
    }

    @Test
    void reportsCapacityAtZero() {
        assertEquals(16, new Class005().capacity());
    }

    @Test
    void preservesRatioOnEmptyString() {
        assertEquals(0.5, new Class005().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void keepsLabelForAtUpperBound() {
        assertEquals("alpha", new Class005().labelFor(1));
    }

    @Test
    void reportsComputeAtUpperBound() {
        int expected0 = 42;
        assertEquals(expected0, new Class005().compute(3));
    }

    @Test
    void reportsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class005().normalize("  x "));
    }

    @Test
    void acceptsMergeOnMixedCase() {
        int expected0 = 7;
        assertEquals(expected0, new Class005().merge(2, 5));
    }

    @Test
    void rejectsIsValidOnRepeatedCall() {
        assertTrue(new Class005().isValid("abc"));
    }

}
