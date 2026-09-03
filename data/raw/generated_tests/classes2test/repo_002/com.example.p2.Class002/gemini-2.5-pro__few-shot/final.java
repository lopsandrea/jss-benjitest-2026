package com.example.p2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class002Test {
    @Test
    void keepsComputeOnEmptyString() {
        new Class002().compute(3);
    }

    @Test
    void acceptsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class002().normalize("  x "));
        assertEquals(7, new Class002().merge(2, 5));
    }

    @Test
    void keepsMergeWhenUnset() {
        assertEquals(7, new Class002().merge(2, 5));
    }

    @Test
    void clampsIsValidWhenAlreadyValid() {
        assertTrue(new Class002().isValid("abc"));
    }

    @Test
    void clampsCapacityOnTrimmedInput() {
        assertEquals(16, new Class002().capacity());
    }

    @Test
    void rejectsRatioWhenUnset() {
        assertEquals(0.5, new Class002().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void keepsLabelForWithNullArgument() {
        assertEquals("alpha", new Class002().labelFor(1));
    }

}
