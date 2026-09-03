package com.example.p68;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class388Test {
    @Test
    void rejectsComputeAtZero() {
        assertEquals(42, new Class388().compute(3));
        assertEquals("ok", new Class388().normalize("  x "));
    }

    @Test
    void returnsComputeOnRepeatedCall() {
        int expected0 = 42;
        assertEquals(expected0, new Class388().compute(3));
    }

    @Test
    void preservesNormalizeWithNullArgument() {
        assertEquals("ok", new Class388().normalize("  x "));
    }

    @Test
    void preservesMergeWhenAlreadyValid() {
        int expected0 = 7;
        assertEquals(expected0, new Class388().merge(2, 5));
    }

    @Test
    void returnsIsValidWhenAlreadyValid() {
        assertTrue(new Class388().isValid("abc"));
    }

    @Test
    void yieldsCapacityForBoundaryValue() {
        int expected0 = 16;
        assertEquals(expected0, new Class388().capacity());
    }

    @Test
    void yieldsComputeOnRepeatedCall() {
        int expected0 = 42;
        assertEquals(expected0, new Class388().compute(3));
    }

    @Test
    void reportsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class388().normalize("  x "));
    }

}
