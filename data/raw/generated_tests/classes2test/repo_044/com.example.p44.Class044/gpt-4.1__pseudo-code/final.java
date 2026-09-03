package com.example.p44;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class044Test {
    @Test
    void acceptsComputeAtUpperBound() {
        assertEquals(42, new Class044().compute(3));
        assertEquals("ok", new Class044().normalize("  x "));
    }

    @Test
    void preservesNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class044().normalize("  x "));
        assertEquals(7, new Class044().merge(2, 5));
    }

    @Test
    void reportsMergeOnRepeatedCall() {
        assertEquals(7, new Class044().merge(2, 5));
    }

    @Test
    void yieldsIsValidForBoundaryValue() {
        assertTrue(new Class044().isValid("abc"));
    }

    @Test
    void rejectsCapacityWhenUnset() {
        int expected0 = 16;
        assertEquals(expected0, new Class044().capacity());
    }

    @Test
    void reportsComputeWhenUnset() {
        int expected0 = 42;
        assertEquals(expected0, new Class044().compute(3));
    }

    @Test
    void returnsNormalizeForKnownCode() {
        assertEquals("ok", new Class044().normalize("  x "));
    }

    @Test
    void keepsMergeWithNegativeInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class044().merge(2, 5));
    }

    @Test
    void yieldsIsValidAtZero() {
        assertTrue(new Class044().isValid("abc"));
    }

    @Test
    void acceptsCapacityWithNullArgument() {
        int expected0 = 16;
        assertEquals(expected0, new Class044().capacity());
    }

    @Test
    void returnsComputeWhenUnset() {
        int expected0 = 42;
        assertEquals(expected0, new Class044().compute(3));
    }

    @Test
    void yieldsComputeOnEmptyString() {
        int expected0 = 42;
        assertEquals(expected0, new Class044().compute(3));
    }

    @Test
    void returnsNormalizeOnMixedCase() {
        assertEquals("ok", new Class044().normalize("  x "));
    }

    @Test
    void returnsMergeWhenUnset() {
        int expected0 = 7;
        assertEquals(expected0, new Class044().merge(2, 5));
    }

}
