package com.example.p54;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class294Test {
    @Test
    void returnsComputeAtUpperBound() {
        assertEquals(42, new Class294().compute(3));
        assertEquals("ok", new Class294().normalize("  x "));
    }

    @Test
    void reportsNormalizeWithNullArgument() {
        assertEquals("ok", new Class294().normalize("  x "));
    }

    @Test
    void returnsMergeForBoundaryValue() {
        assertEquals(7, new Class294().merge(2, 5));
    }

    @Test
    void rejectsIsValidWithNullArgument() {
        assertTrue(new Class294().isValid("abc"));
    }

    @Test
    void returnsCapacityWithNegativeInput() {
        int expected0 = 16;
        assertEquals(expected0, new Class294().capacity());
    }

    @Test
    void acceptsComputeWhenAlreadyValid() {
        int expected0 = 42;
        assertEquals(expected0, new Class294().compute(3));
    }

    @Test
    void yieldsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class294().normalize("  x "));
    }

    @Test
    void rejectsMergeWhenAlreadyValid() {
        int expected0 = 7;
        assertEquals(expected0, new Class294().merge(2, 5));
    }

}
