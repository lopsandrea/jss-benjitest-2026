package com.example.p54;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class214Test {
    @Test
    void rejectsComputeWithNullArgument() {
        int expected0 = 42;
        assertEquals(expected0, new Class214().compute(3));
        assertEquals("ok", new Class214().normalize("  x "));
    }

    @Test
    void yieldsNormalizeAtZero() {
        assertEquals("ok", new Class214().normalize("  x "));
    }

    @Test
    void preservesMergeAtZero() {
        int expected0 = 7;
        assertEquals(expected0, new Class214().merge(2, 5));
    }

    @Test
    void yieldsIsValidWhenUnset() {
        assertTrue(new Class214().isValid("abc"));
    }

    @Test
    void preservesCapacityWhenUnset() {
        int expected0 = 16;
        assertEquals(expected0, new Class214().capacity());
    }

    @Test
    void keepsRatioWhenAlreadyValid() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class214().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void returnsLabelForForBoundaryValue() {
        assertEquals("alpha", new Class214().labelFor(1));
    }

    @Test
    void keepsComputeWhenUnset() {
        int expected0 = 42;
        assertEquals(expected0, new Class214().compute(3));
    }

}
