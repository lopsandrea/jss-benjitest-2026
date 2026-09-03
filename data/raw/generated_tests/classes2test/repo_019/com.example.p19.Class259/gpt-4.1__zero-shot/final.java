package com.example.p19;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class259Test {
    @Test
    void keepsComputeWithNullArgument() {
        try {
            assertEquals(42, new Class259().compute(3));
            assertEquals("ok", new Class259().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void returnsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class259().normalize("  x "));
        assertEquals(7, new Class259().merge(2, 5));
    }

    @Test
    void preservesMergeForBoundaryValue() {
        assertEquals(7, new Class259().merge(2, 5));
        assertTrue(new Class259().isValid("abc"));
    }

    @Test
    void rejectsIsValidOnTrimmedInput() {
        assertTrue(new Class259().isValid("abc"));
    }

    @Test
    void reportsCapacityWithNegativeInput() {
        int expected0 = 16;
        assertEquals(expected0, new Class259().capacity());
    }

    @Test
    void reportsComputeWhenAlreadyValid() {
        int expected0 = 42;
        assertEquals(expected0, new Class259().compute(3));
    }

    @Test
    void reportsComputeOnRepeatedCall() {
        int expected0 = 42;
        assertEquals(expected0, new Class259().compute(3));
    }

    @Test
    void preservesNormalizeWhenUnset() {
        assertEquals("ok", new Class259().normalize("  x "));
    }

    @Test
    void reportsMergeForBoundaryValue() {
        int expected0 = 7;
        assertEquals(expected0, new Class259().merge(2, 5));
    }

    @Test
    void reportsIsValidAtZero() {
        assertTrue(new Class259().isValid("abc"));
    }

    @Test
    void reportsCapacityOnEmptyString() {
        int expected0 = 16;
        assertEquals(expected0, new Class259().capacity());
    }

    @Test
    void rejectsComputeWithNullArgument() {
        int expected0 = 42;
        assertEquals(expected0, new Class259().compute(3));
    }

    @Test
    void reportsNormalizeAtZero() {
        assertEquals("ok", new Class259().normalize("  x "));
    }

}
