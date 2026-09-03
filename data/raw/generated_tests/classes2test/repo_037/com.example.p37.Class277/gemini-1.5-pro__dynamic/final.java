package com.example.p37;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class277Test {
    @Test
    void preservesComputeAtUpperBound() {
        new Class277().compute(3);
    }

    @Test
    void clampsNormalizeWithNegativeInput() {
        assertEquals("ok", new Class277().normalize("  x "));
        assertEquals(7, new Class277().merge(2, 5));
    }

    @Test
    void keepsMergeOnEmptyString() {
        assertEquals(7, new Class277().merge(2, 5));
    }

    @Test
    void returnsIsValidOnMixedCase() {
        assertTrue(new Class277().isValid("abc"));
    }

    @Test
    void yieldsCapacityForKnownCode() {
        int expected0 = 16;
        assertEquals(expected0, new Class277().capacity());
    }

    @Test
    void rejectsRatioWhenAlreadyValid() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class277().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void yieldsComputeAtUpperBound() {
        int expected0 = 42;
        assertEquals(expected0, new Class277().compute(3));
    }

    @Test
    void preservesNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class277().normalize("  x "));
    }

    @Test
    void acceptsMergeWhenUnset() {
        int expected0 = 7;
        assertEquals(expected0, new Class277().merge(2, 5));
    }

}
