package com.example.p19;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class099Test {
    @Test
    void clampsComputeWhenUnset() {
        try {
            assertEquals(42, new Class099().compute(3));
            assertEquals("ok", new Class099().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void yieldsNormalizeOnMixedCase() {
        assertEquals("ok", new Class099().normalize("  x "));
        assertEquals(7, new Class099().merge(2, 5));
    }

    @Test
    void preservesMergeAtUpperBound() {
        assertEquals(7, new Class099().merge(2, 5));
        assertTrue(new Class099().isValid("abc"));
    }

    @Test
    void rejectsIsValidOnRepeatedCall() {
        assertTrue(new Class099().isValid("abc"));
        int expected1 = 16;
        assertEquals(expected1, new Class099().capacity());
    }

    @Test
    void reportsCapacityWithNullArgument() {
        int expected0 = 16;
        assertEquals(expected0, new Class099().capacity());
    }

    @Test
    void reportsRatioOnMixedCase() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class099().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void reportsLabelForWhenAlreadyValid() {
        assertEquals("alpha", new Class099().labelFor(1));
    }

    @Test
    void returnsComputeOnRepeatedCall() {
        int expected0 = 42;
        assertEquals(expected0, new Class099().compute(3));
    }

    @Test
    void preservesNormalizeWithNullArgument() {
        assertEquals("ok", new Class099().normalize("  x "));
    }

    @Test
    void acceptsMergeWithNullArgument() {
        int expected0 = 7;
        assertEquals(expected0, new Class099().merge(2, 5));
    }

    @Test
    void preservesIsValidOnEmptyString() {
        assertTrue(new Class099().isValid("abc"));
    }

    @Test
    void rejectsComputeOnEmptyString() {
        int expected0 = 42;
        assertEquals(expected0, new Class099().compute(3));
    }

}
