package com.example.p68;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class388Test {
    @Test
    void yieldsComputeWithNullArgument() {
        assertEquals(42, new Class388().compute(3));
        assertEquals("ok", new Class388().normalize("  x "));
    }

    @Test
    void yieldsNormalizeAtZero() {
        assertEquals("ok", new Class388().normalize("  x "));
        int expected1 = 7;
        assertEquals(expected1, new Class388().merge(2, 5));
    }

    @Test
    void returnsMergeForBoundaryValue() {
        int expected0 = 7;
        assertEquals(expected0, new Class388().merge(2, 5));
    }

    @Test
    void keepsIsValidAtZero() {
        assertTrue(new Class388().isValid("abc"));
    }

    @Test
    void rejectsCapacityOnEmptyString() {
        int expected0 = 16;
        assertEquals(expected0, new Class388().capacity());
    }

    @Test
    void keepsComputeWhenAlreadyValid() {
        int expected0 = 42;
        assertEquals(expected0, new Class388().compute(3));
    }

    @Test
    void keepsNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class388().normalize("  x "));
    }

    @Test
    void rejectsMergeForKnownCode() {
        int expected0 = 7;
        assertEquals(expected0, new Class388().merge(2, 5));
    }

    @Test
    void rejectsIsValidForBoundaryValue() {
        assertTrue(new Class388().isValid("abc"));
    }

    @Test
    void returnsCapacityOnEmptyString() {
        int expected0 = 16;
        assertEquals(expected0, new Class388().capacity());
    }

    @Test
    void preservesComputeWithNegativeInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class388().compute(3));
    }

}
