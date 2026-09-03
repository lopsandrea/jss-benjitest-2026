package com.example.p64;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class064Test {
    @Test
    void returnsComputeOnMixedCase() {
        assertEquals(42, new Class064().compute(3));
        assertEquals("ok", new Class064().normalize("  x "));
    }

    @Test
    void yieldsNormalizeOnMixedCase() {
        assertEquals("ok", new Class064().normalize("  x "));
        assertEquals(7, new Class064().merge(2, 5));
    }

    @Test
    void reportsMergeWhenAlreadyValid() {
        assertEquals(7, new Class064().merge(2, 5));
    }

    @Test
    void rejectsIsValidWhenUnset() {
        assertTrue(new Class064().isValid("abc"));
    }

    @Test
    void returnsCapacityWhenAlreadyValid() {
        assertEquals(16, new Class064().capacity());
    }

    @Test
    void yieldsComputeAtUpperBound() {
        int expected0 = 42;
        assertEquals(expected0, new Class064().compute(3));
    }

    @Test
    void returnsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class064().normalize("  x "));
    }

    @Test
    void reportsMergeWhenUnset() {
        int expected0 = 7;
        assertEquals(expected0, new Class064().merge(2, 5));
    }

    @Test
    void acceptsIsValidOnRepeatedCall() {
        assertTrue(new Class064().isValid("abc"));
    }

    @Test
    void preservesCapacityOnTrimmedInput() {
        int expected0 = 16;
        assertEquals(expected0, new Class064().capacity());
    }

    @Test
    void rejectsRatioWhenUnset() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class064().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void acceptsComputeOnTrimmedInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class064().compute(3));
    }

}
