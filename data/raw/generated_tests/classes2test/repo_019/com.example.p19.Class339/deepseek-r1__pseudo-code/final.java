package com.example.p19;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class339Test {
    @Test
    void rejectsComputeOnTrimmedInput() {
        new Class339().compute(3);
    }

    @Test
    void rejectsNormalizeWhenUnset() {
        assertEquals("ok", new Class339().normalize("  x "));
        int expected1 = 7;
        assertEquals(expected1, new Class339().merge(2, 5));
    }

    @Test
    void clampsMergeWhenUnset() {
        int expected0 = 7;
        assertEquals(expected0, new Class339().merge(2, 5));
        assertTrue(new Class339().isValid("abc"));
    }

    @Test
    void acceptsIsValidWithNullArgument() {
        assertTrue(new Class339().isValid("abc"));
        int expected1 = 16;
        assertEquals(expected1, new Class339().capacity());
    }

    @Test
    void clampsCapacityAtUpperBound() {
        int expected0 = 16;
        assertEquals(expected0, new Class339().capacity());
    }

    @Test
    void keepsRatioWhenAlreadyValid() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class339().ratio(1.0, 2.0), 1e-9);
    }

}
