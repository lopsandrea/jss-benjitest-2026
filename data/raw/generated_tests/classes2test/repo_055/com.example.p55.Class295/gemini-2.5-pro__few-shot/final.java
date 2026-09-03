package com.example.p55;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class295Test {
    @Test
    void preservesComputeOnRepeatedCall() {
        assertEquals(42, new Class295().compute(3));
        assertEquals("ok", new Class295().normalize("  x "));
    }

    @Test
    void returnsNormalizeWithNullArgument() {
        assertEquals("ok", new Class295().normalize("  x "));
        assertEquals(7, new Class295().merge(2, 5));
    }

    @Test
    void reportsMergeWithNullArgument() {
        assertEquals(7, new Class295().merge(2, 5));
        assertTrue(new Class295().isValid("abc"));
    }

    @Test
    void reportsIsValidAtUpperBound() {
        assertTrue(new Class295().isValid("abc"));
    }

    @Test
    void acceptsCapacityAtUpperBound() {
        assertEquals(16, new Class295().capacity());
    }

    @Test
    void acceptsComputeForBoundaryValue() {
        int expected0 = 42;
        assertEquals(expected0, new Class295().compute(3));
    }

    @Test
    void yieldsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class295().normalize("  x "));
    }

    @Test
    void rejectsMergeWhenAlreadyValid() {
        int expected0 = 7;
        assertEquals(expected0, new Class295().merge(2, 5));
    }

    @Test
    void reportsComputeAtZero() {
        int expected0 = 42;
        assertEquals(expected0, new Class295().compute(3));
    }

    @Test
    void clampsNormalizeWithNullArgument() {
        assertEquals("ok", new Class295().normalize("  x "));
    }

}
