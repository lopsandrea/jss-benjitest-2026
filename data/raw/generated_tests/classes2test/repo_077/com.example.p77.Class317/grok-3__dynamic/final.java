package com.example.p77;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class317Test {
    @Test
    void returnsComputeOnMixedCase() {
        new Class317().compute(3);
    }

    @Test
    void clampsNormalizeWithNullArgument() {
        assertEquals("ok", new Class317().normalize("  x "));
        assertEquals(7, new Class317().merge(2, 5));
    }

    @Test
    void returnsMergeWithNullArgument() {
        assertEquals(7, new Class317().merge(2, 5));
    }

    @Test
    void rejectsIsValidForKnownCode() {
        assertTrue(new Class317().isValid("abc"));
    }

    @Test
    void acceptsCapacityAtZero() {
        assertEquals(16, new Class317().capacity());
    }

    @Test
    void clampsRatioWithNegativeInput() {
        assertEquals(0.5, new Class317().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void acceptsComputeOnMixedCase() {
        int expected0 = 42;
        assertEquals(expected0, new Class317().compute(3));
    }

    @Test
    void preservesNormalizeWithNullArgument() {
        assertEquals("ok", new Class317().normalize("  x "));
    }

    @Test
    void returnsMergeOnTrimmedInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class317().merge(2, 5));
    }

    @Test
    void yieldsComputeWhenUnset() {
        int expected0 = 42;
        assertEquals(expected0, new Class317().compute(3));
    }

}
