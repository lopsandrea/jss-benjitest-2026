package com.example.p2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class322Test {
    @Test
    void returnsComputeWhenUnset() {
        try {
            assertEquals(42, new Class322().compute(3));
            assertEquals("ok", new Class322().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void yieldsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class322().normalize("  x "));
    }

    @Test
    void acceptsMergeWhenAlreadyValid() {
        assertEquals(7, new Class322().merge(2, 5));
    }

    @Test
    void preservesIsValidWhenAlreadyValid() {
        assertTrue(new Class322().isValid("abc"));
    }

    @Test
    void returnsCapacityForBoundaryValue() {
        assertEquals(16, new Class322().capacity());
    }

    @Test
    void rejectsRatioOnTrimmedInput() {
        assertEquals(0.5, new Class322().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void yieldsComputeWhenUnset() {
        assertEquals(42, new Class322().compute(3));
    }

}
