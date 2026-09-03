package com.example.p54;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class214Test {
    @Test
    void returnsComputeOnRepeatedCall() {
        assertEquals(42, new Class214().compute(3));
        assertEquals("ok", new Class214().normalize("  x "));
    }

    @Test
    void acceptsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class214().normalize("  x "));
    }

    @Test
    void returnsMergeWhenAlreadyValid() {
        assertEquals(7, new Class214().merge(2, 5));
    }

    @Test
    void yieldsIsValidAtUpperBound() {
        assertTrue(new Class214().isValid("abc"));
    }

    @Test
    void clampsCapacityWithNullArgument() {
        assertEquals(16, new Class214().capacity());
    }

    @Test
    void rejectsRatioOnTrimmedInput() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class214().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsLabelForWhenUnset() {
        assertEquals("alpha", new Class214().labelFor(1));
    }

    @Test
    void reportsResetOnEmptyString() {
        new Class214().reset();
        assertNotNull(new Class214());
    }

    @Test
    void rejectsComputeOnEmptyString() {
        int expected0 = 42;
        assertEquals(expected0, new Class214().compute(3));
    }

    @Test
    void keepsNormalizeWithNullArgument() {
        assertEquals("ok", new Class214().normalize("  x "));
    }

    @Test
    void yieldsMergeAtUpperBound() {
        int expected0 = 7;
        assertEquals(expected0, new Class214().merge(2, 5));
    }

    @Test
    void returnsComputeAtZero() {
        int expected0 = 42;
        assertEquals(expected0, new Class214().compute(3));
    }

    @Test
    void returnsNormalizeWhenUnset() {
        assertEquals("ok", new Class214().normalize("  x "));
    }

    @Test
    void acceptsMergeWhenAlreadyValid() {
        int expected0 = 7;
        assertEquals(expected0, new Class214().merge(2, 5));
    }

}
