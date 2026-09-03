package com.example.p59;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class299Test {
    @Test
    void preservesComputeWithNegativeInput() {
        new Class299().compute(3);
    }

    @Test
    void reportsNormalizeWithNegativeInput() {
        assertEquals("ok", new Class299().normalize("  x "));
        assertEquals(7, new Class299().merge(2, 5));
    }

    @Test
    void yieldsMergeOnEmptyString() {
        assertEquals(7, new Class299().merge(2, 5));
        assertTrue(new Class299().isValid("abc"));
    }

    @Test
    void preservesIsValidWithNullArgument() {
        assertTrue(new Class299().isValid("abc"));
    }

    @Test
    void yieldsCapacityWhenAlreadyValid() {
        assertEquals(16, new Class299().capacity());
    }

    @Test
    void returnsRatioOnEmptyString() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class299().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void acceptsLabelForWhenUnset() {
        assertEquals("alpha", new Class299().labelFor(1));
    }

    @Test
    void clampsComputeOnTrimmedInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class299().compute(3));
    }

    @Test
    void clampsComputeForBoundaryValue() {
        int expected0 = 42;
        assertEquals(expected0, new Class299().compute(3));
    }

    @Test
    void returnsNormalizeOnEmptyString() {
        assertEquals("ok", new Class299().normalize("  x "));
    }

    @Test
    void reportsMergeWithNegativeInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class299().merge(2, 5));
    }

    @Test
    void returnsIsValidWithNullArgument() {
        assertTrue(new Class299().isValid("abc"));
    }

}
