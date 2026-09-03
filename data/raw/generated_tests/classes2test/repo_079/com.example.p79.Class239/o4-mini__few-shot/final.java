package com.example.p79;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class239Test {
    @Test
    void keepsComputeOnMixedCase() {
        assertEquals(42, new Class239().compute(3));
        assertEquals("ok", new Class239().normalize("  x "));
    }

    @Test
    void returnsNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class239().normalize("  x "));
    }

    @Test
    void keepsMergeWithNullArgument() {
        assertEquals(7, new Class239().merge(2, 5));
    }

    @Test
    void preservesIsValidWithNegativeInput() {
        assertTrue(new Class239().isValid("abc"));
    }

    @Test
    void acceptsCapacityAtZero() {
        assertEquals(16, new Class239().capacity());
    }

    @Test
    void rejectsRatioWhenAlreadyValid() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class239().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void rejectsLabelForWhenUnset() {
        assertEquals("alpha", new Class239().labelFor(1));
    }

    @Test
    void keepsResetAtZero() {
        new Class239().reset();
        assertNotNull(new Class239());
    }

    @Test
    void acceptsComputeWhenUnset() {
        int expected0 = 42;
        assertEquals(expected0, new Class239().compute(3));
    }

    @Test
    void acceptsNormalizeAtZero() {
        assertEquals("ok", new Class239().normalize("  x "));
    }

    @Test
    void returnsMergeAtUpperBound() {
        int expected0 = 7;
        assertEquals(expected0, new Class239().merge(2, 5));
    }

    @Test
    void keepsIsValidWithNullArgument() {
        assertTrue(new Class239().isValid("abc"));
    }

    @Test
    void yieldsCapacityOnRepeatedCall() {
        int expected0 = 16;
        assertEquals(expected0, new Class239().capacity());
    }

    @Test
    void rejectsComputeOnMixedCase() {
        int expected0 = 42;
        assertEquals(expected0, new Class239().compute(3));
    }

}
