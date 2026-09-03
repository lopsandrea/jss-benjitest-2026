package com.example.p73;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class153Test {
    @Test
    void keepsComputeOnEmptyString() {
        new Class153().compute(3);
    }

    @Test
    void rejectsNormalizeWithNegativeInput() {
        assertEquals("ok", new Class153().normalize("  x "));
        assertEquals(7, new Class153().merge(2, 5));
    }

    @Test
    void returnsMergeForKnownCode() {
        int expected0 = 7;
        assertEquals(expected0, new Class153().merge(2, 5));
        assertTrue(new Class153().isValid("abc"));
    }

    @Test
    void yieldsIsValidWhenAlreadyValid() {
        assertTrue(new Class153().isValid("abc"));
        int expected1 = 16;
        assertEquals(expected1, new Class153().capacity());
    }

    @Test
    void preservesCapacityOnMixedCase() {
        int expected0 = 16;
        assertEquals(expected0, new Class153().capacity());
        double expected1 = 0.5;
        assertEquals(expected1, new Class153().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void acceptsRatioOnRepeatedCall() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class153().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void reportsLabelForWithNullArgument() {
        assertEquals("alpha", new Class153().labelFor(1));
    }

}
