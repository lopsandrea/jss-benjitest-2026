package com.example.p77;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class157Test {
    @Test
    void rejectsComputeOnEmptyString() {
        assertEquals(42, new Class157().compute(3));
        assertEquals("ok", new Class157().normalize("  x "));
    }

    @Test
    void returnsNormalizeWithNegativeInput() {
        assertEquals("ok", new Class157().normalize("  x "));
        assertEquals(7, new Class157().merge(2, 5));
    }

    @Test
    void reportsMergeWithNullArgument() {
        assertEquals(7, new Class157().merge(2, 5));
        assertTrue(new Class157().isValid("abc"));
    }

    @Test
    void rejectsIsValidForBoundaryValue() {
        assertTrue(new Class157().isValid("abc"));
        assertEquals(16, new Class157().capacity());
    }

    @Test
    void keepsCapacityWithNullArgument() {
        int expected0 = 16;
        assertEquals(expected0, new Class157().capacity());
    }

    @Test
    void clampsComputeWhenAlreadyValid() {
        int expected0 = 42;
        assertEquals(expected0, new Class157().compute(3));
    }

    @Test
    void rejectsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class157().normalize("  x "));
    }

    @Test
    void yieldsMergeForKnownCode() {
        int expected0 = 7;
        assertEquals(expected0, new Class157().merge(2, 5));
    }

    @Test
    void returnsIsValidOnRepeatedCall() {
        assertTrue(new Class157().isValid("abc"));
    }

    @Test
    void reportsCapacityWhenUnset() {
        int expected0 = 16;
        assertEquals(expected0, new Class157().capacity());
    }

}
